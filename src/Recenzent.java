import java.util.Random;

/**
 <Opis klasy>
 @author: Ali hatbi
 **/

public class Recenzent extends Czytelnik{

    public Recenzent(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
    }
}

/*
•	Utwórz klasę Recenzent dziedziczącą z klasy Czytelnik.
Metoda wypiszKsiążki recenzenta powinno wypisać listę książek,
które przeczytał, a obok każdej pozycji losową ocenę
(różną dla każdego wykonania metody).
 */