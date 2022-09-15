package FamilyDAO;

import Model.NonAbstarcts.Family;

import java.util.List;

    public interface FamilyDAO {
        List<Family> getAllFamilies();
        Family getFamilyByIndex(int familyIndex);
        boolean deleteFamily(int index);
        boolean deleteFamily(Family family);
        void saveFamily(Family family);



    }
