
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Donghyeon <20183188>
 */
public class FileReader {

    public static List<String> readFile(Path path) {
        Charset cs = StandardCharsets.UTF_8;
        List<String> file = new ArrayList<>();

        try {
            file = Files.readAllLines(path, cs);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }

    public static List<String> readFile(String path) {
        File file = new File(path);
        List<String> fileData = new ArrayList<>();
        
        if (file.exists()) {

           try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF8"))){
               String line;
               while((line = br.readLine()) != null){
                   fileData.add(line);
               }
               
           }catch(Exception e){
               e.printStackTrace();
           }
        }
        
        return fileData;
    }

    public static void writeFile(Path path, String fileName, List<String> readFile) {
        //C:\Windows\Fonts
        File file = new File(path.toString());

        if (!file.exists()) {
            file.mkdirs();
        }

        file = new File(path + "\\" + fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String data : readFile) {
                writer.write(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
