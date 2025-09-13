public class MediaNotas {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 6.0, 9.0};
        double soma = 0;

        for (double n : notas) {
            soma += n;
        }

        double media = soma / notas.length;
        System.out.println("A média das notas é: " + media);
    }
}
