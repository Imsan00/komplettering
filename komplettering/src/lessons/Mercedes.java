package lessons;

public class Mercedes extends Cars {

    public Mercedes(){
        super.name = "Mercedes";
    }
    @Override
    void model() {
        System.out.println("Cls AMG");
    }

    @Override
    void year() {
        System.out.println("2020");
    }

    @Override
    void price() {
        System.out.println("900 000 kr");
    }
}
