
/**
 * class Pesanan - berisi customer beserta pesanannya
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Date;

public class Pesanan
{
    //instance variable
    private int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    
    /**
     * Constructor untuk objek pada kelas Pesanan
     */
    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        isAktif=true;
        this.jumlahHari=jumlahHari;
        this.pelanggan=pelanggan;
        this.kamar=kamar;
        this.biaya = jumlahHari * getRoom().getDailyTariff();
        this.tanggalPesan=new GregorianCalendar().getTime();
        // initialise instance variables

    }

    public int getID() {
        return id;
    }

    /**
     * method untuk mengambil nilai biaya;
     * @return biaya
     */ 
    public double getBiaya()
    {
        return biaya;
    }
    /**
     * method untuk mengambil jumlah hari;
     * @return jumlahHari
     */ 
    public double getJumlahHari()
    {
        return jumlahHari;
    }
    /**
     * method untuk mengambil nilai data pelanggan
     * @return pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }

    public boolean getStatusAktif() {
        return isAktif;
    }

    /**
     * method untuk mengambil status diproses
     * @return isDiproses
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    /**
     * method untuk mengambil status selesai
     * @return isSelesai
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    /**
     * method untuk mengambil nilai kamar
     * @return kamar
     */
    public Room getRoom()
    {
        return kamar;
    }
    /**
     * method untuk mengambil nilai kamar
     * @return kamar
     */
    public Date getTanggalPesan()
    {
        return tanggalPesan;
    }
    public void setID(int id){
        this.id=id;
    }
    /**
     * method untuk dapat mengatur biaya pada pesanan
     *
     */
    public void setBiaya()
    {
        biaya = kamar.getDailyTariff()*jumlahHari;
    }
    /**
     * method untuk dapat mengatur jumlah hari pada pesanan
     * @param jumlahHari
     */
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }
    /**
     * method untuk dapat mengatur nilai data pelanggan pada pesanan
     *
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan = pelanggan;
    }
    public void setStatusAktif(boolean aktif){
        isAktif=aktif;
    }
    /**
     * method untuk dapat mengatur status diproses pada pesanan
     * @param diproses
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }
    /**
     * method untuk dapat mengatur status selesai pada pesanan
     * @param selesai
     */
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai = selesai;
    }
    /**
     * method untuk dapat mengatur data kamar pada pesanan
     * @param kamar
     */
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }
    /**
     * method untuk mengambil nilai kamar
     * @param tanggalPesan
     */
    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan = tanggalPesan;
    }
    /**
     * method untuk mencetak data pada pesanan
     * 
     */
    public String toString()
    {
        return "\nPesanan\nNama Pelanggan\t: " + pelanggan.getNama() + 
        "\nJumlah Hari\t: " + jumlahHari + "\nBiaya\t\t: " + biaya + 
        "\nStatus layanan diproses\t: " + isDiproses + 
        "\nStatus layanan selesai\t: " + isSelesai;
    }
}
