package Praktikum15;
import java.util.TreeSet;
public class TreeSetDemo14 {
    public static void main(String[] args) {
        
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Jambu");

        for(String temp : fruits){
            System.out.println(temp);
        }
        System.out.println("");
        System.out.println("First: "+fruits.first()); //Menapilkan data awal (terkecil)
        System.out.println("");
        System.out.println("Last: "+fruits.last());     //Menampillkan data akhir (terbesar)

        fruits.remove("Jeruk");     //Yang dihapus adalah jeruk
        System.out.println("");
        System.out.println("Setelah remove "+fruits);

        fruits.pollFirst();         //Mengambil data pertama yaitu apel
        System.out.println("");
        System.out.println("Setelah pulFirst "+fruits);

        fruits.pollLast();          //Mengambil data terakhir yaitu mangga
        System.out.println("");
        System.out.println("Setelah pulLast "+fruits);
    }
}
// 6. TreeSet tidak mempertahankan urutan saat elemen ditambahkan. Sebaliknya, TreeSet akan 
//    mengurutkan elemen secara otomatis berdasarkan urutan alami (ascending) sehingga data 
//    ditampilkan dalam urutan alfabetis: Apel, Jambu, Jeruk, Mangga.
// 8. Method first() digunakan untuk mengambil elemen pertama (terkecil) dalam TreeSet berdasarkan urutan alaminya.
//    Method last() digunakan untuk mengambil elemen terakhir (terbesar) dalam TreeSet.
//    Method remove() digunakan untuk menghapus elemen tertentu yang diberikan sebagai parameter.
//    Method pollFirst() digunakan untuk mengambil dan menghapus elemen pertama dari TreeSet.
//    Method pollLast() digunakan untuk mengambil dan menghapus elemen terakhir dari TreeSet.
