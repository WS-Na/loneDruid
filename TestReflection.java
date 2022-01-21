package reflection;

public class TestReflection {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                TestReflection.method1("method1");
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                TestReflection.method1("method2");
            }
        };
        t2.start();
        Thread.sleep(1000);
        t1.start();
    }
    public static void method1(String name) {
        System.out.println("同步上面⬆️");
        synchronized (TestReflection.class) {
            System.out.println(Thread.currentThread().getName() + name);
            try {
                System.out.println("运行5秒");
                for(int i = 0;i<5;i++ ) {
                    Thread.sleep(1000);
                    System.out.println("第"+(i+1)+"秒"+name);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0;i<5;i++) {
            System.out.println("🍎");
        }
    }

    public synchronized static void method2(String name) {
        System.out.println(Thread.currentThread().getName() + name);
        try {
            System.out.println("运行5秒");
            for(int i = 0;i<5;i++ ) {
                Thread.sleep(1000);
                System.out.println("第"+(i+1)+"秒"+name);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
