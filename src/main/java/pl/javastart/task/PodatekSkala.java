package pl.javastart.task;

public class PodatekSkala extends FormaOpodatkowania {
    private final double PODATEK_OSIEMNASCIE = 0.18;
    private final double PODATEK_TRZYDWA = 0.32;
    private final double KWOTA_WOLNA = 10_000;
    private double DRUGI_PROG = 100_000;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochod = przychody - wydatki;
        if (dochod - KWOTA_WOLNA <= 0) {
            return 0;
        }
        if (dochod > KWOTA_WOLNA && dochod < DRUGI_PROG) { //dla 18%

            return (dochod - KWOTA_WOLNA) * PODATEK_OSIEMNASCIE;

        } else {                                                //dla 32%
            return (DRUGI_PROG - KWOTA_WOLNA) * PODATEK_OSIEMNASCIE +  (dochod - DRUGI_PROG) * PODATEK_TRZYDWA;
        }
    }
}
