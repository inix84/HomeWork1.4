public class Main {
    public static void main(String[] args) {
        int comet=79;
        int year100=100;
        int year200=200;
        int year2022=2022;
        for (int i=1; i<=(year2022+year100);i++) {
        if (i%comet==0 && i>(year2022-year200)) {
            System.out.println(i) ;
        }
        }

    }
}