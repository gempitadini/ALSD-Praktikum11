import java.util.Scanner;
public class SLLMain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList11 sll = new SingleLinkedList11();
        sll.print();

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa11 mhs = new Mahasiswa11(nim, nama, kelas, ipk);
            sll.addLast(mhs);
            sll.print();
        }
        sc.close();
    }
}
