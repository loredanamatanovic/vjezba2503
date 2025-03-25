public class Main {

    public static void main(String... args) {

        Auto crveniAuto = new Auto( "crveni", 100, 5, 4);
        //sada na njega ništa ne pokazuje, spreman za garbage collector--->vidi gore
        //sada pokazuje na heap gdje se nalaze---> vidi dolje
        crveniAuto = new Auto( "crveni", 100, 5, 3);
            //cak i ako ima takav isti objekt, java vise nece pokazivati na njega

        {   //parametri konstruktora
            //to je sad objekt, ponaša se kao bilo koja varijabla

            if (crveniAuto instanceof Auto) {   //uvijek true
                crveniAuto.boja = "plava";
                System.out.println("Auto je auto");

            }


        }
    }
}