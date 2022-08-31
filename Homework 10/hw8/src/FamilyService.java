import java.util.List;
import java.util.Set;

public class FamilyService extends CollectionFamilyDao implements FamilyDao {

    @Override
    public List<Family> getAllFamily() {
        return super.getAllFamily();
    }

    public void displayAllFamilies() {
        families.forEach(family -> System.out.printf("index: %d, family: %s\n", families.indexOf(family), family));
    }

    public void getFamiliesBiggerThan(int value) {
        families.stream()
                .filter(family -> family.countFamily() > value)
                .forEach(System.out::println);
    }

    public void getFamiliesLessThan(int value) {
        families.stream()
                .filter(family -> family.countFamily() < value)
                .forEach(System.out::println);
    }

    public int countFamiliesWithMemberNumber(int value) {
        return (int) families.stream()
                .filter(family -> family.countFamily() == value)
                .count();
    }

    public void createNewFamily(Human father, Human mother) {
        Family family = new Family(father, mother);
        families.add(family);
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return super.getFamilyByIndex(index);
    }

    public Family bornChild(Family family, String sex) {
        String masculine = "masculine";
        String feminine = "feminine";
        Human child;

        if (sex.equals(masculine)) {
            child = new Human("Walter", family.getFather().getSurname(), 2022, family);
            family.addChild(child);
        } else {
            child = new Human("Skyler", family.getMother().getSurname(), 2022, family);
            family.addChild(child);
        }
        return saveFamily(family);
    }

//    public Family adoptChild() {
//
//    }

    public void deleteAllChildrenOlderThen(int age) {
        int bornYear = 2022 - age;
        for (Family family : getAllFamily()) {
            for (Human human : family.getChildren()) {
                if (human.getBirthDay() > bornYear) {
                    family.deleteChild(human);
                    saveFamily(family);
                }
            }
        }
    }

    public int count() {
        return families.size();
    }

    public void getPets(int index) {
        families.get(index)
                .getPet()
                .forEach(System.out::println);
    }

    public void addPet(Family family, Pet pet) {
        int index = families.indexOf(family);
        Set<Pet> pets = families.get(index).getPet();
        pets.add(pet);
        families.get(index).setPet(pets);
        saveFamily(family);
    }

    @Override
    public boolean deleteFamily(int index) {
        return super.deleteFamily(index);
    }

    @Override
    public boolean deleteFamily(Family family) {
        return super.deleteFamily(family);
    }

    @Override
    public Family saveFamily(Family family) {
        return super.saveFamily(family);
    }
}
