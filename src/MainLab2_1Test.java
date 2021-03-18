import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainLab2_1Test {
    @Test
    public void testSearchRight() {
        String[] b = {"abc", "cde"};
        String a = Main.search(b);
        Assertions.assertEquals("abc cde", a);

    }

    @Test
    public void testSearchEmpty() {
        String[] b = new String[]{""};
        String a = Main.search(b);
        Assertions.assertEquals("", a);
    }

    @Test
    public void testSearchThreeWords() {
        String[] b = new String[]{"abc", "cde", "efg"};
        String a = Main.search(b);
        Assertions.assertEquals("abc cde cde efg", a);
    }

}