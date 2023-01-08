package org.benjaminsinzore.fundamentals.annotations;

@VeryImportant
public class TestMyAnnotations {

    @ImportantString
    String name;
    int age;

    public TestMyAnnotations(String name){
        this.name = name;
    }

    @RunImmediately(times = 3)
    public void  benjamin(){
        System.out.println("Hello Benjamin"+name);
    }

    public void  sin(){
        System.out.println("Hello Sin");
    }
}
