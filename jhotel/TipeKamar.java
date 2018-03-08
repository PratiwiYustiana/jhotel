
/**
 * Enumeration class TipeKamar 
 *
 * @author Pratiwi Yustiana
 * @version 08/03/2018
 */
public enum TipeKamar
{
    Single("Single"), Double("Double"), Premium("Premium");
    
    private final String tipeKamar;
    
    /**
     * Method 
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private TipeKamar (String tipeKamar)
    {
        this.tipeKamar = tipeKamar;
    }
    
    public String toString()
    {
        return tipeKamar;
    }
}
