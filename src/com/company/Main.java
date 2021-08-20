package com.company;

public class Main {

    public static void main(String[] args) {
        //напишите тут ваш код
                Cat cat = new Cat( );
                Dog dog = new Dog ();
                Fish fish = new Fish();
                Woman woman = new Woman();
        cat.owner = woman;
        // в dog.owner сохраняем ссылку на ранее созданный объект Woman
        dog.owner = woman;
        // в fish.owner сохраняем ссылку на ранее созданный объект Woman
        fish.owner = woman;
    }

    public static class Cat {
        public Woman owner;

        public Cat(String owner) {
        }

        public Cat() {

        }
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}

