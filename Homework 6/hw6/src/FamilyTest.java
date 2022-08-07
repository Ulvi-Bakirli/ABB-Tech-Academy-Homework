import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    Family family;
    Human father;
    Human mother;

    @BeforeEach
    void init() {
        father = new Human("James", "Potter", 1967);
        mother = new Human("Lily", "Potter", 1972);
        family = new Family(father, mother);
    }

    @Test
    void isEqual() {
        Human father2 = new Human("James", "Potter", 1967);
        Human mother2 = new Human("Lily", "Potter", 1972);
        Family family2 = new Family(father, mother);
        assertEquals(family, family2);

    }

    @Test
    void isNotEqual() {
        Human father2 = new Human("James", "Potter", 1967);
        Human mother2 = new Human("Lily", "Potter", 1972);
        Family family2 = new Family(mother2, father2);
        assertNotEquals(family, family2);
    }

    @Test
    void countFamily() {
        Human father2 = new Human("James", "Potter", 1967);
        Human mother2 = new Human("Lily", "Potter", 1972);
        Family family2 = new Family(father, mother);
        Human harry = new Human("Harry", "Potter", 1980);
        Human[] arr = new Human[1];
        arr[0] = harry;
        family2.setChildren(arr);
        assertEquals(family2.countFamily(), 3);
    }

    @Test
    void addChild() {
        Human father2 = new Human("James", "Potter", 1967);
        Human mother2 = new Human("Lily", "Potter", 1972);
        Family family2 = new Family(father, mother);
        Human harry = new Human("Harry", "Potter", 1980);
        Human[] arr = new Human[1];
        arr[0] = harry;
        family2.setChildren(arr);
        assertEquals(family2.getChildren().length, 1);
    }

    @Test
    void deleteChildByIndex() {
        Human father2 = new Human("James", "Potter", 1967);
        Human mother2 = new Human("Lily", "Potter", 1972);
        Family family2 = new Family(father, mother);
        Human harry = new Human("Harry", "Potter", 1980);
        Human[] arr = new Human[1];
        arr[0] = harry;
        family2.setChildren(arr);
        family2.deleteChild(0);
        assertEquals(family2.getChildren().length, 0);
    }
}