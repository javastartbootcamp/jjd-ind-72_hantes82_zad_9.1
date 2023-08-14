package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {

    private static final double RYCZALT_EWIDENCJONOWANY = 0.15;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {

        return przychody * RYCZALT_EWIDENCJONOWANY;
    }
}