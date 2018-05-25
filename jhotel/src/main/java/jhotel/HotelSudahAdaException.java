package jhotel;
 /**
 * class HotelSudahAdaException - exception jika hotel yang baru ditambahkan sudah ada dalam database
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class HotelSudahAdaException extends Exception {
    private Hotel hotel_error;

    public HotelSudahAdaException(Hotel hotel_input){
        super("Hotel dengan nama :");
        hotel_error=hotel_input;
    }

    public String getPesan(){
        return super.getMessage() + hotel_error.getNama() + "\nsudah terdaftar.";
    }
}
