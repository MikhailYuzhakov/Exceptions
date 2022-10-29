import java.util.Scanner;

public class View {
    public View() {
        super();
    }    

    //Ivan Sidorov Sergeevich 10.12.1983 89996193313 m
    public String getDataFromTerminal() {
        String myString;
        try (Scanner in = new Scanner(System.in)) {
            myString = in.nextLine();   
        }
        return myString;
    }

    public void printPersonInfo(String info) {
        System.out.println(info);
    }
}
