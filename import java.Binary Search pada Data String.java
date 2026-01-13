import java.util.Arrays;

public class BinarySearchString {
    public static void main(String[] args) {
        String[] nama = { "Andi", "Budi", "Citra", "Dewi", "Eko" };
        Arrays.sort(nama);

        String cari = "citra";
        int hasil = binarySearch(nama, cari);

        if (hasil != -1) {
            System.out.println("Nama yang dicari: " + cari);
            System.out.println("Indeks ditemukan: " + hasil);
        } else {
            System.out.println("Nama tidak ditemukan");
        }
    }

    static int binarySearch(String[] data, String key) {
        int low = 0, high = data.length - 1;

        while (System.out.println("Low=" + low + ", Mid=" + mid + ", High=" + high);
        ) {
            int mid = (low + high) / 2;
            int cmp = data[mid].compareToIgnoreCase(key);

            if (cmp == 0)
                return mid;
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
