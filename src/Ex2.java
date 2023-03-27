import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();

        boolean primo = true;  // assume que o número é primo

        // verifica se o número é divisível por algum outro número além de 1 e ele mesmo
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;  // o número não é primo
                break;  // sai do loop
            }
        }

        // exibe o resultado
        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        sc.close();
    }
}
