package jhotel;
/**
 * class SingleRoom - kamar bertipe single
 *
 * @author Pratiwi Yustiana
 * @version 15/03/2018
 */
public class SingleRoom extends Room
{
    // instance variables
    private static TipeKamar TIPE_KAMAR = TipeKamar.SINGLE;

    /**
     * Constructor for objects of class SingleRoom
     */
    public SingleRoom(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
        setDailyTariff(2000000);
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
     * method mengatur dailytariff
     * @param dailytariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff=dailytariff;
    }
}
