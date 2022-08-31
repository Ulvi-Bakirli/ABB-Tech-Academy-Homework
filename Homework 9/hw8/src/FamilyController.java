import java.util.List;

public class FamilyController extends FamilyService{

    @Override
    public List<Family> getAllFamily() {
        return super.getAllFamily();
    }

    @Override
    public void displayAllFamilies() {
        super.displayAllFamilies();
    }

    @Override
    public void getFamiliesBiggerThan(int value) {
        super.getFamiliesBiggerThan(value);
    }

    @Override
    public void getFamiliesLessThan(int value) {
        super.getFamiliesLessThan(value);
    }

    @Override
    public int countFamiliesWithMemberNumber(int value) {
        return super.countFamiliesWithMemberNumber(value);
    }

    @Override
    public void createNewFamily(Human father, Human mother) {
        super.createNewFamily(father, mother);
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return super.getFamilyByIndex(index);
    }

    @Override
    public Family bornChild(Family family, String sex) {
        return super.bornChild(family, sex);
    }

    @Override
    public void deleteAllChildrenOlderThen(int age) {
        super.deleteAllChildrenOlderThen(age);
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public void getPets(int index) {
        super.getPets(index);
    }

    @Override
    public void addPet(Family family, Pet pet) {
        super.addPet(family, pet);
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
