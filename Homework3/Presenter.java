
public class Presenter {
    View v;
    Model m;

    public Presenter(Model m, View v) {
        this.m = m;
        this.v = v;
    }

    public void getDataFromUserBtn() {
        m.processingInputData(v.getDataFromTerminal());
    }

    public void getInfoBtn() {
        v.printPersonInfo(m.getPersonInfo());
    }

    public void writeToFileBtn() {
        m.writeToFile();
    }
}
