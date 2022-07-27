import java.util.Arrays;

public class Pet {
    /*todo Describe the Pet with the following fields:
            (species)
            (nickname)
            (age)
            (trickLevel) (a whole number from 1 to 100)
            (habits) (array of strings)*/
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits = new String[3];


//  todo  In class Pet create constructors:
//    constructor which describes the pet's species an nickname
//    constructor which describes all the fields for the pet
//    empty constructor

    public Pet(String species) {
        this.species = species;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(byte trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    //   todo Describe and implement the following methods for Pet:
//            (eat) (method displays a message 'I am eating')
//            (respond) (method displays a message 'Hello, owner. I am - [the name of the pet]. I miss you!')
//            (foul) (method displays a message 'I need to cover it up')

    public void eat(){
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

//  todo  Redefine the  toString() method for bot classes;
//    The Pet class must display the following message: dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}, where dog = species;

    @Override
    public String toString() {
        return  species + "{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
