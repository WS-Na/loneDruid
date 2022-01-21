package reflection;

public class Plain {
    static {
        xc = 8;
    }

    static int  xc = 8000;
    {
        int  xc = 9;
    }

    public static void main(String[] args) {
        Plain p = new Plain();
        System.out.println(p.xc);
    }
}
