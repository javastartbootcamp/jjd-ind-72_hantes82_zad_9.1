package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {

        double dochod = przychody - wydatki;
        if (przychody < KWOTA_WOLNA || dochod <= 0 || dochod - KWOTA_WOLNA <= 0) {
            return 0;
        } else {
            return (dochod - KWOTA_WOLNA) * PODATEK_LINIOWY;
        }
    }
}



