//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int bonus = 0;
        int account = 100;
        int fill = 1100;
        if (fill > 1000) {
            bonus = fill / 100;
        } else {
            bonus = 0;
        }
        account = fill + bonus;
        System.out.printf("Начислено " + bonus + " бонусов ");
        System.out.printf("Начислено " + account + " рублей ");
    }
}