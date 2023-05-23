import java.util.ArrayList;
import java.util.List;

/**
 <Opis klasy>
 imie : String, zawiera imie osoby
 nazwisko : String, zawiera nazwisko osoby
 wiek : Int, zawiera wiek osoby
 @author: Ali hatbi
 **/
public class Czytelnik extends Osoba {
    public List<Ksiazka> przeczytane;

    private Czytelnik(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
        przeczytane = new ArrayList<>();
    }


    public void Przeczytane1(Ksiazka ksiazka){
    przeczytane.add(ksiazka);

    }


    @Override
    public String toString() {
        return "Czytelnik{" +
                "przeczytane=" + przeczytane +
                '}';
    }
}


/*

•	Dodaj do czytelnika metodę toString, która oprócz wypisania danych czytelnika
(tych samych które wypisuje toString z
klasy Osoba wypisze także listę książek przez danego
czytelnika przeczytanych (skorzystaj z już istniejącej metody toString).
 */