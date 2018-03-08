
/**
 * Enumeration class StatusKamar
 *
 * @author Pratiwi Yustiana
 * @version 08/03/2018
 */
public enum StatusKamar
{
    Booked("Booked"), Processed("Processed"), Vacant("Vacant");
    
    private final String statusKamar;
    
    /**
     * Method 
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private StatusKamar (String statusKamar)
    {
        this.statusKamar = statusKamar;
    }
    
    public String toString()
    {
        return statusKamar;
    }
}
