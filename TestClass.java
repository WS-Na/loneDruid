package reflection;

import loneDruid.Hero;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestClass {
    public static void main(String[] args) {
        String ClassName = "loneDruid.Hero";
        Class pClass = Hero.class;
        Constructor c = null;
        try {
            Class xClass = Class.forName(ClassName);
            c = pClass.getConstructor();
            Constructor co = xClass.getConstructor();
            System.out.println(co == c);
            Hero h1 = (Hero)c.newInstance();
            h1.setName("Tusk");
            System.out.println(h1.getName());
            System.out.println(Hero.getCopyright());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
