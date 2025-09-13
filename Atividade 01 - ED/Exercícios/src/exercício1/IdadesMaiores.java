public class IdadesMaiores {
    public static void main(String[] args) {
        int[] idades = {12, 25, 17, 19, 30, 14, 22, 16, 40, 18};

        System.out.println("Idades maiores que 18:");
        for (int idade : idades) {
            if (idade > 18) {
                System.out.println(idade);
            }
        }
    }
}
