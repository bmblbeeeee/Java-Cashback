public class Main {
    public static void main(String[] args) {
        int topUpAmount = 1200;
        int interval = 100;
        if (topUpAmount > 1000) {
            int bonus = topUpAmount / interval;
            System.out.println("Итоговый счет:");
            System.out.println(topUpAmount + bonus);
            System.out.println("Бонусов начислено:");
            System.out.println(bonus);
        } else {
            System.out.println("Нет бонусов");
        }
    }
}