package com.objectorientedprogramming;

/**
 * @author prachi.shah
 */
public class OopInitializer {

    public static void main(String[] args) {
        Person person = new Person("Amanda Jones", 21);
        Person artist = new Artist("Nicky Brown", 22, "Cinema", "Los Angelos");
        Person doctor = new Doctor("Stephen Miller", 23, "Cardiology", "San Mateo");
        Person chef = new Chef("Carol Williams", 24, "Burger Heaven", "Bakersfield");

        // Print details
        System.out.println(
                person.getName() + " has age " + person.getAge() + " and has salary " + person.getSalary());
        System.out.println(
                artist.getName() + " has age " + artist.getAge() + " and has salary " + artist.getSalary());
        System.out.println(
                chef.getName() + " has age " + chef.getAge() + " and has salary " + chef.getSalary());
        System.out.println(
                doctor.getName() + " has age " + doctor.getAge() + " and has salary " + doctor.getSalary());

        Artist newArtist = new Artist("Jeff Ford", 25, "Theatre", "New York");
        Doctor newDoctor = new Doctor("Melvin Green", 26, "Urgent Care Unit", "Austin");
        Chef newChef = new Chef("Lucy Roberts", 27, "Sandwich Place", "Seattle");

        // Print details
        System.out.println();
        System.out.println(
                newArtist.getName()
                        + " has age " + newArtist.getAge()
                        + " and works in " + newArtist.getIndustry()
                        + " at " + newArtist.getLocationCity()
                        + " and has salary " + newArtist.getSalary());
        System.out.println(
                newChef.getName()
                        + " has age " + newChef.getAge()
                        + " and works in " + newChef.getRestaurantName()
                        + " at " + newChef.getRestaurantLocationCity()
                        + " and has salary " + newChef.getSalary());
        System.out.println(
                newDoctor.getName()
                        + " has age " + newDoctor.getAge()
                        + " and works in " + newDoctor.getDepartment()
                        + " at " + newDoctor.getHospitalLocationCity()
                        + " and has salary " + newDoctor.getSalary());
    }
}