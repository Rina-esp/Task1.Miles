public class Main {

    public static void main(String[] args) {
// вводные данные
        int ticketPrice = 317_000;
        int bonusAmount = 20;

// логика
        int mile = (ticketPrice >= bonusAmount) ? 1 : 0;
        int bonusMile = ticketPrice / bonusAmount * mile;
        System.out.println("Сумма начисленных миль составляет: " + bonusMile);
    }
}