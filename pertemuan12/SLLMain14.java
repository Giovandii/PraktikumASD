package pertemuan12;
import java.util.Scanner;

public class SLLMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SingleLinkedList14 sll = new SingleLinkedList14();
        
        Mahasiswa14 mhs1 = new Mahasiswa14("24212203", "Alvaro", "1A", 4.0);
        Mahasiswa14 mhs3 = new Mahasiswa14("23212201", "Cintia", "3C", 3.5);
        Mahasiswa14 mhs2 = new Mahasiswa14("24212200", "Bimon", "1A", 3.8);
        Mahasiswa14 mhs4 = new Mahasiswa14("21212203", "Dirga", "4D", 3.6);

    //System.out.print("Masukan jumlah data: ");
    //int jumlah = sc.nextInt();
    //sc.nextLine();

    //for(int i=0; i<jumlah; i++){
        //System.out.println("Data ke-"+(i+1));

        //System.out.print("NIM: ");
        //String nim = sc.nextLine();
        //System.out.print("Nama: ");
        //String nama = sc.nextLine();
        //System.out.print("Kelas: ");
        //String kelas = sc.nextLine();
        //System.out.print("IPK: ");
        //double ipk = sc.nextDouble();
        //sc.nextLine();

        //Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas, ipk);

        //sll.addLast(mhs);
        //System.out.println("");
    //}

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertArt(2, mhs2);
        sll.print();

    System.out.println("Data index ke 1 : ");
    sll.getData(1);

    System.out.println("Data mahasisswa an Bimon berada pada index: "+sll.indexOf("bimon"));
    System.out.println();

    sll.removeFirst();
    sll.removeLAst();
    sll.print();
    sll.removeAt(0);
    sll.print();
    }    
}
