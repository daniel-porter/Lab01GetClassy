package PersonGenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PersonTest {

    Person p1, p2;

    @BeforeEach
    void setUp() {
        p1 = new Person("Porter","Daniel","000001", "MR.", 2003);
    }

    @Test
    void toCSVDataRecord() {
        String expected = "Daniel,Porter,000001,MR.,2003";
        Assertions.assertEquals(expected, p1.toCSVDataRecord());
    }

    @Test
    void testEquals() {
        p2 = new Person("Porter","Daniel","000001", "MR.", 2003);
        Assertions.assertEquals(p1, p2);
    }

    @Test
    void testToString() {
        String expected = "MR., Daniel, Porter, (ID: 000001), Born: 2003";
        Assertions.assertEquals(expected, p1.toString());
    }

    @Test
    void toXML() {
        String expected = "<Person>" +
                          "<FirstName>Daniel</FirstName>" +
                          "<Lastname>Porter</Lastname>" +
                          "<IDNum>000001</IDNum>" +
                          "<Title>MR.</Title>" +
                          "<YOB>2003</YOB>" +
                          "</Person>";
        Assertions.assertEquals(expected, p1.toXML());
    }

    @Test
    void toJSON() {
        String expected = "{" +
                          "\"FirstName\": \"Daniel\"," +
                          "\"Lastname\": \"Porter\"," +
                          "\"IDNum\": \"000001\"," +
                          "\"Title\": \"MR.\"," +
                          "\"YOB\": 2003" +
                          "}";
        Assertions.assertEquals(expected, p1.toJSON());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("Daniel");
        Assertions.assertEquals("Daniel", p1.getFirstName());
    }

    @Test
    void setLastname() {
        p1.setLastname("Porter");
        Assertions.assertEquals("Porter", p1.getLastname());
    }

    @Test
    void setTitle() {
        p1.setTitle("MR.");
        Assertions.assertEquals("MR.", p1.getTitle());
    }

    @Test
    void setYOB() {
        p1.setYOB(2003);
        Assertions.assertEquals(2003, p1.getYOB());
    }
    @Test
    void fullName() {
        String expected = "Daniel Porter";
        Assertions.assertEquals(expected, p1.fullName());
    }
    @Test
    void formalName() {
        String expected = "MR. Daniel Porter";
        Assertions.assertEquals(expected, p1.formalName());

    }

    @Test
    void getAge() {
        int expected = 22;
        Assertions.assertEquals(expected, p1.getAge());
    }





}

