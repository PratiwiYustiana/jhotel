
/**
 * class Lokasi.
 *
 * @author Pratiwi Yustiana
 * @version 01/03/2018
 */
public class Lokasi
{
    // instance variables - replace the example below with your own
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;

    /**
     * Constructor untuk objek pada kelas Lokasi
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        // assign instance variables
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }

    /**
     * method kelas Lokasi
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /**
     * mengakses nilai X
     */
    public float getX()
    {
        return x_coord;
    }
    /**
     * mengakses nilai Y
     */
    public float getY()
    {
        return y_coord;
    }
    /**
     * mengakses deskripsi
     */
    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }
    /**
     * meng-update nilai X
     */
    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    }
    /**
     * meng-update nilai Y
     */
    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }
    /**
     * meng-update deskripsi
     */
    public void setDeskripsi(String deskripsi)
    {
        deskripsiLokasi = deskripsi;
    }
    /**
     * mencetak data deskripsiLokasi
     */
    public void printData()
    {
        System.out.println(deskripsiLokasi);
    }
}
