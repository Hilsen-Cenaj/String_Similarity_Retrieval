package txtparsing;

import utils.IO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author  Tonia Kyriakopoulou
 */
public class TXTParsing {

    public static List<MyDoc> parse(String file) throws Exception {
        try{
            //Parse txt file
            String txt_file = IO.ReadEntireFileIntoAString(file);
            String[] docs = txt_file.split("/");
            System.out.println("Read: "+docs.length + " docs");

            //Parse each document from the txt file
            List<MyDoc> parsed_docs= new ArrayList<MyDoc>();
            for (String doc:docs){
                String[] adoc = doc.split("/");
                String[] header = adoc[0].split("\n");
                MyDoc mydoc = new MyDoc(header[1], adoc[0]);
                parsed_docs.add(mydoc);
            }

            return parsed_docs;
        } catch (Throwable err) {
            err.printStackTrace();
            return null;
        }
        
    }

}
