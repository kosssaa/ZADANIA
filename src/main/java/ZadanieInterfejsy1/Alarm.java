package ZadanieInterfejsy1;

public class Alarm implements IWłączalny, IWyłączalny, IOpenable {
    private boolean czyWłączony;

    public void wyłącz() {
        czyWłączony = false;
    }

    public void włącz() {
        czyWłączony = true;
    }

    public boolean czyWłączony() {
        return czyWłączony;
    }

    @Override
    public boolean czyOtwarty() {
        return false;
    }
}
