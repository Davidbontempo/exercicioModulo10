import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nOlá! Bem vindo ao Exercício 03.\n\n");
        System.out.print("Digite seu nome ou palavra para inverter (ex: David, camiseta): ");
        String nome = scanner.nextLine();

        // Transforma a string em um vetor de caracteres
        char[] caracteres = nome.toCharArray();
        String nomeInvertido = "";

        // Percorre o vetor de caracteres do final para o início
        for (int i = caracteres.length - 1; i >= 0; i--) {
            nomeInvertido += caracteres[i];
        }

        System.out.println("Nome invertido: " + nomeInvertido);
        scanner.close();
    }
}
