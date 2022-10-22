package ders20_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoopSoru {
    public static void main(String[] args) {
        String[]arr={"sumeyra","mehmet","ekrem","yılmaz","Ayşe"};
        List<String>yeniList=new ArrayList<>();
        for (String each:arr
             ) {
            if (each.length()%2==0){//uzunlugu çift ise
                yeniList.add(each.substring(0,each.length()/2));
            }else {//uzunlugu tek ise
                yeniList.add(each.substring(0,(each.length()-1)/2));
            }
        }
        System.out.println("yenListemiz: "+yeniList);

    }
}
