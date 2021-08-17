package reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {




    @Test
    void reflectionGetFieldsAndMethods() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        MyClass myClass = new MyClass();
        myClass.setLastName("Жданок");
        Field fieldLustName = myClass.getClass().getDeclaredField("lastName");
        fieldLustName.setAccessible(true);
        Field fieldName = myClass.getClass().getDeclaredField("name");
        fieldName.setAccessible(true);
        fieldName.set(myClass, "Luda");
        System.out.println(myClass.getName() + " " + fieldLustName.get(myClass));

        Method method = myClass.getClass().getDeclaredMethod("printData");
        method.setAccessible(true);
        method.invoke(myClass);
    }

    @Test
    void reflectionGetClass() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        MyClass myClass;
        MyClass myClass2;
        Class clazzz = Class.forName(MyClass.class.getName());
        myClass = (MyClass) clazzz.getConstructor().newInstance();
        System.out.println(myClass);

        Class classss = Class.forName(MyClass.class.getName());
        Class[] params = {String.class, String.class};
        myClass2 = (MyClass) classss.getConstructor(params).newInstance("luda", "zhdanok");
        System.out.println(myClass2);


    }
    @Test
    void staticMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MyClass myClass = new MyClass();
        Method method = myClass.getClass().getDeclaredMethod("printStaticData");
        method.setAccessible(true);
        method.invoke(myClass);
    }

}