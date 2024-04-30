package org.example.task2;

public class PhoneTester {
    public static void main(String[] args) {
        Phone ph1 = new Phone("+111", "Samsung g1", 150);
        ph1.printPhoneInfo();
        ph1.receiveCall("Bob Brown");

        Phone ph2 = new Phone("+222", "Samsung g2", 170);
        ph1.printPhoneInfo();
        ph1.receiveCall("Anna Smith");

        Phone ph3 = new Phone("+333", "Samsung g3", 200);
        ph1.printPhoneInfo();
        ph1.receiveCall("Ilon Mask");

    }

}
