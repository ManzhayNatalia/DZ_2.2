public class Main {

    public static void main(String[] args) {
        int cash = 100;
        int sum = 1000;
        int bonus = (cash+sum)/100;
        int bill = cash+sum+bonus;

        if (cash+sum>1000)
        {
            bonus = sum / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет " + bill);
        System.out.println("Количество бонуcных рублей " + bonus);

    }
}
