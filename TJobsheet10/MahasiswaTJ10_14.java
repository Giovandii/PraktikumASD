public class MahasiswaTJ10_14 {
    
    String nim;
    String nama;
    String prodi;
    String kelas;

    public MahasiswaTJ10_14(String nim, String nama, String prodi, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    //Menampilkan data
    public void tampilkanData(){
        System.out.println(nim+" - "+nama+" - "+prodi+" - "+kelas);
    }
}
