/**
 <Opis klasy>
 tytul : String, zawiera tytul ksiazki
 autor : String, zawiera autora ksiazki
 data : String, zawiera date wydania ksiazki
 @author: Ali hatbi
 **/
public class Ksiazka {
    private String tytul;
    private String autor;
    private String data;

    public Ksiazka(String imie, String nazwisko, int wiek){
        this.tytul = tytul;
        this.autor = autor;
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public String getTytul() {
        return tytul;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

}

/*

•	Klasę Książka z polami: tytul, autor (typu Osoba),
data wydania oraz metodą toString.

 */

