package org.benjaminsinzore.fundamentals.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class CreatingAnnotations {

    public static void main(String[] args) throws IllegalAccessException,
            InvocationTargetException {

        String st = " Mr. Money";
        TestMyAnnotations ts = new TestMyAnnotations(st);

        ts.benjamin();

        if (ts.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("This thing is very important.");
        } else {
            System.out.println("This thing is not very important.");
        }


        for (Method method :
                ts.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {

                RunImmediately rm = method.getAnnotation(RunImmediately.class);
                int tm = rm.times();
                for (int i = 0; i < tm; i++){

                    method.invoke(ts);
                }

            }
        }


        for (Field field :
                ts.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {

                Object ob;
                ob = field.get(ts);
                System.out.println(ob.toString().toUpperCase(Locale.ROOT));



                /*
                    ' instanceof ' are only available in JDK 16+
                 */

//                if (ob instanceof String ns){
//                    System.out.println(ns.toUpperCase(Locale.ROOT));
//                }
            }
        }
    }
}
