//10. Napisz klasę Samochód, w niej pola marka, model, pojemność, typ.
// Utwórz konstruktory, jeden przyjmujący jako parametry wartości dla wszystkich pól,
// oraz jeden który by nie uzupełniał jednego z pól, np. typ. Oprócz tego w klasie dodajcie dwie funkcje,
// np. odpal i wyswietlPojemnoscWCm3. W funkcji main utwórzcie 2 lub 3 obiekty klasy samochód.
// Wywołajcie na nich funkcje, które zostały utworzone w klasie.

package pl.sda;

public class Main {

    public static void main(String[] args) {
	Samochod samochod = new Samochod("Opel", "Astra", 1500,"DCi");
	samochod.odpal();
	samochod.wyswietlPojemnoscWCm3();
	Samochod samochod1 = new Samochod("Audi","A3",2000);
	samochod1.odpal();
	samochod1.wyswietlPojemnoscWCm3();

    }
}
