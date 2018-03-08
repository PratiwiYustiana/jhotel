
/**
 * class Pesanan.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pesanan
{
    //instance variable
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private String jenis_kamar;
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
    }

    /**
     * Method pada kelas Pesanan
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /**
     * mengakses nilai Biaya
     */ 
    public double getBiaya()
    {
        return biaya;
    }
    /**
     * mengakses Pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    /**
     * mengakses StatusDiproses
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    /**
     * mengakses StatusSelesai
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    public Room getRoom()
    {
        return kamar;
    }
    /**
     * meng-update Biaya
     */
    public void setBiaya(double biaya)
    {
        this.biaya =  biaya;
    }
    /**
     * meng-update Pelanggan
     */
    public void setPelanggan(Customer baru)
    {
        pelanggan = baru;
    }
    /**
     * meng-update StatusDiproses
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }
    /**
     * meng-update StatusSelesai
     */
    public void setStatusSelesai(boolean diproses)
    {
        isSelesai = diproses;
    }
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }
    /**
     * mencetak data biaya
     */
    public void printData()
    {
        System.out.println(biaya);
    }
}
