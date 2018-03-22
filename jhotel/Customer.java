
/**
 * class Customer - berisi data pelanggan berupa id dan nama
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
import java.util.Date;
import java.util.regex.*;
import java.util.GregorianCalendar;
public class Customer
{
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    
    /**
     * Constructor untuk objek pada kelas Customer
     */
    public Customer(int id, String nama)
    {
        // assign instance variables
        this.id = id;
        this.nama = nama;
    }
    public Customer(int id, String nama, int tanggal, int bulan, 
    int tahun) 
    {
        // initialise instance variables 
        this.id = id; 
        this.nama = nama; 
        GregorianCalendar gc = 
        new GregorianCalendar(tahun,bulan,tanggal); 
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
     * method untuk mengambil nama pelanggan
     * @return nama
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * method untuk mengambil nama pelanggan
     * @return nama
     */
    public Date getDOB()
    {
        return dob;
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
     * method untuk dapat mengatur nama pelanggan
     * @param nama
     */
    public void setEmail(String email)
    {
        String REGEX = "[^.][^\\s]+\\b@\\b[^-][^\\s]+"; 
        Pattern p = Pattern.compile(REGEX); 
        Matcher m = p.matcher(email); 
        System.out.println("\nEmail " + email + "\n" + m.matches()); 
    }
    /**
     * method untuk dapat mengatur nama pelanggan
     * @param nama
     */
    public void setDOB(Date dob)
    {
        this.dob = dob;
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
