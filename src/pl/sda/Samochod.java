package pl.sda;

public class Samochod {
    private String marka;
    private String model;
    private int pojemnosc;
    private String typ;

    public Samochod(String newmarka, String newmodel, int newpojemnosc, String newtyp){
        marka = newmarka;
        model = newmodel;
        pojemnosc = newpojemnosc;
        typ = newtyp;
    }

    public Samochod(String marka, String model, int pojemnosc){
        this.marka = marka;
        this.model = model;
        this.pojemnosc = pojemnosc;
    }
    public void odpal(){
        System.out.println("Zapalono silnik... "+ marka + " " + model);
    }

    public void wyswietlPojemnoscWCm3(){
        System.out.println("Pojemnosc w cm3: "+pojemnosc);

    }
}
