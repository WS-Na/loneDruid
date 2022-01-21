package reflection;

public class Pa {
    static int a = 1;
    {
        a = 2;
    }
    public Pa(){
a=3;
    }

    public static void main(String[] args) {
        System.out.println(Pa.a);
    }
    public static void getWordle() {

    }
}

