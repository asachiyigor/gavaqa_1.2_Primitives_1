import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите сумму билета: ");
        int amount = s.nextInt();
        System.out.println("Количество бонусных миль: " + howManyMiles(amount));
    }

    private static int howManyMiles(int amount) {
        return amount / 20;
    }
}