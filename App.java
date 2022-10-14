import lib.Reptile;


public class App {
    public static void main(String[] args) throws Exception {

        Reptile crocodile = new Reptile(
            2,
            2 ,
            "reptile",
            "red",
            "Dry skin",
            "backbone",
            "softshell egg"
        );

        System.out.println(crocodile.SkinType);
    }

}
