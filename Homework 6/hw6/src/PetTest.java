import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    Pet pet;
    @BeforeEach
    void init() {
        pet = new Pet(Species.OWL, "Hedwig");
    }

    @Test
    void testEquals() {
        Pet pet2 = new Pet(Species.OWL, "Hedwig");
        assertEquals(pet, pet2);
    }

    @Test
    void testNonEquals() {
        Pet pet2 = new Pet(Species.OWL, "Hagrid");
        assertNotEquals(pet, pet2);
    }

}