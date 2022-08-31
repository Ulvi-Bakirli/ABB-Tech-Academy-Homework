import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao{

    List<Family> families = new ArrayList<>();

    @Override
    public List<Family> getAllFamily() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return families.get(index);
    }

    @Override
    public boolean deleteFamily(int index) {
        if (families.get(index) != null){
            families.remove(index);
            return true;
        } else {
            System.out.printf("Listde bele bir index yoxdur, zehmet olmasa indexin menfi ve listin olcusunden (%d) olmamasima diqqet edin\n", families.size());
            return false;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        if (families.contains(family)){
            families.remove(family);
            return true;
        } else{
            System.out.println("Listde bele bir aile yoxdur, zehmet olmasa ailenin duzgun olduguna diqqet edin");
            return false;
        }
    }

    @Override
    public Family saveFamily(Family family) {
        if (!families.contains(family)) {
            families.add(family);
            return family;
        } else {
            int index = families.indexOf(family);
            Family oldFamily = families.get(index);
            families.add(index, family);
            families.remove(index + 1);
            return family;
        }
    }
}
