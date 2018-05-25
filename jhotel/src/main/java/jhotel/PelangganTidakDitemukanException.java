package jhotel;
/**
 * class PelangganTidakDitemukanException - exception jika pelanggan yang ingin dihapus tidak ditemukan dalam database
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class PelangganTidakDitemukanException extends Exception{
    private int pelanggan_error;

    public PelangganTidakDitemukanException(int pelanggan_input){
        super("Data Customer dengan ID:");
        pelanggan_error=pelanggan_input;
    }
    public String getPesan(){
        return super.getMessage() + pelanggan_error + "\ntidak ditemukan.";
    }

}
