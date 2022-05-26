package com.company;

public class Hotel extends Person implements Liveable, PayingARent {

    public Hotel() {
    }

    @Override
    void getResident() {
        System.out.println(getResidents() + " residents are living in this wonderful hotel.");
    }

    public Hotel(int residents) {
        super(residents);
    }

    @Override
    public void getAddress() {
        System.out.println("Address of the hotel is 123 Main Street, Anchorage, Alaska state, 99501, USA.");
    }
}
