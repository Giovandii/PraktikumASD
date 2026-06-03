package Praktikum15;
import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList14 {
    public static void main(String[] args) {
        ArrayList<Customer14> customers = new ArrayList<>(); //tetap bisa ditambahkan tanpa menginstansiasi jumlah
        
        Customer14 customer1 = new Customer14(1,"Zakia");
        Customer14 customer2 = new Customer14(5,"Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer14(4, "Cica")); //ditambahkan di akhir

        customers.add(2, new Customer14(100, "Rosa")); //Ditambahkan pada indeks 2 dan indeks dimulai dari 0

        System.out.println(customers.indexOf(customer2)); //menampilkan posisi index data yang di inisialisasi customer2

        System.out.println("");

        Customer14 customer = customers.get(1); //menampilkan nama pada index 1
        System.out.println(customer.name);
        customer.name = "Budi Utomo"; // dan memperbarui nama tersebut

        System.out.println("");

        for (Customer14 cust : customers){
            System.out.println(cust.toString());
        }

        ArrayList<Customer14> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer14(201, "Della"));
        newCustomers.add(new Customer14(202, "Victor"));
        newCustomers.add(new Customer14(203, "Sarah"));

        customers.addAll(newCustomers);

        System.out.println("");

        for(Customer14 cust : customers){
            System.out.println(cust.toString());
        }

        System.out.println("");
        System.out.println(customers);

        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);

        System.out.println("");
        System.out.println(daftarSiswa);

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name)); 
        // Harus mengganti nama karena Java tidak mengizinkan parameter lambda 
        // memiliki nama yang sama dengan variabel lokal yang sudah ada dalam scope yang sama.

        System.out.println("");
        System.out.println(customers);
    }
}
// 4. Objek Bisa ditambahkan walaupun melebihi kapasistas arrayList
// 5. Objek cica ditambahkan diakhir
// 7. Index Array List dimulai dari nol
// 10. Array List dapat diinstansiasi tanpa menentukan size di awal 
