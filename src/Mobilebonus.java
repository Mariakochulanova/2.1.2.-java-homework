public class Mobilebonus {
    public static void main(String[] args) {
        int balance;
        balance = 100;
        int payment = 1000;
        int bonus = payment / 100;

        int totalbonus;
        if (payment >= 1000) {
            totalbonus = balance + payment + bonus;
        } else {
            totalbonus = payment + balance;
        }
        System.out.println(totalbonus);
    }
}

