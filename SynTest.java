package reflection;

public class SynTest {
    public static void main(String[] args) {
        Thread tt = new Thread(){
            @Override
            public void run() {
                Syn.PrintWordle();
            }
        };
        Thread tt2 = new Thread(){
            @Override
            public void run() {
                Syn.PrintWordle();
            }
        };
        tt.start();
        tt2.start();
    }
}
