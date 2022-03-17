import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите сумму билета: ");
        int amount = s.nextInt();
        System.out.println("Количество бонусных миль: " + HowManyMiles(amount));
    }

    private static int HowManyMiles(int amount) {
        return amount / 20;
    }
}