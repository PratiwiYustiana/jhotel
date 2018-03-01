
/**
 * class Customer.
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class Customer
{
    protected int id;
    protected String nama;
    
    /**
     * Constructor untuk objek pada kelas Customer
     */
    public Customer(int id, String nama)
    {
        // assign instance variables
        this.id = id;
        this.nama = nama;
    }

    /**
     * method kelas Customer
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /**
     * mengakses ID
     */
    public int getID()
    {
        return id;
    }
    /**
     * mengakses Nama
     */
    public String getNama()
    {
        return nama;
    }
    /**
     * meng-update ID
     */
    public void setID(int id)
    {
        this.id = id;
    }
    /**
     * meng-update nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    /**
     * mencetak data nama
     */
    public void printData()
    {
        System.out.println(nama);
    }
}
