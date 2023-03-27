import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro positivo");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        int i = 0;

        while(i <= numero){
            if (i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
