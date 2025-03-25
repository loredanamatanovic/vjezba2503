public class Main {

    public static void main(String... args){

        Auto crveniAuto = new Auto( "crveni", 100, 5, 4);
        //to je sad objekt, ponaša se kao bilo koja varijabla

        if (crveniAuto instanceof Auto){   //uvijek true
            crveniAuto.Boja = "plava";
            System.out.println("Auto je auto");

        }


    }
}
