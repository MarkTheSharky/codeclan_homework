import Person.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before() {
        person = new Person("Mark");
    }

    @Test
    public void canGetName() {
        assertEquals("Mark", person.getName());
    }

    @Test
    public void canSetName() {
        person.setName("David");
        assertEquals("David", person.getName());
    }
}
