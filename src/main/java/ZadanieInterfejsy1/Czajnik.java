package ZadanieInterfejsy1;

public class Czajnik implements IWłączalny, IWyłączalny, IOtwieralny {
    private boolean czyOtwarte;
    private boolean czyWłączony;

    public void otworz() {
        czyOtwarte = true;

    }

    public boolean czyOtwarty() {
        return czyOtwarte;
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
}
