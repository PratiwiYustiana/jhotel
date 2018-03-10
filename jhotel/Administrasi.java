
/**
 * class Administrasi - mengatur jalannya pesanan
 *
 * @author Pratiwi Yustiana
 * @version 08/03/2018
 */
public class Administrasi
{
    /**
     * Constructor untuk objek pada kelas Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
        
    }
    /**
     * method untuk memproses kamar yang akan di-assign
     * @param pesan, kamar
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        roomAmbilPesanan(pesan, kamar);
    }
    /**
     * method untuk menyatakan bahwa kamar sudah dipesan (booked)
     * @param pesan,kamar
     */
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.BOOKED);
        kamar.setPesanan(pesan);
    }
    /**
     * method untuk menyatakan bahwa kamar sudah kosong (vacant)
     * @param kamar
     */
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.VACANT);
        kamar.setPesanan(null);
    }
    /**
     * mehod untuk mengubah status kamar karena pesanan dibatalkan
     * @param kamar
     */
    public static void pesananDibatalkan(Room kamar)
    {
        kamar.getPesanan().setStatusSelesai(false);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.setPesanan(null);
        roomLepasPesanan(kamar);
    }
    /**
     * method untuk mengubah status kamar karena pesanan telah selesai
     * @param kamar
     */
    public static void pesananSelesai(Room kamar)
    {
        kamar.getPesanan().setStatusSelesai(true);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.setPesanan(null);
        roomLepasPesanan(kamar);
    }
    /**
     * method untuk mengubah status pesanan karena pesanan dibatalkan
     * @param pesan
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
    /**
     * method untuk mengubah status pesanan karena pesanan telah selesai
     * @param pesan
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
}
