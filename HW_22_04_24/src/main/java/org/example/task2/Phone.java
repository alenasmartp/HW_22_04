package org.example.task2;

public class Phone {
        private String number;
        private String model;
        private double weight;

    public void printPhoneInfo() {
        System.out.println("number: " + number + ", model: " + model + ", weight: " + weight);
    }
    public void receiveCall(String name) {
        System.out.println(name + " calling");
    }
        public Phone(String number, String model, double weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }
    }

