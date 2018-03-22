
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
        Pesanan pesanan = new Pesanan(); 

        DatabasePesanan.addPesanan(pesanan); 
         
        System.out.println("\n\ntoString kelas Customer untuk kondisi pertama : \n\n"); 
        System.out.println(testing.toString()); 
        DatabasePesanan.removePesanan(); 
        System.out.println("\n\ntoString kelas Customer untuk kondisi kedua   : \n\n"); 
        System.out.println(testing.toString()); 
         
        Lokasi lokasi = new Lokasi(99, 999, "Taman Melati"); 
        Hotel hotel = new Hotel("Melati", lokasi, 7); 
        Room kamar = new SingleRoom(hotel, "GK210", true, StatusKamar.Vacant); 
        Pesanan pesan = new Pesanan(10, testing, kamar, new GregorianCalendar(2018,2,22).getTime()); 

        kamar.setPesanan(pesan);  
         
        System.out.println("\n\ntoString kelas Room untuk kondisi pertama : \n\n"); 
        System.out.println(kamar.toString()); 
        kamar.setStatusAvailable(false); 
        System.out.println("\n\ntoString kelas Room untuk kondisi kedua   : \n\n"); 
        System.out.println(kamar.toString()); 
         
        pesan.setStatusDiproses(true); 
        pesan.setStatusSelesai(false); 
         
        System.out.println("\n\ntoString kelas Pesanan untuk kondisi pertama : \n\n"); 
        System.out.println(pesan.toString()); 

        pesan.setStatusDiproses(false); 
        pesan.setStatusSelesai(false); 

        System.out.println("\n\ntoString kelas Pesanan untuk kondisi kedua   : \n\n"); 
        System.out.println(pesan.toString()); 
         
        pesan.setStatusDiproses(false); 
        pesan.setStatusSelesai(true); 

        System.out.println("\n\ntoString kelas Pesanan untuk kondisi ketiga   : \n\n"); 
        System.out.println(pesan.toString());
        /*Customer cust1 = new Customer(1, "Tiwi", new GregorianCalendar(1997,6,25).getTime());
        cust1.getDOB();*/
        
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
