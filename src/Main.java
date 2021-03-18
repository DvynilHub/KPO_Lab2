import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        File f = new File("input.txt");//Файл для чтения
        File f1 = new File("output.txt");//Файл для записи

        String pattern = "bd\\s[a-d]";

        //Создание экземпляра класса Patternn

        search(f,f1,pattern);


    }
    public static void search(File f1,File f2, String pattern){
        try {
            BufferedReader bf;
            FileWriter fw;
            bf = new BufferedReader(new FileReader(f1));
            fw = new FileWriter(f2);
            String tmp;
            Pattern r = Pattern.compile(pattern);
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
