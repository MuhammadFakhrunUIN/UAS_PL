import java.util.Scanner;

//soal 4
public class InputSepuluhTeks {
    public static void main(String[] args) {

        //init array
        String[] arrayTeks = new String[10];

        //scanner
        System.out.println("Masukkan 10 teks yang akan dicek:");
        Scanner input = new Scanner(System.in);

        for (int x = 0; x < 10; x++) {
            arrayTeks[x] = input.nextLine();
        }

        //process
        int karakterLima = 0; //init jumlah teks berkarakter 5

        for (int y = 0; y < 10; y++) {
            if (arrayTeks[y].length() %5 == 0) {
                karakterLima++;
            }
        }

        System.out.println("Jumlah teks yang memiliki lima karakter adalah " + karakterLima + ".");


    }
}
