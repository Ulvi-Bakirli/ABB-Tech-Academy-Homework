public class MainClass {

    public static void main(String[] args) {

        Pet pet = new Pet();
        pet.setNickname("Hedwig");
        pet.setSpecies("Owl");
        pet.setAge(5);
        pet.setTrickLevel1(23);
        pet.setHabits(new String[]{"fly", "deliver a letter"});
        pet.eat();
        pet.respond();
        pet.foul();
        System.out.println(pet);

        Human human = new Human();
        human.setName("Harry");
        human.setSurname("Potter");
        human.setYear(1980);
        human.setSchedule(new String[][]{{"Monday", "Go to Hogwarts"}, {"Tuesday", "Go to Azkaban"}});
        human.setIq(120);
        Human mother = new Human();
        mother.setName("Lily");
        mother.setSurname("Potter");
        Human father = new Human();
        father.setName("James");
        father.setSurname("Potter");

        Family humansFamily = new Family(mother, father);
        human.setFamily(humansFamily);
        human.setYear(2022);
        System.out.println(human);

        Human motherRon = new Human();
        motherRon.setName("Molly");
        motherRon.setSurname("Weasley");
        Human fatherRon = new Human();
        fatherRon.setName("Arthur");
        fatherRon.setSurname("Weasley");
        Human RonGrandmother = new Human();
        RonGrandmother.setName("Jessica");
        RonGrandmother.setSurname("Weasley");
        Human RonGrandFather = new Human();
        RonGrandFather.setName("James");
        RonGrandFather.setSurname("Weasley");
        father.setFamily(new Family(RonGrandmother, RonGrandFather));
        Family family = new Family(fatherRon, motherRon);

        Human William = new Human();
        William.setName("William");
        William.setSurname("Weasley");
        Human Isabelle = new Human();
        Isabelle.setName("Isabelle");
        Isabelle.setSurname("Weasly");
        Human Charles = new Human();
        Charles.setName("Charles");
        Charles.setSurname("Wasley");

        Pet cat = new Pet();
        cat.setNickname("Crookshanks");
        cat.setSpecies("Cat");
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
    }
}