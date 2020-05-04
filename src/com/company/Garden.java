package com.company;

public class Garden extends House implements Printable {

    private String flowers;

    public Garden(String size, String flowers) {
        super(size);
        this.flowers = flowers;
    }

    public String getFlowers() {
        return flowers;
    }

    @Override
    public void print() {
        System.out.println(" Цветы " + getFlowers() + " Размер " + getSize());

    }
}
