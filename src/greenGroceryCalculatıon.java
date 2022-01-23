
import java.util.Scanner;


public class greenGroceryCalculatıon {
    public static void main(String[] args) {

        /* Değişkenlerimizi tanımlayalım
           Ve alınacak ürünlerin kg cinsinden ağırlıgını girelim.
         */

        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, aubergine = 5.00, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kg armut aldınız:");
        pear = input.nextDouble();

        System.out.print("Kaç kg elma aldınız: ");
        apple = input.nextDouble();

        System.out.print("Kaç kg domates aldınız: ");
        tomato = input.nextDouble();

        System.out.print("Kaç kg muz aldınız: ");
        banana = input.nextDouble();

        System.out.print("Kaç kg patlıcan aldınız:");
        aubergine = input.nextDouble();


        total = ( 2.14 * pear) + ( 3.67 * apple) + ( 1.11 * tomato) + ( 0.95 * banana) + ( 5.00 * aubergine);
        System.out.print("Toplam tutar: " + total );



    }

}
