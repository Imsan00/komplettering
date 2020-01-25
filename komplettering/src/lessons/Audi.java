package lessons;

public class Audi extends Cars {
    public Audi(){
        super.name = "audi";
    }
    @Override
    void model() {
        System.out.println("rs6");
    }

    @Override
    void year() {
        System.out.println("2020");
    }

    @Override
    void price() {
        System.out.println("1 600 000 kr");
    }
}
