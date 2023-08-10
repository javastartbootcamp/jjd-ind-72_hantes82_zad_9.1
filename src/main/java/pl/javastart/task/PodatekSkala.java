package pl.javastart.task;

public class PodatekSkala extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochod = przychody - wydatki;
        if (przychody < KWOTA_WOLNA || dochod <= 0 || dochod - KWOTA_WOLNA <= 0) {
            return 0;
        }
        if (przychody > KWOTA_WOLNA && przychody < DRUGI_PROG) { //dla 18%

            return (dochod - KWOTA_WOLNA) * PODATEK_OSIEMNASCIE;

        } else {                                                //dla 32%
            return (dochod - KWOTA_WOLNA) * PODATEK_TRZYDWA;
        }
    }
}
