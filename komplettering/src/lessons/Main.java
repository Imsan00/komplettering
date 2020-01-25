package lessons;

import javax.xml.namespace.QName;

public class Main {

    public static void main(String[] args) {
        Cars [] bilar = {new Bmw(), new Audi(), new Mercedes()};
        for (Cars bilarna : bilar){
            System.out.println(bilarna.name);
            bilarna.country();
            bilarna.model();
            bilarna.year();
            bilarna.price();
            System.out.println("");
        }
    }
}
