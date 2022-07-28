import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 /*-ok
        Faiz Uygulaması
        Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
        bilgisini alalım ve her sene sonunda toplam para miktarını ekrana yazdıralım

        Faiz Oranı : %6 Faiz Oranı

        */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hoşgeldiniz");
        System.out.println(" Yatırmak istediğiniz parayı giriniz:");
        int anapara=scanner.nextInt();
        System.out.println("Vadeyi giriniz");
        int vade=scanner.nextInt();
        double anaParaToplam= anapara;
        double faizOrani=0.6;
        for(int i=1;i<=vade;i++){
            anaParaToplam=(anaParaToplam*faizOrani)+anaParaToplam;
            System.out.println(i+".ay sonundaki paranız="+(int)anaParaToplam);

        }


    }
}
