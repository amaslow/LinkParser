package lnkparser;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewClass {

    public static void main(String[] args) {
        File source = new File("G:\\QC\\Certificates\\XQ13169_2\\(Done_MK-060450100005-(WW))_ALCOM\\Certificates\\Certificates - Shortcut.lnk");
        try {
            LnkParser lnk = new LnkParser(source);
            System.out.println(source.getParent()+"\\"+lnk.getRealFilename().substring(52).replace("\\", "€"));
            source.renameTo(new File(source.getParent()+"\\Shortcut - "+lnk.getRealFilename().substring(52).replace("\\", "€")+".lnk"));

        } catch (IOException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
