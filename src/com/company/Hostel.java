package com.company;

public class Hostel extends Person implements Liveable, PayingARent {

    public Hostel() {
    }

    @Override
    void getResident() {
        System.out.println(getResidents() + " residents are living in this amazing hostel.");
    }

    public Hostel(int residents) {
        super(residents);
    }

    @Override
    public void getAddress() {
        System.out.println("Address of the hostel is 40 Theatre Street, Sun City, Arizona state, 85351, USA.");
    }


}
