public class Main {
    public static void main(String[] args) {

        int defaultAmount = 30;
        int amount = 1200;
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int step = 1000;
            int percent;
        if (amount >= step) {
            percent = 1;
        }   else {
            percent = 0;
        }
        int bonus = amount / 100 * percent;
        int total = defaultAmount + amount + bonus;

        System.out.println("Счет: " + total);
        System.out.println("Количество бонусных рублей: " + bonus);
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}