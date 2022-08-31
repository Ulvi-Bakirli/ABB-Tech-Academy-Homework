import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionFamilyDaoTest {

    @BeforeEach
    public void init() {
        Human father = new Human("Elcin", "Quliyev", 1968);
        Human mother = new Human("Natella", "Quliyeva", 1972);
        Family family = new Family(father, mother);
    }

    @Test
    public void test1() {
        Human father = new Human("Elcin", "Quliyev", 1968);
        Human mother = new Human("Natella", "Quliyeva", 1972);
        Human child = new Human("Ulvi", "Bakirli", 1997);
        Pet pet = new Dog();
        Family family1 = new Family(father, mother);

        FamilyService service = new FamilyService();
        service.saveFamily(family1);

        assertEquals(service.saveFamily(family1), family1);
    }
}