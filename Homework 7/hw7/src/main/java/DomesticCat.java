public class DomesticCat extends Pet {

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel1;
    private String[] habits;

    public DomesticCat(Species species, String nickname, int age, int trickLevel1, String[] habits) {
        super(nickname, age,trickLevel1, habits);
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel1 = trickLevel1;
        this.habits = habits;
    }

    public DomesticCat() {
        super("", 0,0,new String[0]);
        species = Species.UNKNOWN;
        nickname = "";
        age = 0;
        trickLevel1 = 0;
        habits = new String[0];
    }

    public String getSpecies() {
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

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public void respond() {
        System.out.println("Hi, " + nickname + " is here!");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }
}
