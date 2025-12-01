package Level1.E1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestNoGenericMethods {
    @Test
    public void testNoGenericMethods() {
        String name = "Sara";
        String surname = "Gonzalez";
        int age = 23;
        double height = 1.5;

        NoGenericMethods noGenericMethods = new NoGenericMethods(name, age, height);
        noGenericMethods.setObject2(surname);
        assertAll(
                () -> assertEquals(name, noGenericMethods.getObj1()),
                () -> assertEquals(surname, noGenericMethods.getObj2())
        );
    }
}
