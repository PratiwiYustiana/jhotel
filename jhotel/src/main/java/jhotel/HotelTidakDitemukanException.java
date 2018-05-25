package jhotel;
 /**
 * class HotelTidakDitemukanException - exception jika ingin menghapus hotel yang tidak ada pada database
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class HotelTidakDitemukanException extends Exception{
    private int hotel_error;

    public HotelTidakDitemukanException(int hotel_input){
        super("Hotel dengan ID :");
        hotel_error=hotel_input;
    }
    public String getPesan(){
        return super.getMessage() + hotel_error + "\ntidak ditemukan.";

    }
}
