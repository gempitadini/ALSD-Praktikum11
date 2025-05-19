public class SLLMain11 {
    public static void main(String[] args) {
        SingleLinkedList11 sll = new SingleLinkedList11();

        Mahasiswa11 mhs4 = new Mahasiswa11("244107060075", "Gempita", "2A", 3.9);
        Mahasiswa11 mhs3 = new Mahasiswa11("244107060056", "Fitri", "2A", 3.8);
        Mahasiswa11 mhs1 = new Mahasiswa11("244107060023", "Nur", "2A", 3.7);
        Mahasiswa11 mhs2 = new Mahasiswa11("244107060123", "Dini", "2A", 3.6);

        sll.addFirst(mhs4);
        sll.addLast(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);

        System.out.println("Data indeks 1: ");
        sll.getData(1);

        System.out.println("Data mahasiswa an Dini berada pada indeks: " + sll.indexOf("Dini"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}