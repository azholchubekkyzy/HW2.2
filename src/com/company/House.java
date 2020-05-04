package com.company;

public class House implements Printable {
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public House(String size) {
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println(" Size "+size);


    }
}
