import java.util.ArrayList;

/**
 * class DatabaseCustomer.
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;
    
    /**
     * Constructor untuk objek pada kelas DatabaseCustomer
     */
    public DatabaseCustomer()
    {
        // initialise instance variables
        
    }

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }
    /**
     * method kelas DatabaseCostumer
     *
     *
     */
    public boolean addCustomer(Customer baru)
    {
        // put your code here
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID() == baru.getID()) return false;
        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }

    public static Customer getCustomer(int id){
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if (cust.getID() == id) return cust;
        }
        return null;
    }

    public boolean removeCustomer(int id)
    {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID()==id){
                for (Pesanan pesan :
                        DatabasePesanan.getPesananDatabase()) {
                    if(pesan.getPelanggan().equals(cust)) DatabasePesanan.removePesanan(pesan);
                }
                CUSTOMER_DATABASE.remove(cust);
                return true;
            }
        }
        return false;
    }
}
