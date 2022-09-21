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
            if (month%6==0) {
                System.out.println("Месяц " + month +", сумма накоплений = "+ savings+" рублей");
            }

        }
        System.out.print("Для накопления до нужной суммы, понадобиться " + month +" месяцев");
        int month1=month/12;
        double month2=month%12;
        System.out.print(", что составит " + month1 +" лет и "+ (int) month2 +" месяца.");
    }
}