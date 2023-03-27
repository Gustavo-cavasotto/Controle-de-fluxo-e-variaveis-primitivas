import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo");
        int numero = sc.nextInt();

        int i = 0;
        int n = 1;

        while (n <= numero){
            i+=n;
            n++;
        }
        System.out.println(i);
        sc.close();
    }
}
