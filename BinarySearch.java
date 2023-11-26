public class BinarySearch {
  public static void main(String[] args) {
    // Inisiasi Data
    int[] data = {1, 2, 3, 4, 5};
    int n = 1;

    // Cari Data
    int low = 0;
    int mid = 0;
    int high = data.length - 1;
    boolean found = false;

    while (low <= high && !found) {
      mid = (low + high) / 2;

      if (data[mid] == n) {
        found = true;
      } else if (data[mid] < n) {
        low = mid + 1;
      } else {
        high = mid - 1 ;
      }
    }

    // Cetak Hasil
    if (found) {
      System.out.println("Angka " + n + " ditemukan pada indeks " + mid);
    } else {
      System.out.println("Angka " + n + " tidak ditemukan");
    }
  }
}
