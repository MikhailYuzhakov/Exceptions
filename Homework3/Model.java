import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Model {
    private PersonBuilder pBuilder;
    private Person p;

    public Model() {
        pBuilder = new PersonBuilder();
    }
    //Sidorov Ivan Sergeevich 10.12.1983 89996193313 m
    public void processingInputData(String inputData) {
        String[] fields = inputData.split(" ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");
        ArrayList<String> FIO = new ArrayList<>();

        //проверка не требуется, т.к. проверка выполняется внутри PersonBuilder
        // if (fields.length < 6) {
        //     throw new FillPersonFieldException("Не все поля заполнены");
        // }

        if (fields.length > 6) {
            throw new FillPersonFieldException("Введено больше данных, чем требовалось"); 
        }

        for (String field : fields) {
            if (field.matches("[0-9]+") && field.length() == 11) {
                pBuilder.setPhonenumber(field);
            } else {
                if (field.contains(".")) {
                    try {
                        formatter.parse(field); //проверяем соответсвие формату даты (выкинет Exception)
                        pBuilder.setBirthDate(field);
                    } catch (ParseException e) {
                        throw new FillPersonFieldException("Неверный формат даты рождения");
                    }
                } else {
                    if (field.equals("m") || field.equals("f")) {
                        pBuilder.setSex(field);
                    } else {
                        FIO.add(field);
                    }
                }
            }
        }
        p = pBuilder.setFirstname(FIO.get(0)).setLastname(FIO.get(1)).setPatronymic(FIO.get(2)).createPerson();
    }

    public String getPersonInfo() {
        return p.toString();
    }

    public void writeToFile() {
        p.writeToFile();
    }
}
