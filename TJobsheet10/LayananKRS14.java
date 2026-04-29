public class LayananKRS14 {
    
    MahasiswaTJ10_14 [] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDiproses = 0;
    final int TARGET_DPA = 30; //tidak bisa diubah lagi isinya

    public LayananKRS14 (int max){
        this.max = max;
        this.data = new MahasiswaTJ10_14[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    //Fungsi isEmpty untuk cek queue kosong atau tidak
    public boolean isEmpty(){
        if (size ==0) {
            return true;
        }else {
            return false;
        }
    }

    //IsFull Queue penuh atau tidak
    public boolean isFull(){
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }

    // Menampilkan elemen queue paling depan
    public void lihat2Terdepan(){
        if (size < 2) {
            System.out.println("Antrian kosong");
        }else{
            System.out.print("2 Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            data[front+1].tampilkanData();
        }
    }

    //Menampilkan seluruh data
    public void tampilkanSemua(){
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return ;
        }
        System.out.println("Daftar mahasiswa dalam antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i =0; i<size; i++){
            int index = (front + i) %max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }
    //fungsi mereset data queue (clear)
    public void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    // Fungsi menambah data queue (enqueue)
    public void tambahAntrian(MahasiswaTJ10_14 mhs){
        if (isFull()) {
            System.out.println("Antrian Mahasiswa penuh tidak dapat masuk");
            return;
        }
        else{
            if (isEmpty()) {
                front = rear = 0;
            }else{
                rear = (rear + 1) %max;
            }
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " Berhasil masuk ke antrian");
        }
    }

    // Fungsi memanggi data queue (dequeue)
    public MahasiswaTJ10_14 LayaniMahasiswa(){
        MahasiswaTJ10_14 temp = data[front];
        size--;

        if (size ==0) {
            front = rear = -1;
        }else{
            front = (front+1)%max;
        }
        return temp;
    }

    //melihat paling akhir
    public void lihatAkhir(){
        if (isEmpty()) {
            System.out.println("Antriang kosong");
        }else{
            System.out.print("Mahasiswa terbelakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    // Memamanggil KRS dengan minimla 2 mahasiswa di Queue
    public void panggilKRS(){
        if (size<2) {
            System.out.println("Minimal Harus ada 2 data Mahasiswa terlebih dahulu");
        }else{
            for(int i=0; i<2; i++){
                MahasiswaTJ10_14 m = LayaniMahasiswa();
                m.tampilkanData();
                totalDiproses++;
            }
        }
    }

    //Menampilkan nilai Statistik
    public void cekStatistik(){
        System.out.println("Jumlah antrian saat ini: "+size);
        System.out.println("KRS yang sudah diproses: "+totalDiproses);
        System.out.println("Sisa target mahasiswa: "+(TARGET_DPA - totalDiproses));
    }
}
