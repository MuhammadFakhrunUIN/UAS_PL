public class MengurutkanKelipatanLima {
    //soal 10
    public static void main(String[] args) {
        //init array
        int[] arrayAngka = {23, 59, 87, 98, 15, 12, 35, 40, 60, 75, 80, 50, 42};

        System.out.println("Array:");
        for (int z : arrayAngka) {
            System.out.print(z + " | ");
        }
        System.out.println("\n");

        int[] kelipatanLima = urutKelipatanLima(arrayAngka);

        System.out.println("Angka kelipatan 5 dalam array, diurutkan dari terkecil ke terbesar:");
        for (int angka : kelipatanLima) {
            System.out.print(angka + " | ");
        }
    }

    public static int[] urutKelipatanLima(int[] arrayAngka) {
        int[] kelipatanLima = new int[arrayAngka.length];
        int index = 0;

        for (int angka : arrayAngka) {
            if (angka % 5 == 0) {
                kelipatanLima[index] = angka;
                index++;
            }
        }

        //process sorting
        for (int x = 0; x < index - 1; x++) {
            for (int y = 0; y < index - x - 1; y++) {
                if (kelipatanLima[y] > kelipatanLima[y + 1]) {
                    int temp = kelipatanLima[y];
                    kelipatanLima[y] = kelipatanLima[y + 1];
                    kelipatanLima[y + 1] = temp;
                }
            }
        }


        int[] hasil = new int[index];
        System.arraycopy(kelipatanLima, 0, hasil, 0, index);
        return hasil;


    }
}
