import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        File f = new File("input.txt");//Файл для чтения
        File f1 = new File("output.txt");//Файл для записи
        BufferedReader bf;
        FileWriter fw;
        String pattern = "bd\\s[a-d]";

        //Создание экземпляра класса Pattern
        Pattern r = Pattern.compile(pattern);

        try {
            bf = new BufferedReader(new FileReader(f));
            fw = new FileWriter(f1);
            String tmp;
            //Пока в файле есть ненулевые строки выполняем поиск по шаблону
            while ((tmp = bf.readLine()) != null) {
                //Создание экземпляра класса Matcher
                Matcher m = r.matcher(tmp);
                if (m.find()) {
                    fw.write(m.group());
                }
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
