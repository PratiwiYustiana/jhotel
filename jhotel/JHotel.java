
/**
 * class JHotel - berisi method main yang akan dijalankan pertama kali
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
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
        System.out.println("Welcome to JHotel");
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
        
        
    }
}
