public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int initialAccount = 100; // Начальный счёт клиента
        int replenishmentAmount = 1100; // Сумма пополнения

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }

        int finalAccount = initialAccount + replenishmentAmount + bonus;

        System.out.println("Количество бонусных рублей: " + bonus);
        System.out.println("Итоговая сумма на счету клиента: " + finalAccount);
    }
}
