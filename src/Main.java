import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException{
        String fileName = "123.txt";
        String search = "public";
        String replace = "private";
        Charset charset = StandardCharsets.UTF_8;
        Path path = Paths.get(fileName);
        replase(fileName,search,replace,charset,path);

    }
    public static void replase(String fileName, String search, String replace, Charset charset, Path path) throws IOException{
        try {
            Files.write(path, new String(Files.readAllBytes(path), charset).replace(search, replace).getBytes(charset));
            System.out.println("Замена произведена");
        } catch (NoSuchFileException e){
            System.out.println("Файл не найден");

        }
    }



}
