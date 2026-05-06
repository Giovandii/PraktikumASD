package pertemuan12;

public class LayananKemahasiswaan14 {
    
    String nim;
    String nama;
    String kelas;

    public LayananKemahasiswaan14(String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void tampil(){
        System.out.println(nim+"\t"+nama+"\t"+kelas+"\t");
    }
}
