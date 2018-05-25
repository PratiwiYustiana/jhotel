package jhotel;
/**
 * class PesananSudahAdaException - exception jika pesanan yang baru ditambahkan sudah ada pada database
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class PesananSudahAdaException extends Exception {
    private Pesanan pesanan_error;

    public PesananSudahAdaException(Pesanan pesanan_input){
        super("Pesanan yang dipesan oleh:");
        pesanan_error=pesanan_input;
    }
    public String getPesan(){
        return super.getMessage() + pesanan_error.getPelanggan().getNama() + " \nsudah melakukan pemesanan.";

    }
}
