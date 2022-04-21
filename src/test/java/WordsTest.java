import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @Test
    void word() {
        Words words=new Words();
        String actual=words.word("Hello");
        String expected="Hello";
        assertEquals(expected,actual);
    }
}