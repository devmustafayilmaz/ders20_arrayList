package ders20_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_TamBolenleriSayisi {
    public static void main(String[] args) {
        //kulanicidan tamsayi alın. o tamsayilari bolen sayilari liste halinde yazan
        //bir method olusturun.
        int input = 1280;


        System.out.println(tamBolenListesiOlustur(input));


    }
    public static List<Integer> tamBolenListesiOlustur(int input) {
        List<Integer>tamBolenlerListesi=new ArrayList<>();
        for (int i = 1; i <=input ; i++) {
            if (input %i == 0){
                tamBolenlerListesi.add(i);
            }
        }
    return tamBolenlerListesi;
    }

}
