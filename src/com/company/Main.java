package com.company;

public class Main {

    public static void main(String[] args) {

        Flat flat = new Flat(5);
        Hostel hostel = new Hostel(6);
        Hotel hotel = new Hotel(7);

        flat.getResident();
        hostel.getResident();
        hotel.getResident();

        Liveable[] families = {flat, hostel, hotel};

        for (Liveable liveable : families) {
            liveable.getAddress();
        }
    }
}