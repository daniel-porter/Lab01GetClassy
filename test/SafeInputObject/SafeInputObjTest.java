package SafeInputObject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SafeInputObjTest {



    @Test
    void getNonZeroLenString() {

            String input = "hello\n";
            Scanner scanner = new Scanner(input);
            SafeInputObj inputObj = new SafeInputObj(scanner);
            String actual = inputObj.getNonZeroLenString("Enter a String");
            String expected = "hello";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getRangedInt() {
        String input = "25\n";
        Scanner scanner = new Scanner(input);
        SafeInputObj inputObj = new SafeInputObj(scanner);
        int actual = inputObj.getRangedInt("Enter a number", 10, 30);
        int expected = 25;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getInt() {
        String input = "23\n";
        Scanner scanner = new Scanner(input);
        SafeInputObj inputObj = new SafeInputObj(scanner);
        int actual = inputObj.getInt("Enter a number");
        int expected = 23;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getRangedDouble() {
        String input = "5.234\n";
        Scanner scanner = new Scanner(input);
        SafeInputObj inputObj = new SafeInputObj(scanner);
        double actual = inputObj.getRangedDouble("Enter a double", 2, 19);
        double expected = 5.234;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getDouble() {
        String input = "5\n";
        Scanner scanner = new Scanner(input);
        SafeInputObj inputObj = new SafeInputObj(scanner);
        double actual = inputObj.getDouble("Enter a double");
        double expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getYNConfirm() {
        String input = "Y";
        Scanner scanner = new Scanner(input);
        SafeInputObj inputObj = new SafeInputObj(scanner);
        boolean actual = inputObj.getYNConfirm("Do you like coding?");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getRegExString() {
        String input = "Java@ilovecoding.com";
        Scanner scanner = new Scanner(input);
        SafeInputObj inputObj = new SafeInputObj(scanner);
        String actual = inputObj.getRegExString("Enter your email", "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9+_.-]+$");
        String expected = "Java@ilovecoding.com";
        Assertions.assertEquals(expected, actual);

    }
}