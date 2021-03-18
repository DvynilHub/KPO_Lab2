import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Lab2_3Test {

    @Test
    void correct() throws IOException {
        double[][] matrix = Main.matr("123.txt");
        Main.trans(matrix);
        int err=0;
        double[][] mat = {{1,5,9,4}
                         ,{2,6,1,5}
                         ,{3,7,2,6}
                         ,{4,8,3,7}};

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                assert matrix != null;
                if (mat[i][j]==matrix[i][j]){
                    err++;
                }
            }
        }
        assertEquals(16,err);
    }
    @Test
    void emptyFile() throws IOException {
        double[][] matrix = Main.matr("empt.txt");
        assertEquals(null,matrix);
    }

}