import java.util.Arrays;
import java.util.Objects;

public class Pet
{

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel1;
    private String[] habits;

    public Pet() {

    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, Integer age, Integer trickLevel1, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel1 = trickLevel1;
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
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

    public int getTrickLevel1() {
        return trickLevel1;
    }

    public void setTrickLevel1(int trickLevel1) {
        this.trickLevel1 = trickLevel1;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + this.nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        Pet pet = (Pet) object;
        return Objects.equals(nickname, pet.nickname)
                && Objects.equals(trickLevel1, pet.trickLevel1)
                && Objects.equals(species, pet.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpecies(), getNickname(), getAge(), getTrickLevel1());
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel1=" + trickLevel1 +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    @Override
    protected void finalize() {
        System.out.printf("%s deleted\n", nickname);
    }
}