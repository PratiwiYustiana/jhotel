package jhotel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
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
     */
    public static void main(String args[])
    {

        SpringApplication.run(JHotel.class, args);
        try {
        DatabaseHotel.addHotel(new Hotel("Hilton", new Lokasi(4, 3, "Jati Padang"),4));

        } catch(HotelSudahAdaException e){
        e.getPesan();
        }

        try {

            DatabaseHotel.addHotel(new Hotel("Aston", new Lokasi(2, 2, "Cilandak"),5));
        } catch(HotelSudahAdaException e){
            e.getPesan();
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1),"666"));


        } catch(RoomSudahAdaException e){
            e.getPesan();
        }


        try {

            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "999"));


        } catch(RoomSudahAdaException e){
            e.getPesan();
        }


        try {

            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(2),"333"));

        } catch(RoomSudahAdaException e){
            e.getPesan();
        }

        /*System.out.println("Welcome to JHotel");
        System.out.println("===============TES EXCEPTION===============\n");
        try {
            DatabaseCustomer.addCustomer(new Customer("Tiwi", 25, 6, 1997, "tiwi@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Pratiwi", 24, 3, 1998, "pratiwi@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Pratiwi", 24, 3, 1998, "pratiwi@gmail.com"));
        }
        catch(PelangganSudahAdaException e){
            System.out.println("\n-Exception Pelanggan Sudah Ada-");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseHotel.addHotel(new Hotel("Argo", new Lokasi(30, 30, "Depok1"), 5));
            DatabaseHotel.addHotel(new Hotel("Sartika", new Lokasi(20, 10, "Depok2"), 3));
            DatabaseHotel.addHotel(new Hotel("Novel", new Lokasi(10, 10, "Depok3"), 4));
            DatabaseHotel.addHotel(new Hotel("Novel", new Lokasi(10, 10, "Depok3"), 4));
        } catch(HotelSudahAdaException e){
            System.out.println("\n-Exception Hotel Sudah Ada-");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "101"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "102"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "103"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "103"));

        } catch(RoomSudahAdaException e){
            System.out.println("\n-Exception Room Sudah Ada-");
            System.out.println(e.getPesan());
        }

        try {
            DatabasePesanan.addPesanan(new Pesanan(5, DatabaseCustomer.getCustomer(1)));
            DatabasePesanan.addPesanan(new Pesanan(7, DatabaseCustomer.getCustomer(2)));
            DatabasePesanan.addPesanan(new Pesanan(7, DatabaseCustomer.getCustomer(2)));
        } catch(PesananSudahAdaException e){
            System.out.println("\n-Exception Pesanan Sudah Ada-");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseCustomer.removeCustomer(10);
        } catch(PelangganTidakDitemukanException e){
            System.out.println("\n-Exception Pelanggan Tidak Ditemukan-");
            System.out.println(e.getPesan());
        }
        Customer cust = new Customer("Wibowo",12,12,1212,"prikitiw@gmail.com");
        Pesanan pesan = new Pesanan(32,cust);
        try{
            DatabasePesanan.removePesanan(pesan);
        } catch(PesananTidakDitemukanException e){
            System.out.println("\n-Exception Pesanan Tidak Ditemukan-");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseHotel.removeHotel(99);
        } catch(HotelTidakDitemukanException e){
            System.out.println("\n-Exception Hotel Tidak Ditemukan-");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseRoom.removeRoom(DatabaseHotel.getHotel(2),"s601");
        } catch(RoomTidakDitemukanException e){
            System.out.println("\n-Exception Room Tidak Ditemukan-");
            System.out.println(e.getPesan());
        }


        System.out.println("===========HASIL==========");

        System.out.println(DatabaseCustomer.getCustomerDatabase());
        System.out.println(DatabaseHotel.getHotelDatabase());
        System.out.println(DatabaseRoom.getRoomDatabase());
        System.out.println(DatabasePesanan.getPesananDatabase());*/

    }
}
