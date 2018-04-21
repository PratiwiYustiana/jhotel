package TutamModul7;

import java.util.Random;
public class LetsGo {
    public static int random(){
        int min = 100;
        int max = 500;
        return new Random().nextInt((max-min))+min;
    }

    public static void main(String[] args){
        int x1,x2,x3;
        do {
            x1 = random();
            x2 = random();
            x3 = random();
        }while(!(x1>x2 && x2>x3));

        RunForYourLife Lionel = new RunForYourLife("Lionel",x1);
        Lionel.start();
        RunForYourLife Andres = new RunForYourLife("Andres",x2);
        Andres.start();
        RunForYourLife Messi = new RunForYourLife("Messi",x3);
        Messi.start();
    }
}
