public class Main {
    public static void main(String[] args) {
        int initialAmount = 250;
        int amount = 1350;
        boolean isAmountAccepted = amount > 1000;

        int bonus;
        if (isAmountAccepted) {
            bonus = amount / 100;
            System.out.println("Начислено " + bonus + " бонусов.");
        } else {
            bonus = 0;
            System.out.println("Начислено 0 бонусов.");
        }
        int totalAmount = amount + initialAmount + bonus;
        System.out.println("Баланс составляет " + totalAmount + " руб.");
    }
}