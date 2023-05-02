package uk.org.md.democi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainControllerTest {

    @Test
    void index() {
        String expected = "Hello there!!!";
        MainController main = new MainController();
        String actual = main.index();
        assertEquals(expected, actual);
        assertNotEquals("Not equal to this", actual);
    }
}
