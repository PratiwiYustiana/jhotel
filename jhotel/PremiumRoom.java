
/**
 * Write a description of class PremiumRoom here.
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
    public PremiumRoom(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar, isAvailable, status_kamar);
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
     * method
     * @param customer2
     */
    public double getDiscount()
    {
        return DISCOUNT;
    }
    /**
     * method
     * @param customer2
     */
    public void setDailyTariff(double dailytariff)
    {
        super.setDailyTariff(dailytariff*DISCOUNT);
    }
}
