package WSTEP.Z2_Dodawanie_DzialaniaMatematyczne;

public class Odejmowanie {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();

        System.out.println("Podpunkt 4.1: [a - 2] = " + (a - 2));
        System.out.println("Podpunkt 4.2: [a - b] = " + (a - b));
        System.out.println("Podpunkt 4.3: [1 - 1] = " + (1 - 1));
        System.out.println("Podpunkt 4.4: [a - (b - c)] = " + (a - (b - c)));

        c = a - b;
        System.out.println("Podpunkt 4.5: [a - b] = " + c);

    }
}
