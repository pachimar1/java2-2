public class Main {
    public static void main(String[] args) {
        System.out.println("Уважаемый клиент,");

        int balanceA = 300;
        int replenishment = 2000;
        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int balanceB = balanceA + replenishment + bonus;
        System.out.println("Вам начисленные бонусные рубли: " + bonus);
        System.out.println("Текущий баланс: " + balanceB);
        System.out.println("С наилучшими пожеланиями, сотовый оператор Нетология");

    }
}