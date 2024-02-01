public class Main {
    public static void main(String[] args) {
        int balance = 100; // начальный баланс
        int replenishment = 1500; // пополнение

        int bonus;
        int result;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
            result = balance + replenishment + bonus;
        } else {
            bonus = 0;
            result = balance + replenishment + bonus;
        }
        System.out.println("Итоговый счет" + result + "рублей");
        System.out.println("Итоговый бонус" + bonus + "рублей");

    }
}