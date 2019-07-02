package WSTEP.z14;

import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą dodatnią N:");
        int liczbaN = scanner.nextInt();


        boolean[][] tablica = new boolean[liczbaN][liczbaN];

        System.out.println(tablica.length);
        System.out.println(tablica[3][4]);
        System.out.println(tablica[2][3]);
        System.out.println(tablica[1][2]);

        for (int i = 0; i < tablica.length; i++) {

            for (int j = 0; j < tablica.length; j++) {
               // if ((i+1 % 1 == 0) != (j+1 % 1 == 0)) {
               if ((i+1 % 1 == 0) != (j+1 % 1 == 0)) {

                    tablica[i][j] = true;

                } System.out.print(tablica[i][j] + ", ");

            }System.out.println();
        }

    }
}




/*

    14. Napisz program, który pobiera od użytkownika dodatnią liczbę naturalną n i
    tworzy tablicę a zmiennych typu logicznego (boolean) o rozmiarze n×n.
    Następnie program powinien wypełnić utworzoną tablicę,
    tak by a[i][j] = true jeżeli liczby (i+1) oraz (j+1)
    są względnie pierwsze, tzn. nie mają wspólnych dzielników poza

Przykład:

1. Tak utworzoną tablicę należy wypisać na ekranie, przy czym dla wartości true należy wyświetlić znak ”+”,
natomiast dla wartości false znak ”.”.

Podaj liczbę (> 0): 10

1 2 3 4 5 6 7 8 9 10

    1++++++++++
    2+.+.+.+.+.
    3++.++.++.+
    4+.+.+.+.+.
    5++++.++++.
    6+...+.+...
    7++++++.+++
    8+.+.+.+.+.
    9++.++.++.+
    10+.+...+.+.

 */
