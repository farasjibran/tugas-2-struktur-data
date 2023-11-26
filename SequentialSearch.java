public class SequentialSearch {
  public static void main(String[] args) {
    // Inisiasi Data
    int[] data = {1, 2, 3, 4, 5};
    int n = 9;

    // Cari Data
    int i = 0;
    boolean found = false;

    while (i < data.length && !found) {
      if (data[i] == n) {
        found = true;
      } else {
        i++;
      }
    }

    // Cetak Hasil
    if (found) {
      System.out.println("Angka " + n + " ditemukan pada indeks " + i);
    } else {
      System.out.println("Angka " + n + " tidak ditemukan");
    }
  }
}