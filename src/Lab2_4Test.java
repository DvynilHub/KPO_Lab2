import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class Lab2_4Test {

    @Test
    void correct() throws IOException {
        File f = new File("input.txt");//Файл для чтения
        File f1 = new File("output.txt");//Файл для записи
        String pattern = "bd\\s[a-d]";
        Main.search(f,f1,pattern);
        BufferedReader bf = new BufferedReader(new FileReader(f1));
        assertEquals(bf.readLine(),"bd a");
    }
    @Test
    void empty() throws IOException {
        File f = new File("inputempt.txt");//Файл для чтения
        File f1 = new File("outempt.txt");//Файл для записи
        String pattern = "bd\\s[a-d]";
        Main.search(f,f1,pattern);
        BufferedReader bf = new BufferedReader(new FileReader(f1));
        assertNull(bf.readLine());
    }

}