import  java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nOlá! Bem vindo ao Exercício 02.\n\n");
        System.out.print("Construa o seu vetor.");
        System.out.print("\nObs: Os valores pares serão multiplicados por dois e os valores ímpares serão elevados ao quadrado.");


        System.out.println("Digite o número de valores para o seu vetor: ");

        int n = scanner.nextInt();

        int [] vetor = new int[n];
        System.out.println("Digite os " + n + " números inteiros: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Aplicação da lógica condicional
        for (int i = 0; i < n; i++) {
            if(vetor[i] % 2 == 0){
                vetor[i] = vetor[i] * 2; // Se par, multiplica por 2
            } else {
                vetor[i] = vetor[i] * vetor[i]; // Se ímpar, eleva ao quadrado
            }
        }

        // Exibição formatada do vetor
        System.out.println("Vetor modificado: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i]);
            if (i < n - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println(" ]");
        scanner.close();
    }
}


