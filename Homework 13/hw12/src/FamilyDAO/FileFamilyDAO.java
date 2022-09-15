package FamilyDAO;

import Model.NonAbstarcts.Family;

import java.util.List;

public interface FileFamilyDAO {
    boolean saveData(List<Family> families);
    List<Family> loadData();

}
