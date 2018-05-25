package jhotel;
/**
 * class PesananTidakDitemukanException - exception jika ingin menghapus pesanan yang tidak ada pada database
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class PesananTidakDitemukanException extends Exception {
    private Customer pelanggan_error;

    public PesananTidakDitemukanException(Customer pelanggan_input){
        super("Pesanan yang dipesan oleh :");
        pelanggan_error=pelanggan_input;
    }
    public String getPesan(){
        return super.getMessage() + pelanggan_error.getNama() + "\ntidak ditemukan.";
    }
}
