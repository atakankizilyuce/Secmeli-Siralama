package secmeli_siralama;

public class Secmeli_Siralama {
	 public static void main(String[] args) {
         int []dizi={23,17,5,90,12,44,38,84,77};
         secmeliSiralama(dizi);
         for (int i = 0; i < dizi.length; i++) //metot cagirildiktan sonra ekrana yazdirma islemi icin tanimlanan for dongusu
         {
         System.out.print(dizi[i]+",");
         }
	 }
   public static int[] secmeliSiralama(int [] dizi) //secmeli siralama islemini yaptigimiz metot
   {
    int uzunluk=dizi.length;
    int yedek;
    int min;
    for(int i=0; i<uzunluk-1; i++)
    {
          min=i;
          for(int j=i; j<uzunluk; j++)
          {
          if (dizi[j] < dizi[min]) min=j;
          }
          yedek=dizi[i];
          dizi[i]=dizi[min];
          dizi[min]=yedek;
    }
   return dizi;
   }
}



