
import java.util.Scanner;

public class switchCase1 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Escolha seu jogo\n\r1 - Valorant\n\r2 - CS\n\r3 - LOL");
        int resp = op.nextInt();
        switch (resp) {
            case 1:
                System.out.println("Você escolheu Valorant");
                break;
            case 2:
                System.out.println("Você escolheu CS");
                break;
            case 3:
                System.out.println("Você escolheu LOL");
                break;
            default:
            System.out.println("Opção inválida.");
                break;
        }
    }
}