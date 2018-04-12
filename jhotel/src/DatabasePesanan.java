import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * class DatabasePesanan.
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
import java.util.ArrayList<>;
public class DatabasePesanan
{
    //private String[] list_pesanan;
    private static ArrayList<Pesanan> PESANAN_DATABASE;
    private static int LAST_PESANAN_ID;

    /**
     * Constructor untuk objek pada kelas DatabasePesanan
     */
    public DatabasePesanan()
    {
        // initialise instance variables
        PESANAN_DATABASE = new ArrayList<Pesanan>();
        LAST_PESANAN_ID = 0;
    }
    /**
     * method kelas DatabasePesanan
     */
    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }
    public static int getLastPesananID()
    {
        return LAST_PESANAN_ID;
    }
    public static boolean addPesanan(Pesanan baru)
    {
        if (baru.getStatusAktif()==true){
            return false;
        }
        else {
            PESANAN_DATABASE.add(baru);
            return true;
        }
    }
    public static Pesanan getPesanan(int id)
    {
        for(Pesanan pesan : PESANAN_DATABASE){
            if (pesan.getID()==id){
                return pesan;
            }
        }
        return null;
    }
    public static Pesanan getPesanan(Room kamar)
    {
        for(Pesanan pesan : PESANAN_DATABASE){
            if (pesan.getRoom()==kamar){
                return pesan;
            }
        }
        return null;
    }
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan pesan : PESANAN_DATABASE) {
            if (pesan.getPelanggan() == pelanggan) {
                if (pesan.getStatusAktif() == true) {
                    return pesan;
                }
            }
        }
        return null;
    }
    public static boolean removePesanan(Pesanan pesan)
    {
        for(Pesanan pesandb : PESANAN_DATABASE) {
            if (pesandb==pesan) {
                if (pesan.getRoom() != null){
                    pesan.setStatusAktif(false);
                    PESANAN_DATABASE.remove(pesandb);
                    return true;
                }
                else if (pesan.getRoom()==null){
                    if (pesan.getStatusAktif()==true){
                        pesan.setStatusAktif(false);
                        PESANAN_DATABASE.remove(pesandb);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
