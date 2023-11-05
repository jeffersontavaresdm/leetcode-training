package challenges.zrandom;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacci(n));

        //        for (int i = 1; i <= n; i++) {
        //            System.out.print(fibonacci(i));
        //
        //            if (i != n) {
        //                System.out.print(" - ");
        //            }
        //        }
    }

    // ex: fibonacci(10) = [1, 1, 2, 3, 5, 8, 13, 21, 34, (55)]
    //    private static int fibonacci(int x) {
    //        if (x <= 2) return 1;
    //
    //        return fibonacci(x - 1) + fibonacci(x - 2);
    //    }

    // ex: fibonacci(10) = [1, 1, 2, 3, 5, 8, 13, 21, 34, (55)]
    private static int fibonacci(int x) {
        if (x <= 2) return 1;

        int atual = 1;
        int anterior = 1;

        int[] sequencia = new int[x];

        int count = 0;
        while (count != (x - 2)) {
            sequencia[count] = anterior;
            sequencia[count + 1] = atual;

            int temp = atual;
            atual = atual + anterior;
            anterior = temp;

            count++;
        }

        sequencia[sequencia.length - 1] = atual;
        System.out.println(Arrays.toString(sequencia));

        return atual;
    }
}