package jhotel;
/**
 * class PelangganSudahAdaException - exception jika pelanggan yang baru ditambahkan sudah ada pada database
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class PelangganSudahAdaException extends Exception {
    private Customer pelanggan_error;

    public PelangganSudahAdaException(Customer pelanggan_input){

        super("Pelanggan dengan data :");
        pelanggan_error=pelanggan_input;
    }

    public String getPesan(){
        return super.getMessage() + pelanggan_error + "\nsudah terdaftar.";
    }

}
