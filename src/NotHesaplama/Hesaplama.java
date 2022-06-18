package NotHesaplama;

import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        float matV1, matV2, matF;

        System.out.print("Matematikv1: ");
        matV1 = inp.nextInt();
        System.out.print("MatematikV2: ");
        matV2 = inp.nextInt();
        System.out.print("MatematikF: ");
        matF = inp.nextInt();

        float hesaplamaMat = (matV1 *20/100) + (matV2 *20/100) + (matF *60/100);
        System.out.print("Matematik Ortalamasi: ");
        System.out.println(hesaplamaMat);

        float fizikV1, fizikV2, fizikF;

        System.out.print("FizikV1: ");
        fizikV1 = inp.nextInt();
        System.out.print("FizikV2: ");
        fizikV2 = inp.nextInt();
        System.out.print("FizikF: ");
        fizikF = inp.nextInt();

        float hesaplamaFizik = (fizikV1 *20/100) + (fizikV2 *20/100) + (fizikF *60/100);
        System.out.print("Fizik ortlamasi: ");
        System.out.println(hesaplamaFizik);

        float kimyaV1, kimyaV2, kimyaF;

        System.out.print("KimyaV1: ");
        kimyaV1 = inp.nextInt();
        System.out.print("KimyaV2: ");
        kimyaV2 = inp.nextInt();
        System.out.print("KimyaF: ");
        kimyaF = inp.nextInt();

        float hesaplamaKimya = (kimyaV1 *20/100) + (kimyaV2 *20/100) + (kimyaF *60/100);
        System.out.print("Kimya ortalamasi: ");
        System.out.println(hesaplamaKimya);

        float turkceV1, turkceV2, turkceF;

        System.out.print("TurkceV1: ");
        turkceV1 = inp.nextInt();
        System.out.print("TurkceV2: ");
        turkceV2 = inp.nextInt();
        System.out.print("TurkceF: ");
        turkceF = inp.nextInt();

        float hesaplamaTurkce = (turkceV1 *20/100) + (turkceV2 *20/100) + (turkceF *60/100);
        System.out.print("Turkce Ortalamasi: ");
        System.out.println(hesaplamaTurkce);

        float tarihV1, tarihV2, tarihF;

        System.out.print("TarihV1: ");
        tarihV1 = inp.nextInt();
        System.out.print("TarihV2: ");
        tarihV2 = inp.nextInt();
        System.out.print("TarihF: ");
        tarihF = inp.nextInt();

        float hesaplamaTarih = (tarihV1 *20/100) + (tarihV2 *20/100) + (tarihF *60/100);
        System.out.print("Tarih Ortalamasi: ");
        System.out.println(hesaplamaTarih);

        float muzikV1, muzikV2, muzikF;

        System.out.print("MuzikV1: ");
        muzikV1 = inp.nextInt();
        System.out.print("MuzikV2: ");
        muzikV2 = inp.nextInt();
        System.out.print("MuzikF: ");
        muzikF = inp.nextInt();

        float hesaplamaMuzik = (muzikV1 *20/100) + (muzikV2 *20/100) + (muzikF *60/100);
        System.out.print("Muzik Ortalamasi: ");
        System.out.println(hesaplamaMuzik);
    }
}
