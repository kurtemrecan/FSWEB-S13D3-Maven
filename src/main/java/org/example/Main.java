package org.example;

public class Main {
    public static void main(String[] args) {

        //Person test
        Person person1=new Person("John","Doe",20);
        Person person2=new Person("Emre","Kurt",26,1.74,72,false);
        System.out.println("Person2 isim: "+person2.getFirstName());
        System.out.println("Person2 soyisim:"+person2.getLastName());
        System.out.println("Person2 yaş:"+person2.getAge());
        System.out.println("Person2 yaş 13-19 arasında mı ?:"+person2.isTeen());


        //Wall test
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}