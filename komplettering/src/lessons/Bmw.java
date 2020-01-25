package lessons;

public class Bmw extends Cars{
    public Bmw(){
        super.name = "Bmw";
    }
    @Override
    void model() {
        System.out.println("M4");
    }

    @Override
    void year() {
        System.out.println("2020");
    }

    @Override
    void price() {
        System.out.println("1 100 000 kr");
    }
}
