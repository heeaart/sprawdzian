import java.util.Objects;

/**
 <Opis klasy>
 imie : String, zawiera imie osoby
 nazwisko : String, zawiera nazwisko osoby
 wiek : Int, zawiera wiek osoby
 @author: Ali hatbi
 **/
public class Osoba {
     private String imie;
     private String nazwisko;
     private int wiek;

     public Osoba(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
     }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return wiek == osoba.wiek && Objects.equals(imie, osoba.imie) && Objects.equals(nazwisko, osoba.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, wiek);
    }


}



/*
•	Stwórz klasę osoba z polami: imię, nazwisko, wiek,
konstruktorem parametrycznym zawierającym wszystkie
pola oraz metodą toString. Utwórz metodę equals i
hashCode, która uwzględnia pola tylko imię i nazwisko.

 */