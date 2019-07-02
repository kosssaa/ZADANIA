package ZadanieInterfejsy1;

public class Samochod implements IOtwieralny, IZamykalny, IWłączalny, IWyłączalny {
    private boolean czyOtwarte;
    private boolean czyZamkniete;
    private boolean czyWłączony;

    public void otworz() {
        czyOtwarte = true;

    }

    public void wyłącz() {
        czyWłączony = false;

    }

    public void włącz() {
        czyWłączony = true;


    }

    public boolean czyWłączony() {
        return czyWłączony;
    }

    public void zamknij() {
        czyOtwarte = false;

    }

    public boolean czyOtwarty() {
        return czyOtwarte;
    }
}
