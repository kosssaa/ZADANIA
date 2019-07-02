package ZadanieInterfejsy1;

public class Drzwi implements IOtwieralny, IZamykalny {
    private boolean czyOtwarte;

    public void otworz() {
        czyOtwarte = true;
    }

    public void zamknij() {
        czyOtwarte = false;
    }

    public boolean czyOtwarty() {
        return czyOtwarte;
    }
}
