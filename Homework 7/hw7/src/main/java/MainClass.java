import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        Owl owl = new Owl();
        owl.setNickname("Hedwig");
        owl.setSpecies(Species.OWL);
        owl.setAge(5);
        owl.setTrickLevel1(23);
        owl.setHabits(new String[]{"fly", "deliver a letter"});
        owl.eat();
        owl.respond();
        owl.foul();
        System.out.println(owl);

        Human human = new Human();
        human.setName("Harry");
        human.setSurname("Potter");
        human.setYear(1980);
        human.setSchedule(new String[][]{{DayOfWeek.MONDAY.name(), "Go to Hogwarts"}, {DayOfWeek.TUESDAY.name(), "Go to Azkaban"}});
        human.setIq(120);
        Woman mother = new Woman();
        mother.setName("Lily");
        mother.setSurname("Potter");
        Man father = new Man();
        father.setName("James");
        father.setSurname("Potter");

        Family humansFamily = new Family(mother, father);
        human.setFamily(humansFamily);
        human.setYear(2022);
        System.out.println(human);

        Woman motherRon = new Woman();
        motherRon.setName("Molly");
        motherRon.setSurname("Weasley");
        Man fatherRon = new Man();
        fatherRon.setName("Arthur");
        fatherRon.setSurname("Weasley");
        Woman RonGrandmother = new Woman();
        RonGrandmother.setName("Jessica");
        RonGrandmother.setSurname("Weasley");
        Man RonGrandFather = new Man();
        RonGrandFather.setName("James");
        RonGrandFather.setSurname("Weasley");
        father.setFamily(new Family(RonGrandmother, RonGrandFather));
        Family family = new Family(fatherRon, motherRon);

        Man William = new Man();
        William.setName("William");
        William.setSurname("Weasley");
        Woman Isabelle = new Woman();
        Isabelle.setName("Isabelle");
        Isabelle.setSurname("Weasly");
        Man Charles = new Man();
        Charles.setName("Charles");
        Charles.setSurname("Wasley");

        DomesticCat cat = new DomesticCat();
        cat.setNickname("Crookshanks");
        cat.setSpecies(Species.CAT);
        cat.setHabits(new String[]{"sleeping", "sleeping"});
        cat.setAge(4);
        cat.setTrickLevel1(90);

        family.addChild(William);
        family.addChild(Isabelle);
        family.addChild(Charles);
        family.setPet(cat);
        System.out.println(family.deleteChild(2));
        family.greetPet();
        System.out.println(family.countFamily());
        family.describePet();
        System.out.println(family.feedPet(true));
        System.out.println(family);

        family.bornChild();
        System.out.println("new born:");
        System.out.println(Arrays.toString(family.getChildren()));


//        Create the right amount of loops in the Main class of the Human object so that the garbage collector would start deleting old objects (from 10 thousand untill 10 million, depending on the amount of free ram)
        int stop = 0;
        while (true) {
            stop++;
            if (stop == 1_00_00) {
                System.gc();
                break;
            }
        }
    }
}