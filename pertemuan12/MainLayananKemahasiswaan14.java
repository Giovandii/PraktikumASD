package pertemuan12;
import java.util.Scanner;

public class MainLayananKemahasiswaan14 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LayananKemahasiswaanQueueLinkedList14 q = new LayananKemahasiswaanQueueLinkedList14(5);

        int pilih;

        do {
            System.out.println("\n=== ANTRIAN KEMAHASISWAAN ===");
            System.out.println("1. Daftar ke Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Depan");
            System.out.println("4. Lihat Belakang");
            System.out.println("5. Tampilkan Semua");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kep = sc.nextLine();

                    LayananKemahasiswaan14 mhs = new LayananKemahasiswaan14(nim, nama, kep);
                    q.enqueue(mhs);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.Lihatdepan();
                    break;

                case 4:
                    q.lihatTerakhir();
                    break;

                case 5:
                    q.printQueue();
                    break;

                case 6:
                    System.out.println("Jumlah antrian: " + q.getSize());
                    break;

                case 7:
                    q.clear();
                    break;
            }

        } while (pilih != 0);
    }

}
