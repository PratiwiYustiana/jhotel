package jhotel;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseRoom here.
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class DatabaseRoom
{
    // instance variables - replace the example below with your own
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<>();
    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }
    /**
     * Constructor for objects of class DatabaseRoom
     */
    public DatabaseRoom()
    {
        // initialise instance variables
        
    }

    /**
     * method untuk menambah kamar baru pada database
     */
    public static boolean addRoom(Room baru) throws RoomSudahAdaException
    {
        // put your code here
        if(baru.getHotel() != null) {
        for (Room kamar : ROOM_DATABASE) {
            if(kamar.getHotel().equals(baru.getHotel())){
                if(baru.getNomorKamar().compareTo(kamar.getNomorKamar()) == 0){
                    throw new RoomSudahAdaException(baru);
                }
            }
        }
        ROOM_DATABASE.add(baru);
        return true;
    }
    else return false;
    }
    /**
     * method untuk mengambil data kamar pada database
     */
    public static Room getRoom(Hotel hotel,String nomor_kamar){
        for (Room kamar :
                ROOM_DATABASE) {
            if (kamar.getHotel().equals(hotel) && kamar.getNomorKamar().compareTo(nomor_kamar) == 0) {
                return kamar;
            }
        }
        return null;
    }
    /**
     * method untuk mengambil data kamar hotel
     */
    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel){
        ArrayList<Room> toReturn = new ArrayList<>();
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getHotel().equals(hotel)){
                toReturn.add(kamar);
            }
        }
        return toReturn;
    }
    /**
     * method untuk mengambil data kamar kosong
     */
    public static ArrayList<Room> getVacantRooms(){
        ArrayList<Room> toReturn = new ArrayList<>();
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getStatusKamar().equals(StatusKamar.VACANT)){
                toReturn.add(kamar);
            }
        }
        return toReturn;
    }
    /**
     * method untuk menghapus data kamar pada database
     */
    public static boolean removeRoom(Hotel hotel, String nomor_kamar)throws RoomTidakDitemukanException{
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getHotel().equals(hotel)){
                if(kamar.getNomorKamar().compareTo(nomor_kamar) == 0){
                    Administrasi.pesananDibatalkan(kamar);
                    ROOM_DATABASE.remove(kamar);
                    return true;
                }
            }
        }
        throw new RoomTidakDitemukanException(hotel, nomor_kamar);
    }
}
