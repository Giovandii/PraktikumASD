public class BinnaryTree14 {

    Node14 root;

    public BinnaryTree14(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(Mahasiswa14 mahasiswa){
        Node14 newNode = new Node14(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        }else{
            Node14 current = root;
            Node14 parrent = null;
            while (true) {
                parrent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parrent.left = newNode;
                        return;
                    }
                } else{
                    current = current.right;
                    if (current == null) {
                        parrent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node14 current = root;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node14 node){
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder (node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node14 node){
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }
    void traversePostOrder(Node14 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node14 getSuccessor(Node14 del){
        Node14 successor = del.right;
        Node14 successorParrent = del;
        while (successor.left != null) {
            successorParrent = successor;
            successor = successor.left;
        } 
        if (successor != del.right) {
            successorParrent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk){
        if (isEmpty()) {
            System.out.println("Binnary Tree kosong");
            return;
        }
        // Cari node (current) yang akan diihapus
        Node14 parrent = root;
        Node14 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parrent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parrent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // Penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }else{
            //Jika tidak ada anak (leaf), maka anak dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                }else{
                    if (isLeftChild) {
                        parrent.left = null;
                    }else{
                        parrent.right = null;
                    }
                }
            }else if (current.left == null) { //Jika hanya punya 1 anak(kanan)
                if (current == root) {
                    root = current.right;
                } else{
                    if (isLeftChild) {
                        parrent.left = current.right;
                    }else{
                        parrent.right = current.right;
                    }
                }
            }else if (current.right == null) { //Jiak hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else{
                    if (isLeftChild) {
                        parrent.left = current.left;
                    }else{
                        parrent.right = current.left;
                    }
                }
            }else{ //Jika punya 2 anak
                Node14 successor = getSuccessor(current);
                System.out.println("Jika anak 2, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                }else{
                    if (isLeftChild) {
                        parrent.left = successor;
                    }else{
                        parrent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
    public void addRekursif(Mahasiswa14 mahasiswa){
    root = addRekursif(root, mahasiswa);
    }

    public Node14 addRekursif(Node14 current, Mahasiswa14 mahasiswa){
        if(current == null){
            return new Node14(mahasiswa);
        }

        if(mahasiswa.ipk < current.mahasiswa.ipk){
            current.left = addRekursif(current.left, mahasiswa);
        } else {
            current.right = addRekursif(current.right, mahasiswa);
        }

        return current;
    }
    //Cari IPk terkecil
    public void cariMinIPK(){
        if(isEmpty()){
            System.out.println("Tree kosong");
            return;
        }

        Node14 current = root;

        while(current.left != null){
            current = current.left;
        }

        System.out.println("Mahasiswa dengan IPK terkecil:");
        current.mahasiswa.tampilInformasi();
    }
    //CAri IPK Terbesar
    public void cariMaxIPK(){
        if(isEmpty()){
            System.out.println("Tree kosong");
            return;
        }

        Node14 current = root;

        while(current.right != null){
            current = current.right;
        }

        System.out.println("Mahasiswa dengan IPK terbesar:");
        current.mahasiswa.tampilInformasi();
    }
    //Menampilkan MAhasiswa dengan IPK lebih dari yang ditentukan
    public void tampilMahasiswaIPKdiAtas(double ipkBatas){
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    public void tampilMahasiswaIPKdiAtas(Node14 node, double ipkBatas){
        if(node != null){
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);

            if(node.mahasiswa.ipk > ipkBatas){
                node.mahasiswa.tampilInformasi();
            }

            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }
}