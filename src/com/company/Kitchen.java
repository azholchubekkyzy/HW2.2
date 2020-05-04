package com.company;

public class Kitchen extends House implements Printable {

    private int table;

    public Kitchen(String size, int table) {
        super(size);
        this.table = table;
    }

    public int getTable() {
        return table;
    }


    @Override
    public void print () {
        System.out.println(" Стол " + getTable() + " Размер " + getSize());

    }
}
