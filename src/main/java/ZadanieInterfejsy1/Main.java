package ZadanieInterfejsy1;

public class Main {
    public static void main(String[] args) {

        IOpenable[] openables = new IOpenable[10];

        openables[9] = new Alarm();
        openables[0] = new Drzwi();
        openables[1] = new Brama();
        openables[2] = new Czajnik();
        openables[3] = new Okno();
        openables[4] = new Samochod();
        openables[5] = new Drzwi();
        openables[6] = new Brama();
        openables[8] = new Alarm();
        openables[7] = new Czajnik();


        for (int i = 0; i < openables.length; i++) {
            IOpenable openable = openables[i];

            if (openable.czyOtwarty()){
                System.out.println("Otwarty");
            }

            for (IOpenable nazwaZmiennej : openables){

                if (nazwaZmiennej.czyOtwarty()) {
                    System.out.println("Otwarty");
                }
                if (nazwaZmiennej instanceof IOtwieralny){
                    IOtwieralny iOtwieralny = (IOtwieralny) nazwaZmiennej;
                    iOtwieralny.otworz();
                }
            }

        }
    }
}
