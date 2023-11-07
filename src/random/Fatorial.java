package random;

public class Fatorial {

    //    public static void main(String[] args) {
    //        int numero = 5;
    //
    //        int fatorial = numero;
    //        for (int i = 1; i < numero; i++) {
    //            fatorial = fatorial * (numero - i);
    //        }
    //
    //        System.out.println(fatorial);
    //    }

    public static void main(String[] args) {
        var numero = 5;

        int fatorial = numero;
        numero = numero - 1;

        for (int i = numero; i >= 1; i--) {
            fatorial = fatorial * numero;
        }

        System.out.println(fatorial);
    }
}
