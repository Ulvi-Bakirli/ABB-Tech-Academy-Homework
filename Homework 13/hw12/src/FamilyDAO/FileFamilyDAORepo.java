package FamilyDAO;

import Model.NonAbstarcts.Family;

import java.io.*;
import java.util.List;

public class FileFamilyDAORepo implements FileFamilyDAO {
    @Override
    public boolean saveData(List<Family> families) {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(new File("file.txt")))) {
            o.writeObject(families);
            System.out.println("All families saved in data");
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("File not found in data");
            return false;

        } catch (IOException e) {
            System.out.println("File not found in data");
            return false;
        }


    }

    @Override
    public List<Family> loadData() {
        try (ObjectInputStream o = new ObjectInputStream(new FileInputStream(new File("file.txt")))) {
            System.out.println("All families saved in data");
            return (List<Family>) o.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}
