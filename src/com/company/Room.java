package com.company;

public class Room extends  House implements Printable {

    private String color;


   public Room (String size,String color  ){
       super(size);
       this.color=color;

   }

   public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println(" Цвет " + getColor() + " Размер " + getSize());


    }
}
