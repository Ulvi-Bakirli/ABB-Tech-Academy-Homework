import java.util.*;


public class Family implements HumanCreator {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pet;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        children = new ArrayList<Human>();
        pet = new HashSet<Pet>();
    }

    public Family(Human mother, Human father, Human children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children.add(children);
        this.pet.add(pet);
    }

    @Override
    public Human bornChild() {
        Human child = new Human();
        int value = new Random().nextInt(2);
        if (value % 2 == 0) {
            child = new Woman(mother.getName(), father.getSurname(), 2022, (int) (father.getIq() + mother.getIq()) / 2);
            child.setName(mother.getName());
        } else {
                child = new Man(father.getName(), father.getSurname(), 2022, (int) (father.getIq() + mother.getIq()) / 2);
            }

        this.addChild(child);
        Family family = new Family(father, mother);
        child.setFamily(family);

        return child;
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

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        children.add(child);
    }

    public void deleteChild(Human child) {
        children.remove(child);
    }

    public Human deleteChildByID(int id) {
        return children.remove(id);
    }

    public int countFamily() {
        if (this.children != null) {
            return 2 + this.getChildren().size();
        } else {
            return 2;
        }
    }

    public void greetPet() {
        this.pet.forEach(k -> System.out.printf("Hello, %s\n", k.toString()));
    }

    public void describePet() {
        StringBuilder slyLevel = new StringBuilder("");
        for (Pet k : this.pet) {
            if (k.getTrickLevel1() > 50) {
                slyLevel.append("very sly");
            } else if (k.getTrickLevel1() < 50) {
                slyLevel.append("almost not sly");
            } else {
                slyLevel.append("sly");
            }
            System.out.println("I have a " + k.getSpecies() + ",he is " + k.getAge() + " years old,he is " + slyLevel);
        }
    }


    public boolean feedPet(boolean check) {
        Random random = new Random();
        int randomTrickLevel = random.nextInt(100) + 1;
        for (Pet p : pet) {
            if (randomTrickLevel > p.getTrickLevel1()) {
                System.out.println("I will feed " + p.getNickname());
                check = true;
            } else {
                System.out.println("I think " + p.getNickname() + " is not hungry.");
                check = false;
            }
        }
        return check;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        Family family = (Family) object;
        return Objects.equals(father, family.father)
                && Objects.equals(mother, family.mother)
                && Objects.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getMother(), getFather());
        result = result + Objects.hash(getChildren());
        return result;
    }

    @Override
    protected void finalize() {
        System.out.printf("Family %s and %s deleted\n", mother, father);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }
}