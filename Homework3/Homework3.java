
public class Homework3 {

    public static void main(String[] args) {
        Presenter p = new Presenter(new Model(),new View());
        p.getDataFromUserBtn();
        p.getInfoBtn();
        p.writeToFileBtn();
    }
}