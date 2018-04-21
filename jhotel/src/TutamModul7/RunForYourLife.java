package TutamModul7;

public class RunForYourLife implements Runnable{
    private String Nama;
    private int delay;
    public static int checkpoint = 20;

    public RunForYourLife(String Nama, int delay) {
        this.Nama = Nama;
        this.delay = delay;
        System.out.println(Nama + ", ready.");
    }

    public void run(){
        System.out.println(Nama + ", go!");
        for(int i = 0;i<checkpoint;i++){
            System.out.println(Nama + "\thas passed checkpoint (" + (i+1) + ")");
            try{
                Thread.sleep(delay);
            } catch(InterruptedException E){
                System.out.println(Nama + " was interrupted.");
            }
        }
        System.out.println(Nama + " has finished!");
    }

    public void start(){
        System.out.println(Nama + ", set ..");
        (new Thread(this, Nama)).start();
    }

}
