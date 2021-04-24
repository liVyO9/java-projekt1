package project1;

import java.security.SecureRandom;

public class Klient {
    private String imie;
    private String nazwisko;
    static int nextId = 10000;
    private int stanKonta = 0;
    private int id;
    private int pin4;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        id = nextId;
        nextId++;
        pin4 = generujPin4();
    }

    public void setStanKonta(int nowyStan) {
        stanKonta = nowyStan;
    }

    public int getStanKonta() {
        return stanKonta;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public int getPin4() {
        return pin4;
    }

    public String getPin4Str() {
        return String.format("%04d", pin4);
    }

    public void setPin4() {
        pin4 = generujPin4();
    }

    public void setPin4(int pin4) {
        if (pin4 >= 0 && pin4 < 10000)
            this.pin4 = pin4;
    }

    private int generujPin4() {
        var random = new SecureRandom();
        return random.nextInt(10000);
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return nazwisko + " " + imie + " id:" + id + " : " + stanKonta + " zł";
    }
}
