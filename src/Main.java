public class Main {
    public static void main(String[] args) {
        int savings=0;
        for (int i=1; i<13; i++) {
            savings+=29000;
            System.out.print(i + " месяц, сумма накоплений равна " + savings + " рублей, а ");
            savings+=savings/100;
            System.out.println (savings + " - сумма с процентом. ");
        }


    }
}