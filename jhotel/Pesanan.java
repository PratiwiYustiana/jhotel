
/**
 * class Pesanan - berisi customer beserta pesanannya
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class Pesanan
{
    //instance variable
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    
    /**
     * Constructor untuk objek pada kelas Pesanan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        // assign instance variables
        this.biaya = biaya;
        this.pelanggan = pelanggan;
        nama_pelanggan = pelanggan.getNama();
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
     * method untuk mengambil nilai data pelanggan
     * @return pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    /**
     * method untuk mengambil nama pelanggan
     * @return nama_pelanggan
     */
    public String getNamaPelanggan()
    {
        return nama_pelanggan;
    }
    /**
     * method untuk mengambil nilai tipe kamar
     * @return tipe_kamar
     */
    public TipeKamar getTipeKamar()
    {
        return tipe_kamar;
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
     * method untuk dapat mengatur nilai biaya pada pesanan
     * @param biaya
     */
    public void setBiaya(double biaya)
    {
        this.biaya =  biaya;
    }
    /**
     * method untuk dapat mengatur nilai data pelanggan pada pesanan
     * @param baru
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan = pelanggan;
    }
    /**
     * method untuk dapat mengatur nama pelanggan pada pesanan
     * @param nama_pelanggan
     */
    public void setNamaPelanggan(String nama_pelanggan)
    {
        this.nama_pelanggan = nama_pelanggan;
    }
    /**
     * method untuk dapat mengatur tipe kamar
     * @param tipe_kamar
     */
    public void setTipeKamar(TipeKamar tipe_kamar)
    {
        this.tipe_kamar = tipe_kamar;
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
     * method untuk mencetak data pada pesanan
     * 
     */
    public void printData()
    {
        System.out.println("\nPesanan");
        System.out.println("Nama Pelanggan\t: " + nama_pelanggan);
        System.out.println("Tipe Kamar\t: " + tipe_kamar);
        System.out.println("Status layanan diproses\t: " + isDiproses);
        System.out.println("Status layanan selesai\t: " + isSelesai);
    }
}
