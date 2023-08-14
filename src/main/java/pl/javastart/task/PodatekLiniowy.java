package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {
    private static final double PODATEK_LINIOWY = 0.19;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {

        double dochod = przychody - wydatki;
        return dochod * PODATEK_LINIOWY;
    }
}



