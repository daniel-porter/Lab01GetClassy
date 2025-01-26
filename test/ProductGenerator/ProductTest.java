package ProductGenerator;

import PersonGenerator.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product p1;

    @BeforeEach
    void setUp() {
        p1 = new Product("000001","Pipeweed", "Long Bottom Leaf", 600.0);
    }

    @Test
    void toCSVDataRecord() {
        String expected = "000001,Pipeweed,Long Bottom Leaf,600.0";
        Assertions.assertEquals(expected, p1.toCSVDataRecord());
    }

    @Test
    void toJSON() {
        String expected = "{" +
                "\"ID\": \"000001\"," +
                "\"Name\": \"Pipeweed\"," +
                "\"Description\": \"Long Bottom Leaf\"," +
                "\"Cost\": \"600.0\"," +
                "}";
        Assertions.assertEquals(expected, p1.toJSON());
    }

    @Test
    void toXML() {
        String expected = "<Product>" +
                "<ID>000001</ID>" +
                "<Name>Pipeweed</Name>" +
                "<Description>Long Bottom Leaf</Description>" +
                "<Cost>600.0</Cost>" +
                "</Product>";
        Assertions.assertEquals(expected, p1.toXML());
    }

    @Test
    void testToString() {
        String expected = "ID: 000001 Name: Pipeweed Description: Long Bottom Leaf Cost: 600.0";
        Assertions.assertEquals(expected, p1.toString());
    }

    @Test
    void setName() {
        String expected = "Pipeweed";
        Assertions.assertEquals(expected, p1.getName());
    }

    @Test
    void setDescription() {
        String expected = "Long Bottom Leaf";
        Assertions.assertEquals(expected, p1.getDescription());
    }

    @Test
    void setCost() {
        Double expected = 600.0;
        Assertions.assertEquals(expected, p1.getCost());
    }
}