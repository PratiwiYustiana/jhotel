
/**
 * class Customer - berisi data pelanggan berupa id dan nama
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
     * method untuk mengambil nomor id pelanggan
     * @return id
     */
    public int getID()
    {
        return id;
    }
    /**
     * method untuk mengambil nama pelanggan
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }
    /**
     * method untuk dapat mengatur nomor id pelanggan
     * @param id
     */
    public void setID(int id)
    {
        this.id = id;
    }
    /**
     * method untuk dapat mengatur nama pelanggan
     * @param nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    /**
     * method untuk dapat mencetak id dan nama pelanggan
     * 
     */
    public void printData()
    {
        System.out.println("\nCustomer");
        System.out.println("ID\t\t: " + id);
        System.out.println("Nama\t\t: " + nama);
    }
}
