package Jobsheet12;
import java.util.Scanner;
public class DoubleLinkedListMain14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DoubleLinkedList14 list = new DoubleLinkedList14();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah Data Diawal");
            System.out.println("2. Tambah Data Diakhir");
            System.out.println("3. Sisipkan Data ditengan (setelah NIM)");
            System.out.println("4. Hapus Data Diawal");
            System.out.println("5. Hapus Data diakhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data dari belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa14 mhsAwal = inputMahasiswa14(scan);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa14 mhsAkhir = inputMahasiswa14(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukan NIM yang dicari : ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukan data baru: ");
                    Mahasiswa14 dataBaru = inputMahasiswa14(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;    
                default:
                    System.out.println("Menu tidak valid");
            }
        } while (pilihan != 0);
        scan.close();
    }

    public static Mahasiswa14 inputMahasiswa14(Scanner scan) {

        System.out.print("NIM   : ");
        String nim = scan.nextLine();

        System.out.print("Nama  : ");
        String nama = scan.nextLine();

        System.out.print("Kelas : ");
        String kelas = scan.nextLine();

        System.out.print("IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();

        return new Mahasiswa14(nim, nama, kelas, ipk);
    }
}