public class Main {
    public static void main(String[] args) {
        int TopUpAmount = 1200;
        int interval = 100;
        if (TopUpAmount > 1000) {
            int Bonus = TopUpAmount / interval;
            System.out.println("Итоговый счет:");
            System.out.println(TopUpAmount + Bonus);
            System.out.println("Бонусов начислено:");
            System.out.println(Bonus);
        } else {
            System.out.println("Нет бонусов");
        }
    }
}