public class PencarianNilaiMahasiswa {
    public static void main(String[] args) {
        int[] nilai = {60, 65, 70, 75, 80, 85, 90};
        int cari = 80;

        int low = 0, high = nilai.length - 1;
        int langkah = 0;
        boolean ditemukan = false;

        while (System.out.println("Low=" + low + ", Mid=" + mid + ", High=" + high);
        ) {
            langkah++;
            int mid = (low + high) / 2;

            if (nilai[mid] == cari) {
                System.out.println("Nilai ditemukan di indeks: " + mid);
                ditemukan = true;
                break;
            } else if (nilai[mid] < cari) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Jumlah langkah pencarian: " + langkah);
        System.out.println("Status: " + (ditemukan ? "Ditemukan" : "Tidak ditemukan"));
    }
}
