import java.util.Scanner;

//soal 1
public class AngkaKelipatanLima {
    public static void main(String[] args) {

        //scanner
        System.out.println("Masukkan angka yang akan dicek:");
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        //process
        if (angka %5 == 0) {
            System.out.println("Angka merupakan kelipatan 5.");
        } else {
            System.out.println("Angka bukan kelipatan 5.");
        }


    }
}