package Praktikum15;
import java.util.Stack;

public class StackDemo14 {
    public static void main(String[] args) {
        Book14 book1 = new Book14("1234", "Dasar Pemrograman");
        Book14 book2 = new Book14("7145", "Hafalah Shalat Delisa");
        Book14 book3 = new Book14("3562", "Muhammad Al-Fatih");

        Stack<Book14> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book14 temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }
        System.out.println("");
        Book14 temp2 = books.pop();

        if (temp2 != null) {                        //Untuk memastikan isi stack tidak kosong atau null
            System.out.println(temp2.toString());
        }
        System.out.println("");
        for(Book14 book : books){
            System.out.println(book.toString());
        }
        System.out.println("");
        System.out.println(books);

        //Search
        System.out.println("");
        int posisi = books.search(book1);   //memamanggil books untuk mencari data dari book yang dicari
        if (posisi != -1) {
            System.out.println("Ditemukan pada posisi ke-"+posisi);
        }else{
            System.out.println("Tidak ditemukan");
        }
    }    
}
//5. Diperlukan pengecekan temp != null agar mengetahui bahawa kondisi temp(stack) tidak kosong
