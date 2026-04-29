import java.util.Scanner;

public class layananAkademiKRS14 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LayananKRS14 antrian = new LayananKRS14(10);
        int pilih;

        do {
            System.out.println("\n--- MENU ANTRIAN KRS ---");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil 2 Mahasiswa");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Statistik & Jumlah Belum Proses");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); 
                    String nim = sc.nextLine();
                    System.out.print("Nama: "); 
                    String nama = sc.nextLine();
                    System.out.print("Prodi: "); 
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: "); 
                    String kelas = sc.nextLine();
                    antrian.tambahAntrian(new MahasiswaTJ10_14(nim, nama, prodi, kelas));
                    break;
                case 2: antrian.panggilKRS(); 
                    break;
                case 3: antrian.tampilkanSemua(); 
                    break;
                case 4: antrian.lihat2Terdepan(); 
                    break;
                case 5: antrian.lihatAkhir(); 
                    break;
                case 6: antrian.cekStatistik(); 
                    break;
                case 7: antrian.clear(); 
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (pilih != 8);
        sc.close();
    }
}
