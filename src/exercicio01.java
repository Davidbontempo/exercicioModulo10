import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        System.out.print("\nOlá! Bem vindo ao sistema.\n\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números(n) você deseja digitar no vetor? ");
        int n = scanner.nextInt();

        int[] vetor = new int[n];
        System.out.println("Digite os " + n + " numeros do vetor: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Algoritmo Bubble Sort para ordenação
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca os elementos de posição
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        System.out.print("Vetor ordenado: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Parte 2: Contagem de vogais
        System.out.println("\nDigite um nome: ");
        scanner.nextLine(); //Limpa o biffer do teclado
        String nome = scanner.nextLine();

        int contadorVogais = 0;
        // Transforma a string em um vetor de caracteres (char[])
        for (char c : nome.toCharArray()) {
            char minusculo = Character.toLowerCase(c);
            if (minusculo == 'a' || minusculo == 'e' || minusculo == 'i' || minusculo == 'o' || minusculo == 'u') {
                contadorVogais++;
            }
        }
        System.out.println("O nome \"" + nome + "\" possui " + contadorVogais + " vogais.");
        scanner.close();

    }
}




