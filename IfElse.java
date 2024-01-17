import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Gostaria de sal ou açúcar?");
        String resp = op.nextLine();
        if (resp.equals("sal")) {
            System.out.println("Você escolheu sal");
        } else {
            System.out.println("Você escolheu açúcar");
        }
    }
}