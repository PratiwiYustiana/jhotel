
/**
 * class JHotel - berisi method main yang akan dijalankan pertama kali
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */

import java.util.GregorianCalendar;
public class JHotel
{
    /**
     * Constructor untuk kelas JHotel
     */
    public JHotel()
    {
        // initialise instance variables
        
    }
    /**
     * method main
     *
     * @param  args[] 
     */
    public static void main(String args[])
    {
        Customer cust1 = new Customer(1, "Tiwi", 
        new GregorianCalendar(2018,03,22).getTime());
        
        
        /*System.out.println("Welcome to JHotel");
        Lokasi lokasi1 = new Lokasi(10,20,"Depok");
        Customer pelanggan1 = new Customer(1, "Tiwi");
        Hotel hotel1 = new Hotel("Bangtan Hotel", lokasi1, 5);
        Room room1 =  new Room(hotel1, "1306", true, pelanggan1, 2000000, StatusKamar.BOOKED);
        Pesanan pesanan1 = new Pesanan(100000, pelanggan1);
        
        pesanan1.setTipeKamar(TipeKamar.PREMIUM);
          
        lokasi1.printData();
        pelanggan1.printData();
        hotel1.printData();
        
        System.out.println("\n=============Method 1=============");
        Administrasi.pesananDitugaskan(pesanan1, room1);
        room1.printData();
        pesanan1.printData();
        
        System.out.println("\n=============Method 2=============");
        Administrasi.pesananDibatalkan(room1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("\n=============Method 3=============");
        Administrasi.pesananDibatalkan(pesanan1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("\n=============Method 4=============");
        Administrasi.pesananSelesai(room1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("\n=============Method 5=============");
        Administrasi.pesananSelesai(pesanan1);
        room1.printData();
        pesanan1.printData();
        */
       
        /*System.out.println("Welcome to JHotel");
        Lokasi lokasi1 = new Lokasi(10,20,"Depok");
        Hotel hotel1 = new Hotel("Bangtan Hotel", lokasi1, 5);
        Room single1 = new SingleRoom(hotel1, "1306", true, StatusKamar.VACANT);
        Customer customer1 = new Customer(1, "Tiwi");
        Pesanan pesanan1 = new Pesanan(3, customer1, single1);
        single1.setDailyTariff(2000000);
        pesanan1.setBiaya();
        
        lokasi1.printData();
        customer1.printData();
        hotel1.printData();
        
        System.out.println("\n=============SINGLE=============");
        Administrasi.pesananDitugaskan(pesanan1, single1);
        single1.printData();
        pesanan1.printData();
        
        if(single1 instanceof DoubleRoom)
        {
            System.out.println("\nBenar Double Room");
        }
        else
        {
            System.out.println("\nSalah, bukan Double Room");
        }
        
        Room double1 = new DoubleRoom(hotel1, "1306", true, StatusKamar.VACANT);
        Pesanan pesanan2 = new Pesanan(2, customer1, double1);
        double1.setDailyTariff(4000000);
        pesanan2.setBiaya();
        
        System.out.println("\n=============DOUBLE=============");
        Administrasi.pesananDitugaskan(pesanan2, double1);
        double1.printData();
        pesanan2.printData();
        
        if(double1 instanceof DoubleRoom)
        {
            System.out.println("\nBenar Double Room");
        }
        else
        {
            System.out.println("\nSalah, bukan Double Room");
        }*/
        
        /*Customer cust1 = new Customer(1, "Jimin");
        Customer cust2 = new Customer(2, "Pratiwi");
        Customer cust3 = new Customer(3, "Tiwi");
        cust1.setEmail("e.t.d@");
        cust2.setEmail("Ee_.td@ui.ac.i");
        cust3.setEmail("Pratiwi.modul5@netlab.co");*/
    }
}
