
/**
 * class Hotel.
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class Hotel
{
    // instance variables - replace the example below with your own
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    /**
     * Constructor untuk objek pada kelas Hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        // assign instance variables
        //menggunakan this., karena nama variable sama dengan parameter
        this.nama = nama; 
        this.lokasi = lokasi;
        this.bintang = bintang;
    }

    /**
     * method kelas Hotel
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /**
     * mengakses Bintang
     */
    public int getBintang()
    {
        return bintang;
    }
    /**
     * mengakses Nama
     */
    public String getNama()
    {
        return nama;
    }
    /**
     * mengakses Lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    /**
     * meng-update Nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    /**
     * meng-update Lokasi
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    /**
     * meng-update Bintang
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    /**
     * mencteak data nama
     */
    public void printData()
    {
        System.out.println(nama);
    }
}
