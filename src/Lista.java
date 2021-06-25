import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner digiteNumero = new Scanner(System.in);
        Scanner escolhaIndex = new Scanner(System.in);

        int n = 10;

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Escolha 10 números, que serão seus indices");
            System.out.println("Digite o número");
            vect[i] = digiteNumero.nextInt();
        };
        System.out.println("Qual posição do indice deseja visualizar?");
        int e = (int) escolhaIndex.nextInt();

        System.out.println(vect[e]);
        digiteNumero.close();
    }
}
