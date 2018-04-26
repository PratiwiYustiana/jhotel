package jhotel;
/**
 * Enumeration class StatusKamar
 *
 * @author Pratiwi Yustiana
 * @version 08/03/2018
 */
public enum StatusKamar
{
    BOOKED("Booked"), PROCESSED("Processed"), VACANT("Vacant");
    
    private final String statusKamar;
    
    /**
     * Method untuk mengatur status kamar
     * @param statusKamar
     */
    private StatusKamar (String statusKamar)
    {
        this.statusKamar = statusKamar;
    }
    /**
     * method untuk mengambil nilai status kamar
     * @return statusKamar
     */
    public String toString()
    {
        return statusKamar;
    }
}
