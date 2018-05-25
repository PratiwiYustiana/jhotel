package jhotel;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseHotel here.
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class DatabaseHotel
{
    // instance variables - replace the example below with your own
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * Constructor for objects of class DatabaseHotel
     */
    public DatabaseHotel()
    {
        // initialise instance variables
        
    }

    /**
     * method untuk mangambil data pada database hotel
     */
    public static ArrayList<Hotel> getHotelDatabase()
    {
        return HOTEL_DATABASE;
    }
    /**
     * method untuk mengambil id hotel terakhir
     */
    public static int getLastHotelID()
    {
        return LAST_HOTEL_ID;
    }
    /**
     * method untuk menambahkan hotel baru
     */
    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException
    {
        // put your code here
        for (Hotel hotel : HOTEL_DATABASE) {
            if(hotel.getID() == baru.getID()||hotel.getNama()==baru.getNama())
                throw new HotelSudahAdaException(baru);
        }
        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID = baru.getID();
        return true;
    }
    /**
     * method untuk mengambil data hotel yang bersangkutan
     */
    public static Hotel getHotel(int id){
        for (Hotel hotel : HOTEL_DATABASE) {
            if (hotel.getID() == id)
                return hotel;
        }
        return null;
    }
    /**
     * method untuk menghapus data hotel yang bersangkutan
     */
    public static boolean removeHotel(int id) throws HotelTidakDitemukanException {
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if(hotel.getID()==id){
                for (Room kamar :
                        DatabaseRoom.getRoomsFromHotel(hotel)) {
                    try {
                        DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                    } catch (RoomTidakDitemukanException e) {
                        e.getPesan();
                    }
                }
                HOTEL_DATABASE.remove(hotel);
                return true;
            }
        }
        throw new HotelTidakDitemukanException(id);
    }
}
