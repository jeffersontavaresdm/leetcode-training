package bigO;

public class Exemplo_02 {

    public boolean e(int[] v) {
        int length = v.length;
        for (int i = 0; i < length; i++) { // O(n)
            for (int j = 0; j < length; j++) { // O(n)
                if (i != j && v[i] == v[j]) return true; // O(n)
            }
        }

        return false;
    }

    // complexidade: O(n) * O(n) = O(n²) -> quadratica
}
