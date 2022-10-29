

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private ArrayList<String> fields;

    public Person(String firstname, String lastname, String patronymic, String birthdate, String phonenumber, String sex) {
        fields = new ArrayList<>();
        fields.add(firstname);
        fields.add(lastname);
        fields.add(patronymic);
        fields.add(birthdate);
        fields.add(phonenumber);
        fields.add(sex);
    }

    private String getAttribute(Integer index) {
        try {
            return fields.get(index);
        } catch (NullPointerException e) {
            throw new NullPointerException("Запрашиваемго аттрибута не существует");
        }
    }

    public String getFirstName() {
        return getAttribute(0);
    }

    public String getLastName() {
        return getAttribute(1);
    }

    public String getPatronymic() {
        return getAttribute(2);
    }

    public String getBirthdate() {
        return getAttribute(3);
    }

    public String getPhonenumber() {
        return getAttribute(4);
    }

    public String getSex() {
        return getAttribute(5);
    }

    public void writeToFile() {
        String result = "";
        File file = new File(getFirstName() + ".txt");
        
        try (FileReader fr = new FileReader(file)) {
            try (Scanner scan = new Scanner(fr)) {
                while (scan.hasNextLine()) {
                    result += scan.nextLine(); 
                    result += "\n";
                }
               
            }
        } catch (FileNotFoundException e) {
            try (FileWriter fw = new FileWriter(file)) {
                for (String item : fields) {
                    fw.append(item + " ");
                }
                fw.append("\n");
            } catch (IOException e2) {
                e.printStackTrace();
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(file)) {
            fw.append(result);
            for (String item : fields) {
                fw.append(item + " ");
            }
            fw.append("\n");
        } catch (IOException e3) {
            e3.printStackTrace();
        }

    }

    /**
     * Проверка наличия всех полей класса Person
     * @return
     */
    public Boolean doQualityCheck() {
        switch (fields.indexOf(null)) {
            case 0:
                throw new FillPersonFieldException("Отсутствует имя");
            case 1:
                throw new FillPersonFieldException("Отсутствует фамилия");
            case 2:
                throw new FillPersonFieldException("Отсутствует отчество");
            case 3:
                throw new FillPersonFieldException("Отсутствует дата рождения");
            case 4:
                throw new FillPersonFieldException("Отсутствует номер телефона");
            case 5:
                throw new FillPersonFieldException("Отсутствует пол");
            default:
                return true;
        }
    }

    @Override
    public String toString() {
        return fields.toString();
    }
}
