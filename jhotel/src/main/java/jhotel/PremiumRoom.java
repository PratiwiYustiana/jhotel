package jhotel;
/**
 * class PremiumRoom - room bertipe premium
 *
 * @author Pratiwi Yustiana
 * @version 15/03/2018
 */
public class PremiumRoom extends Room
{
    // instance variables

    private double DISCOUNT = 0.3;
    private TipeKamar TIPE_KAMAR = TipeKamar.PREMIUM;

    /**
     * Constructor for objects of class DoubleRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
        setDailyTariff(5000000);
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
     * method untuk mengambil discount
     * @return DISCOUNT
     */
    public double getDiscount()
    {
        return DISCOUNT;
    }
    /**
     * method harga kamar per hari
     * @return dailytariff
     */
    public void setDailyTariff(double dailytariff)
    {
        super.setDailyTariff(dailytariff*DISCOUNT);
    }
}
