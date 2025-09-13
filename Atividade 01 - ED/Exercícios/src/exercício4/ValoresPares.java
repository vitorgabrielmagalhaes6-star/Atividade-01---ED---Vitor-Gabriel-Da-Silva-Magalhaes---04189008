public class ValoresPares {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 12, 7, 3, 20, 4, 11, 18, 2};

        System.out.println("Números pares:");
        for (int n : numeros) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}
