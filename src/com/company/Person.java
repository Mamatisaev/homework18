package com.company;

public abstract class Person implements Liveable, PayingARent, PayingUtilities {

    private int residents;

    abstract void getResident();

    public Person() {

    }

    public Person(int residents) {
        this.residents = residents;
    }

    public int getResidents() {
        return residents;
    }

    public void setResidents(int residents) {
        this.residents = residents;
    }

    @Override
    public String toString() {
        return "Person - " +
                "residents = " + residents;
    }

}
