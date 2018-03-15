
/**
 * class SingleRoom
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
    public SingleRoom(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
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
        // put your code here
        return TIPE_KAMAR;
    }
}
