import java.util.Set;

public abstract class Pet
{
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel1;
    private Set<String> habits;

    public Pet(String nickname, int age, int trickLevel1, Set<String> habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel1 = trickLevel1;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();

    public void foul() {
        System.out.println("I don`t do like this nasty things");
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel1() {
        return trickLevel1;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public abstract String getSpecies();
}