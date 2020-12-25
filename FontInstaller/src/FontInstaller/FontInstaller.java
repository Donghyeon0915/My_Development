package FontInstaller;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FontInstaller {
    
    public static void Font_Install(){
        String[] font_file = {
            "D2Coding-Ver1.3.2-20180524-all.ttc",
            "Hack-Bold.ttf",
            "Hack-BoldItalic.ttf",
            "Hack-Italic.ttf",
            "Hack-Regular.ttf",
            "HI_SiYsKILxRpg3hIP6sJ7fM7PqlPevW.ttf",
            "NanumGothicCoding.ttf",
        };

        for (String font_name : font_file) {

            String old_name = "C:\\Users\\W44858\\Downloads\\DevelopEnvironment\\DevelopEnvironment\\font\\" + font_name;
            String new_name = "C:\\Windows\\Fonts\\" + font_name;
            
            try (FileInputStream fin = new FileInputStream(old_name);
                 FileOutputStream fout = new FileOutputStream(new_name)) {

                int tmp = 0;
                
                while ((tmp = fin.read()) != -1) {
                    fout.write(tmp);
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
