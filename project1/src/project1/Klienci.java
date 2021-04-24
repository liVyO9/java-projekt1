package project1;

import java.util.ArrayList;

public class Klienci {
    ArrayList<Klient> klienciArr = new ArrayList<>();

    public void dodajKlienta(String imie, String nazwisko) {
        klienciArr.add(new Klient(imie, nazwisko));
    }

    public int liczba() {
        return klienciArr.size();
    }

    public void usunKlienta(int id) {
        klienciArr.remove(znajdzKlienta(id));
        // TODO wyjątek jak null?
    }

    public void usunKlienta(Klient klient) {
        klienciArr.remove(klient);
        // TODO wyjątek jak nie ma?
    }

    ArrayList<Klient> znajdzKlientow(String imie, String nazwisko) {
        ArrayList<Klient> wynik = new ArrayList<>();
        for (Klient k : klienciArr)
            if (k.getImie().equals(imie) && k.getNazwisko().equals(nazwisko))
                wynik.add(k);

        return wynik;
    }

    Klient znajdzKlienta(String imie, String nazwisko) {
        for (Klient k : klienciArr)
            if (k.getImie().equals(imie) && k.getNazwisko().equals(nazwisko)) {
                return k;
            }
        // TODO wyjątek?
        return null;
    }

    Klient znajdzKlienta(int id) {
        for (Klient k : klienciArr) {
            if (k.getId() == id) {
                return k;
            }
        }
        // TODO wyjątek?
        return null;
    }

}
