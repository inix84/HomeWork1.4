public class Main {
    public static void main(String[] args) {
        int friday=2;
        int dayMonth=31;
        for (int i=1; i<=dayMonth;i++) {
        if (i%7==friday) {
            System.out.println("Сегодня пятница, "+i+"-е число. Необходимо подготовить отчет.") ;
        }
        }

    }
}