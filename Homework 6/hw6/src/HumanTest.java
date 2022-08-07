import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human ulvi;
    Family family;
    Human father;
    Human mother;
    @BeforeEach
    void init() {
        father = new Human("Elcin", "Quliyev", 1967);
        mother = new Human("Natella", "Quliyeva", 1972);
        family = new Family(1, father, mother, new Human[]{new Human("Ulvi", "Bakirli", 1997)}, new Pet(Species.OWL, "Hedwig"));
        ulvi = new Human("Ulvi", "Bakirli", 1997,family);
    }

    @Test
    void isEqual() {
        Human father2 = new Human("Elcin", "Quliyev", 1967);
        Human mother2 = new Human("Natella", "Quliyeva", 1972);
        Family family2 = new Family(1, father2, mother2, new Human[]{new Human("Ulvi", "Bakirli", 1997)}, new Pet(Species.OWL, "Hedwig"));
        Human human = new Human("Ulvi", "Bakirli", 1997, family2);
        assertEquals(ulvi, human);
    }

    @Test
    void isNotEqual() {
        Human human = new Human("Harry", "Potter", 1980);
        assertNotEquals(ulvi, human);
    }

}