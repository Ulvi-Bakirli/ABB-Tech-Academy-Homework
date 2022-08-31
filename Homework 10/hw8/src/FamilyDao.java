import java.util.ArrayList;
import java.util.List;

public interface FamilyDao {

    List<Family> getAllFamily();

    Family getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(Family family);

    Family saveFamily(Family family);
}
