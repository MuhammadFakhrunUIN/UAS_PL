import java.util.Scanner;

//soal 2
public class InputSatuTeks {
    public static void main(String[] args) {

        //scanner
        System.out.println("Masukkan teks yang akan dicek:");
        Scanner input = new Scanner(System.in);
        String teks = input.nextLine();

        //process
        if (teks.length() == 5) {
            System.out.println("Panjang teks adalah 5 karakter.");
        } else {
            System.out.println("Panjang teks bukan 5 karakter.");
        }

    }
}
