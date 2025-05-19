public class SLLMain11 {
    public static void main(String[] args) {
        SingleLinkedList11 sll = new SingleLinkedList11();

        Mahasiswa11 mhs1 = new Mahasiswa11("244107060083", "Gempita", "2A", 3.9);
        Mahasiswa11 mhs2 = new Mahasiswa11("244107060084", "Fitri", "2A", 3.8);
        Mahasiswa11 mhs3 = new Mahasiswa11("244107060085", "Nur", "2A", 3.7);
        Mahasiswa11 mhs4 = new Mahasiswa11("244107060086", "Dini", "2A", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dini", mhs3);  
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
