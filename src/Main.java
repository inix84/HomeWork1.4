public class Main {
    public static void main(String[] args) {
        double y=12_000_000;
        double birthRate= (double) 17/1000;
        double mortaliti=(double) 8/1000;
        System.out.println (" " + birthRate + " "+ mortaliti);
        int i=0;
        while (i<10) {
            y= (y+(y*birthRate)-(y*mortaliti));
            i++;
            System.out.println ("Год " + i + ", численность населения составляет  "+ (int) y);
        }


    }
}