public class Main {
    public static void main(String[] args) {
        int savings=15000;
        int AmountLimit=12_000_000;
        int month=0;
        double percent= 1.07;
        //System.out.println("Процент " + percent);
        while (savings<AmountLimit) {
            month++;
            savings*=percent;
            System.out.println("Месяц " + month +", сумма накоплений = "+ savings+" рублей");

        }
        int month1=month/12;
        double month2=month%12;
        System.out.println("Что составит " + month1 +" лет и "+ (int) month2 +" месяца");
    }
}