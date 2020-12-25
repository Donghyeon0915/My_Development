
import java.nio.file.Paths;
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
public class NewMain {

    /**  
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> readFile = FileReader.readFile("C:\\Users\\cyber\\Downloads\\Hack-Bold.ttf");
        
        FileReader.writeFile(Paths.get("C:\\Users\\cyber\\Downloads\\copy"), "Hack-Bold.ttf", readFile);
    }
    
}
