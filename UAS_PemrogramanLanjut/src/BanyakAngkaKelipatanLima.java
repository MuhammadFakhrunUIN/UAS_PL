import java.util.Scanner;

//soal 3
public class BanyakAngkaKelipatanLima {
    public static void main(String[] args) {

        //init array
        int[] arrayAngka = new int[10];

        //scanner
        System.out.println("Masukkan 10 angka yang akan dicek:");
        Scanner input = new Scanner(System.in);

        for (int x = 0; x < 10; x++) {
            arrayAngka[x] = input.nextInt();
        }

        //process
        int kelipatanLima = 0; //init int kelipatan

        for (int y = 0; y < 10; y++) {
            if (arrayAngka[y] %5 == 0) {
                kelipatanLima++;
            }
        }

        System.out.println("Jumlah angka yang merupakan kelipatan lima adalah " + kelipatanLima + ".");

    }
}
