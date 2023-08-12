package pl.javastart.task;

import java.util.*;

public class Firma {

    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;

    private Map<String, Double> wydatki = new HashMap<>();
    private Map<String, Double> przychody = new HashMap<>();

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double sumaPrzychodow = zsumujPrzychody();
        double sumaWydatkow = zsumujWydatki();
        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", "TODO");
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", zsumujWydatki());
        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(sumaPrzychodow, sumaWydatkow));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double sum = 0;
        for (Map.Entry<String, Double> wydatek : wydatki.entrySet()) {
            sum += wydatek.getValue();
        }

        return sum;
    }

    private double zsumujPrzychody() {
        double sum = 0;
        for (Map.Entry<String, Double> przychod : przychody.entrySet()) {
            sum += przychod.getValue();
        }
        return sum;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        przychody.put(nazwa, wartosc);
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        wydatki.put(nazwa, wartosc);
    }

    private boolean isNullWydatki() {
        boolean isNull = true;
        if (wydatki != null) {
            isNull = false;
        }
        return isNull;
    }
}
