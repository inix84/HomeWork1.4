public class Main {
    public static void main(String[] args) {
        int savings=0;
        int deferredAmount=15_000;
        int AmountLimit=2_459_000;
        int month=0;
        while (savings<AmountLimit) {
            month++;
            savings+=deferredAmount;
            savings*=1.01;
           // System.out.println("Месяц " + month +", сумма накоплений = "+ savings+" рублей");


        }
        System.out.println("Месяц " + month +", сумма накоплений = "+ savings+" рублей");

    }
}