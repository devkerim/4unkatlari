import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner intscanner = new Scanner(System.in);
        int sayi,i,sum=0;
        boolean giris = true;


        do{
            System.out.print("Sayı giriniz: ");
            sayi = intscanner.nextInt();
            if(sayi%2==1){giris=false;}
            else if(sayi%4==0){
                sum=sayi+sum;
            }


        }while(giris);
        System.out.println("4'ün katı ve çift olan sayıların toplamı: "+sum);
    }
}
