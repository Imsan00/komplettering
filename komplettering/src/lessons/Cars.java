package lessons;

abstract class Cars {
    public void country(){
        System.out.println("Germany");
    }
    protected String name;
    abstract void model();
    abstract void year();
    abstract void price();
}
