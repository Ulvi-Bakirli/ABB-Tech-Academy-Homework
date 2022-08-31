import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Owl extends Pet{

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel1;
    private Set<String> habits;

    public Owl(Species species, String nickname, int age, int trickLevel1, Set<String> habits) {
        super(nickname, age, trickLevel1, habits);
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel1 = trickLevel1;
        this.habits = habits;
    }

    public Owl() {
        super("", 0,0,new HashSet<String>());
        species = Species.UNKNOWN;
        nickname = "";
        age = 0;
        trickLevel1 = 0;
        habits = new HashSet<String>();
    }

    public String  getSpecies() {
        return species.toString();
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

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void respond() {
        System.out.println("Hi, " + nickname + " is here!");
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");;
    }

    @Override
    public String toString() {
        return "Owl{" +
                "species=" + species +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel1=" + trickLevel1 +
                ", habits=" + habits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owl owl = (Owl) o;
        return age == owl.age && trickLevel1 == owl.trickLevel1 && species == owl.species && Objects.equals(nickname, owl.nickname) && Objects.equals(habits, owl.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel1, habits);
    }
}