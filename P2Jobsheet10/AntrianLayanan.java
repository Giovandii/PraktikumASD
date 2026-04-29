public class AntrianLayanan{

    
    Mahasiswa [] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan (int max){
        this.max = max;
        this.data = new Mahasiswa[max];
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
    public void lihatTerdepan(){
        if (isEmpty()) {
            System.out.println("Antriang kosong");
        }else{
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
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
    //fungsi mereset data queue
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
    public void tambahAntrian(Mahasiswa mhs){
        if (isFull()) {
            System.out.println("Antrian Mahasiswa penuh tidak dapat masuk");
            return;
        }
        rear = (rear + 1)%max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " Berhasil masuk ke antrian");
    }

    // Fungsi memanggi data queue (dequeue)
    public Mahasiswa LayaniMahasiswa(){
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return null;
        }
        Mahasiswa mhs = data[front];
        front = (front + 1) %max;
        size--;
        return mhs;
    }

    //Menampilkan nilai size
    public int getJumlahAntrian(){
        return size;
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
}
