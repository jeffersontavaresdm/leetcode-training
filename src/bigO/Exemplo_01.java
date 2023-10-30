package bigO;

public class Exemplo_01 {


    private boolean e(int[] v, int x) {
        for (int i = 0; i < v.length; i++) { // O(1) -> constante
            if (v[i] == x) return true; // O(n) -> linear
        }

        return false; // O(1) -> constante
    }

    // complexidade: O(n) -> linear
}
