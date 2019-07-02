package ZadanieInterfejsy1;

public class Okno implements IZamykalny, IOtwieralny {

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
