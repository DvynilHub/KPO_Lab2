import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;


class Lab2_2Test {
    @Test
    void correct() throws IOException {
        String fileName = "123.txt";
        String search = "public";
        String replace = "private";
        Charset charset = StandardCharsets.UTF_8;
        Path path = Paths.get(fileName);
        Main.replase(fileName,search,replace,charset,path);
        FileReader fr = new FileReader(fileName);
        int b;
        String tmp = "";
        boolean x = true;
        while ((b = fr.read()) != -1) {
            if ((char) b == ' ') {
                if (tmp.equals("public"))
                    x = false;
                tmp = "";
            } else if ((char) b == '\n') {
                tmp = "";
            } else
                tmp += (char) b;
        }
        assertTrue(x);
    }

    @Test
    void empty() throws IOException {
        String fileName = "123.txt";
        String search = "public";
        String replace = "private";
        Charset charset = StandardCharsets.UTF_8;
        Path path = Paths.get(fileName);
        Main.replase(fileName,search,replace,charset,path);
        FileReader fr = new FileReader(fileName);
        int b = 0;
        String tmp = "";
        boolean x = false;
        if ((b = fr.read()) == -1) {
            x = true;
        }
        assertTrue(x);
    }
    }

