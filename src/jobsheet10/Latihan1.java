package jobsheet10;
public class Latihan1 {
    public static void main(String[] args) {
        int nilai [] = new int [3];
        nilai [0] = 70;
        nilai [1] = 80;
        nilai [2] = 65;
        double a = 0.0;
        for (int i=0; i<nilai.length; i++)
            a+=nilai [i]; 
        a/=nilai.length;
        System.out.println("Nilai rata-rata = "+a);
   
    }
    
}
