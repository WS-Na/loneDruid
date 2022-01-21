package reflection;

import loneDruid.Clears;
import loneDruid.Hero;

public class miss7 {
    public static void main(String[] args) {
        String ClassName = "loneDruid.Hero";
        try {
            Class cw = Hero.class;
            Class ce = Class.forName(ClassName);
            Class cr = new Hero().getClass();
            System.out.println(cw == ce);
            System.out.println(cw == cr);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
        for (int i = 0;i<20;i++) {


            Thread t = new Thread() {
                public void run() {
                    miss7.getSentence();
                }

            };
            t.start();
        }
    }

    public synchronized static void getSentence() {
        System.out.println("狂");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
