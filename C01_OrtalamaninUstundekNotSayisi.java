package ders20_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninUstundekNotSayisi {
    public static void main(String[] args) {
        // Ogretmenden ogrenci notlarini alip bir list olusturun
// ogretmen 100den büyük bir sayiya basip bitirdiginde
// sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        List<Double>notlar=new ArrayList<>();

        Scanner scan =new Scanner(System.in);
        Double girilenNot=(double)5;

        while (girilenNot<=100){


            System.out.println("lutfen listeye eklemek için nnot giriniz:"+"\n Bitirmek icin 0'a basin");

            girilenNot=scan.nextDouble();


            if(girilenNot<=100)
            {
                notlar.add(girilenNot);
            }


        }
        System.out.println(notlar);
        raporla(notlar);






    }
    public static void raporla(List<Double>notlar){
        int ogrenciSayisi=notlar.size();
        double notlarToplami=0.0;
        double sinifNotOrtalamasi=0.0;
        int ortalamaUstundekiOgrenciSayisi=0;


        for (int i = 0; i < notlar.size(); i++) {
            notlarToplami+=notlar.get(i);
        }
        sinifNotOrtalamasi=notlarToplami/ogrenciSayisi;
        for (int i = 0; i < notlar.size(); i++) {
            if(notlar.get(i)>sinifNotOrtalamasi){
                ortalamaUstundekiOgrenciSayisi++;
            }
        }
        System.out.println("girilen not sayisi : "+ ogrenciSayisi +
        "\nGirilen notlarin ortalamasi : " + sinifNotOrtalamasi +
                "\nOrtalama uzerinde not alan ogrenci sayisi : " + ortalamaUstundekiOgrenciSayisi);


    }




}
