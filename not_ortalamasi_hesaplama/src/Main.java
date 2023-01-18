import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         int mat;
         int fizik;
         int kimya;
         int turkce;
         int tarih;
         int muzik;

         Scanner scanner = new Scanner(System.in);

         System.out.print("Matematik Notunuzu Giriniz:");
          mat = scanner.nextInt();
         System.out.print("Fizik Notunuzu Giriniz:");
          fizik = scanner.nextInt();
        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = scanner.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz:");
        turkce = scanner.nextInt();
        System.out.print("Tarih Notunuzu Giriniz:");
        tarih = scanner.nextInt();
        System.out.print("Müzik Notunuzu Giriniz:");
        muzik = scanner.nextInt();

        double ort = (mat+fizik+kimya+tarih+turkce+muzik)/6;

        String sonuc = (ort >= 60) ? "Sınıfı Geçtiniz!" : "Sınıfta Kaldınız!";
        System.out.println("Ortalamanız:" + ort +"\n"+  sonuc);

    }
}