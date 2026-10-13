import java.util.Scanner;
public class StudiKasus2_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine().trim();

        boolean berhakDana = false;
        String alasan ="";

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("peringkat juara : ");
            int peringkat = sc.nextInt();
            if (peringkat >= 1 && peringkat <= 3) {
            } else {
                alasan = "Bukan juara 1, 2, atau 3";
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusPKM = sc.nextInt();

            if (statusPKM == 1) {
                berhakDana = true;
            } else {
                alasan = "Jenis kegiatan tidak mendapat dana penghargaan";
            }

            if (berhakDana) {
                System.out.print("Jumlah dokumen : ");
                int jumlahDokumen = sc.nextInt();

                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap. Dana dapat diberikan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak dapat diberikan.");
                }
            } else { 
                System.out.print("Jumlah dokumen : ");
                int jumlahDokumen = sc.nextInt();

                if (jumlahDokumen < 4) {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : dokumen tidak lengkap (kurang " + kurang + " dokumen) dan " + alasan.toLowerCase() + ".Dana penghargaan tidak diberikan.");
                } else {
                    System.out.println("Status : " + alasan + ".Dana penghargaan tidak diberikan.");
                }
            }
        }

    }
}