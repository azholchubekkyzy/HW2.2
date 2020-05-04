package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Room").print();
        createObject("Garden").print();
        createObject("Kitchen").print();

    }

    public static Printable createObject(String classname) {
        Printable print = null;
        switch (classname) {
            case "Room":
                print  = new Room ("средний", "cветло-голубой");

                break;

            case "Garden":
                 print = new Garden("маленький", "из роз" );
                 break;



            case "Kitchen":
                print = new Kitchen ("средняя", 2);
                break;




        }



        return print;
        }




}