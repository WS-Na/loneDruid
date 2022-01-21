package reflection;

public class Syn {
/*
在之前有一个练习，练习-在类前面加修饰符synchronized

在对象方法前，加上修饰符synchronized ，同步对象是当前实例。
那么如果在类方法前，加上修饰符 synchronized，同步对象是什么呢？

编写代码进行验证
 */
   public synchronized static void PrintWordle() {
       int num = 0;
       while(true) {
           System.out.println("print"+"---"+num);
           num ++;
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }
}
