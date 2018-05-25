package jhotel;
/**
 * class DoubleRoom - room bertipe double
 *
 * @author Pratiwi Yustiana
 * @version 15/03/2018
 */
public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.DOUBLE;

    /**
     * Constructor for objects of class DoubleRoom
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
        setDailyTariff(3500000);
    }

    /**
     * method untuk mengambil data customer2
     * @return    customer
     */
    public Customer getCustomer2(Customer customer2)
    {
        return customer2;
    }
    /**
     * method tipekamar
     * @return    TIPE_KAMAR
     */
    @Override
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }
    /**
     * method mengatur customer2
     * @param customer2
     */
    public void setCustomer2(Customer customer2)
    {
        this.customer2 = customer2;
    }
    /**
     * method mengatur dailytariff
     * @param dailytariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff=dailytariff;
    }
}
