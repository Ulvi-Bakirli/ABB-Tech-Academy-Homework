import java.util.Random;

public class Human {

//  todo  Describe Human with the following fields:
//            (name)
//            (surname)
//    date of birth (year), number
//    IQ level (iq) (a whole number from 1 to 100))
//            (pet) (object type Pet)
//            (mother) (object type Human)
//            (father) (object type Human)
//    Schedule of non-working activities (schedule) (2d array: [day of the week] x [type of the activity])
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule = new String[7][2];


//  todo  In classHuman create constructors:
//    constructor which describes the name, surname and the date of birth
//    constructor which describes the name, surname, date of birth, father and mother
//    constructor which describes all the fields
//    empty constructor
    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    //  todo   Describe and implement the following methods for Human:
//            (greetPet)("Hello, [the name of the pet]")
//            (describePet): (display the information about your pet: "I have a [species], he is [age] years old, he is [very sly]>50/[almost not sly]<50".
    public void greetPet() {
        System.out.printf("Hello, %s!\n", getPet().getNickname());
    }

    public void describePet() {
        int trickLevel = pet.getTrickLevel();
        String slyLevel;

        if (trickLevel >= 50) {
            slyLevel = "very sly";
        } else {
            slyLevel = "almost not sly";
        }

        System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " + slyLevel);
    }


//  todo Describe and implement the  (feedPet) method in the Human class, which accepts a logical boolean type as a parameter ("isn't it time for feeding "). If it is time - the owner feeds the pet, if not - the trick level is compared to a pseudorandom number of 0-100 using java.util.Random and the owner feeds the pet if the trick level is greater than the generated number. The method should display the following result:
//   (Hm... I will feed Jack's [animal name]//I think Jack is not hungry.) and return a boolean value (true/false) - whether the feeding happened or not.
    public boolean feedPet(boolean isTime) {
        if (isTime) {
            getPet().eat();
            return true;
        } else {
            Random random = new Random();
            int value = random.nextInt(100);

            if (getPet().getTrickLevel() >= value) {
                System.out.println("Hm... I will feed " + getName() + "'s " + getPet().getNickname());
                return true;
            } else {
                System.out.println("I think " + getName() + " is not hungry");
                return false;
            }
        }
    }

//  todo  Redefine the  toString() method for bot classes;
//    The Human class must display the following message: Human{name='Michael', surname='Karleone', year=1977, iq=90, mother=Jane Karleone, father=Vito Karleone, pet=dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother +
                ", father=" + father +
                ", pet=" + pet +
                '}';
    }
}
