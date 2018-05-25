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

        try {
        DatabaseHotel.addHotel(new Hotel("Bangtan Hotel", new Lokasi(4, 3, "Seoul"),4));

        } catch(HotelSudahAdaException e){
        e.getPesan();
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1),"B1306"));


        } catch(RoomSudahAdaException e){
            e.getPesan();
        }


        try {

            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "T2506"));


        } catch(RoomSudahAdaException e){
            e.getPesan();
        }


        try {

            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1),"S3301"));

        } catch(RoomSudahAdaException e){
            e.getPesan();
        }

        SpringApplication.run(JHotel.class, args);
        

    }
}
