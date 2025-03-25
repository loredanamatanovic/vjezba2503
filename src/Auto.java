public class Auto {


    String boja;
    int snaga;
    int brojVrata;
    int brojKotaca;
    boolean upaljen;


    void upaliti() {
        this.upaljen = true;
    }                        //metoda = radnja

    int voziti(int vrijeme) {   //provjeravamo je li upaljen
        if (!upaljen) {
            upaliti();
        }
        return 10 * vrijeme;
    }
}

void ugasiti() {
    System.out.println("");
    this.upaljen = false;
}


public Auto(String boja, int snaga, int brojKotaca, int brojVrata) {     //definicija konstruktora, mogli biti i drugi nazivi
    //postavljamo vrijednosti na ovaj objekt koji kreiramo
    this.boja = boja;
    this.snaga = snaga;
    this.brojKotaca = brojKotaca;
    this.brojVrata = brojVrata;
    this.upaljen = false;  //auto nije upaljen

}
    }

