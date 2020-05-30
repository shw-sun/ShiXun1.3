package com.example.shixun13;

public class Computer {
    private String name;
    private String color;
    private String os;
    private float price;

    public static class Builder{
        Computer computer;

        public Builder (){
            computer=new Computer();
        }

        public Builder setName(String name){
            computer.setName(name);
            return this;
        }
        public Builder setColor(String color){
            computer.setColor(color);
            return this;
        }
        public Builder setOs(String os){
            computer.setOs(os);
            return this;
        }
        public Builder setPrice(float price){
            computer.setPrice(price);
            return this;
        }
        public Computer Builder(){
            return computer;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", os='" + os + '\'' +
                ", price=" + price +
                '}';
    }
}
