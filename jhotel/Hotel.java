
/**
 * class Hotel - menunjukkan nama hotel, lokasi hotel, dan bintang hotel
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class Hotel
{
    // instance variables
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
     * method untuk mengambil nilai bintang pada hotel
     * @return bintang
     */
    public int getBintang()
    {
        return bintang;
    }
    /**
     * mehod untuk mengambil nama hotel
     * @return nama 
     */
    public String getNama()
    {
        return nama;
    }
    /**
     * method untuk mengambil nilai lokasi hotel
     * @return lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    /**
     * method untuk dapat mengatur nama hotel
     * @param nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    /**
     * method untuk dapat mengatur lokasi hotel
     * @param lokasi
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    /**
     * method untuk dapat mengatur nilai bintang pada hotel
     * @param bintang
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    /**
     * method untuk mencetak data hotel berupa nama, lokasi, dan bintang
     * 
     */
    public void printData()
    {
        System.out.println("\nHotel");
        System.out.println("Nama Hotel\t: " + nama);
        System.out.println("Lokasi\t\t: " + lokasi.getDeskripsi());
        System.out.println("Bintang\t\t: " + bintang);
    }
}
