package ders20_arrayList;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        int []arr={1,3,4,5,6,4,6,7,8,9};
        int toplam=0;
        for (int each: arr //arrye git herbir int i bana getir.
             ) {
            if (each>5){
                toplam+=each;
            }
        }
        System.out.println("for each loop ile toplam: "+toplam);
    }
}
