package pertemuan12;

public class LayananKemahasiswaanQueueLinkedList14 {
    
    NodeLayananKemahasiswaan14 front, rear;
    int size;
    int max;

    public LayananKemahasiswaanQueueLinkedList14(int max){
        this.max = max;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public boolean isFull(){
        return size == max;
    }

    public void enqueue(LayananKemahasiswaan14 data){
        if (isFull()) {
            System.out.println("Antrian Penuh");
            return;
        }
        NodeLayananKemahasiswaan14 node = new NodeLayananKemahasiswaan14(data);

        if (isEmpty()) {
            front = rear = node;
        }else{
            rear.next = node;
            rear = node;
        }
        size++;
        System.out.println("Mahasiswa masuk antrian");
    }

    public void dequeue(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Memanggil: ");
        System.out.println("Nim\tNama\tKelas");
        front.data.tampil();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public void Lihatdepan(){
        if (!isEmpty()) {
            System.out.println("Antrian terdepan: ");
            System.out.println("Nim\tNama\tKelas");
            front.data.tampil();
        }
    }

    public void lihatTerakhir(){
        if (!isEmpty()) {
            System.out.println("Antrian terakhir: ");
            System.out.println("Nim\tNama\tKelas");
            rear.data.tampil();
        }
    }

    public void printQueue(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        NodeLayananKemahasiswaan14 temp= front;
        System.out.println("Isi antrian: ");
        System.out.println("Nim\tNama\tKelas");
        while (temp != null) {
            temp.data.tampil();
            temp = temp.next;
        }

    }
    public void clear(){
        front = rear = null;
        size = 0;
        System.out.println("Antrian  dikosongkan");
    }

    public int getSize(){
        return size;
    }
}
