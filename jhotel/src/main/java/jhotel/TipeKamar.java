package jhotel;
/**
 * Enumeration class TipeKamar 
 *
 * @author Pratiwi Yustiana
 * @version 08/03/2018
 */
public enum TipeKamar
{
    SINGLE("Single"), DOUBLE("Double"), PREMIUM("Premium");
    
    private final String tipeKamar;
    
    /**
     * Method untuk mengatur tipe kamar
     * @param tipeKamar
     */
    private TipeKamar (String tipeKamar)
    {
        this.tipeKamar = tipeKamar;
    }
    /**
     * method untuk mencetak tipe kamar
     */
    public String toString()
    {
        return tipeKamar;
    }
}
