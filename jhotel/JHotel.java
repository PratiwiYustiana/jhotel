
/**
 * class JHotel.
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class JHotel
{
    /**
     * Constructor for objects of class Pesanan
     */
    public JHotel()
    {
        // initialise instance variables
        
    }
    /**
     * method kelas JHotel
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String args[])
    {
        // put your code here
        Customer pelanggan1 = new Customer(1, "Tiwi");
        Lokasi lokasi1 = new Lokasi(10,20,"Depok");
        Hotel hotel1 = new Hotel("Bangtan Hotel", lokasi1, 5);
        Pesanan pesanan1 = new Pesanan(2000000, pelanggan1);
        
        pesanan1.printData();
        hotel1.printData();
        
        pelanggan1.setNama("Jimin");
        pelanggan1.printData();
    }
}
