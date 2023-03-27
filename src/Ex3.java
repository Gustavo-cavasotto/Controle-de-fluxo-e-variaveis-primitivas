import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro positivo");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();



        for(int i = 0; i <= 10; i++){
            int numero_final = numero * i;
            System.out.println(numero + " x " + i + " = " + numero_final);
        }
    }
}
