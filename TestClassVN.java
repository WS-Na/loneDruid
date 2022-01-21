package reflection;

import loneDruid.Hero;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestClassVN {
    public static void main(String[] args) {
        AdHero h =(AdHero) getHero();
        h.shieldAttack();

    }
public static Hero getHero() {
    Hero h = null;
    File f = new File("/Users/naweishuai/project/loneDruid/reflection/hero.conig");
    try (
            FileReader fr = new FileReader(f);
            ){
        String ClassName = null;
        char[] all = new char[(int)f.length()];
        fr.read(all);
        ClassName = new String(all);
        Class pClass = Class.forName(ClassName);
        Constructor c = pClass.getConstructor();
        h =(Hero) c.newInstance();
        return h;
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (NoSuchMethodException e) {
        e.printStackTrace();
    } catch (InvocationTargetException e) {
        e.printStackTrace();
    } catch (InstantiationException e) {
        e.printStackTrace();
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    }
    return h;
}
}
