package org.benjaminsinzore.fundamentals.enums;

public class TestMyEnum {

    public static void main(String[] args){

        DaysOfTheWeek dw = DaysOfTheWeek.MONDAY;
        Cereals cs;

        if (dw == DaysOfTheWeek.MONDAY){
            System.out.println("It's Monday.");
        }

        for (DaysOfTheWeek db :
                DaysOfTheWeek.values()) {
            System.out.println(db);
        }


        for (int i = 0; i < Cereals.values().length; i++){
            System.out.println(Cereals.values()[i]);
        }
    }
}
