
/**
 * class Room - menunjukkan data kamar yang dapat dipesan
 *
 * @author Pratiwi Yustiana
 * @version 08/03/2018
 */
public class Room
{
    // instance variables 
    private Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvailable;
    private Customer customer;
    private double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;

    /**
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel, String nomor_kamar, boolean isAvailable,
    Customer customer, double dailytariff, StatusKamar status_kamar)
    {
        // initialise instance variables
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvailable = isAvailable;
        this.customer = customer;
        dailyTariff = dailytariff;
        this.status_kamar = status_kamar;
        
    }
    /**
     * method untuk mengambil data hotel pada kamar
     * @return hotel
     */
    public Hotel getHotel()
    {
        return hotel;
    }
    /**
     * method untuk mengambil id kamar
     * @return id
     */
    public int getID()
    {
        return id;
    }
    /**
     * method untuk mengambil nomor kamar
     * @return nomor_kamar
     */
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    /**
     * method untuk mengambil status tersedia pada kamar
     * @return isAvailable
     */
    public boolean getStatusAvailable()
    {
        return isAvailable;
    }
    /**
     * method untuk mengambil data pelanggan pada kamar
     * @return customer
     */
    public Customer getCustomer()
    {
        return customer;
    }
    /**
     * method untuk mengambil harga kamar
     * @return dailyTariff
     */
    public double DailyTariff()
    {
        return dailyTariff;
    }
    /**
     * method untuk mengambil status kamar
     * @return status_kamar
     */
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }
    /**
     * method untuk mengambil pesanan pada kamar
     * @return pesan
     */
    public Pesanan getPesanan()
    {
        return pesan;
    }
    /**
     * method untuk mengatur data hotel pada kamar
     * @param hotel
     */
    public void setHotel (Hotel hotel)
    {
        this.hotel = hotel;
    }
    /**
     * method untuk mengatur id kamar
     * @param id
     */
    public void setID (int id)
    {
        this.id = id;
    }
    /**
     * method untuk mengatur nomor kamar
     * @param nomor_kamar
     */
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }
    /**
     * method untuk mengatur status tersedia pada kamar
     * @param isAvailable
     */
    public void setStatusAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }
    /**
     * method untuk mengatur data customer pada kamar
     * @param customer
     */
    public void setCustomer (Customer customer)
    {
        this.customer = customer;
    }
    /**
     * method untuk mengatur harga kamar
     * @param dailytariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
    /**
     * method untuk mengatur status kamar
     * @param status_kamar
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }
    /**
     * method untuk mengatur pesanan pada kamar
     * @param pesan
     */
    public void setPesanan(Pesanan pesan)
    {
        this.pesan = pesan;
    }
    public void printData()
    {
        System.out.println("Room");
        System.out.println("Nama Hotel\t: " + hotel.getNama());
        System.out.println("Nomor Kamar\t: " + nomor_kamar);
        System.out.println("Tersedia\t: " + isAvailable);
        System.out.println("Pelanggan\t: " + customer.getNama());
        System.out.println("Harga\t\t: " + dailyTariff);
        System.out.println("Status Kamar\t: " + status_kamar);
    }
    
}
