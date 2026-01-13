public class Main {

import java.util.Arrays;

public class BinarySearchAngka {
    public static void main(String[] args) {
        int[] data = { 34, 7, 23, 32, 5, 62 };
        Arrays.sort(data);

        int cari = 23;
        int hasil = binarySearch(data, cari);

        System.out.println("Data: " + Arrays.toString(data));
        System.out.println("Nilai yang dicari: " + cari);

        if (hasil != -1) {
            System.out.println("Hasil pencarian (indeks): " + hasil);
            System.out.println("Status: Ditemukan");
        } else {
            System.out.println("Status: Tidak ditemukan");
        }
    }

    static int binarySearch(int[] data, int key) {
            int low = 0, high = data.length - 1;
    
            while (System.out.println("Low=" + low + ", Mid=" + mid + ", High=" + high);
            ) {
                int mid = (low + high) / 2;
    
                if (data[mid] == key)
                    return mid;
                else if (data[mid] < key)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            return -1;
        }
}

}
