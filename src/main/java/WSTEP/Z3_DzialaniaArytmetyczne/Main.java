package WSTEP.Z3_DzialaniaArytmetyczne;

public class Main {
    public static void main(String[] args) {

        System.out.println("2 + 3 = " + (2 + 3));
        System.out.println("2 -4 = " + (2 - 4));
        System.out.println("5 / 2 = " + (5 / 2));
        System.out.println("5.0 / 2 = " + (5.0 / 2));
        System.out.println("5.0 / 2.0 = " + (5.0 / 2.0));
        System.out.println("100L - 10 = " + (100L - 10));
        System.out.println("2f - 3 = " + (2f - 3));
        System.out.println("5f / 2 = " + (5f / 2));
        // DZIAŁANIE MATEMATYCZNE ZOSTANIE WYKONANE Z PRECYZJĄ NAJBARDZIEJ
        // PRECYZYJNEJ SKŁADOWEJ - ponieważ działanie zawiera float,
        //          to wynik będzie float
        System.out.println("5d / 2 = " + (5d / 2));
        System.out.println("'A' + 2 = " + ('A' + 2));    // kod ascii 65 + 2 = 67
        System.out.println("'a' + 2 = " + ('a' + 2));    // kod ascii 97 + 2 = 99
        System.out.println("\"a\" + 2 = " + ("a" + 2));
        System.out.println("\"a\" + \"b\" = " + ("a" + "b"));
        System.out.println("'a' + 'b' = " + ('a' + 'b'));
        System.out.println("\"a\" + 'b' = " + ("a" + 'b'));
        System.out.println("\"a\" + 'b' + 3 = " + ("a" + 'b' + 3));
        System.out.println("'b' + 3 + \"a\" = " + ('b' + 3 + "a"));
        System.out.println("9 % 4 = " + (9 % 4));
        System.out.println("Operacja (9 % 4) = " + (9 - ((9 / 4) * 4)));



    }
}
