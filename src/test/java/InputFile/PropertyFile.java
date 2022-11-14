package InputFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class PropertyFile {

    public Properties properties;
    public FileInputStream fileInputStream;

    public PropertyFile() {
        LoadFile();
    }

    public void LoadFile(){

        properties=new Properties();
        try {
            fileInputStream=new FileInputStream("src/test/java/Resources/InputData.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getValue(String key){
        return properties.getProperty(key);
    }

    //metoda care returneaza toate cheile si valorile
    public HashMap <String, String> getKeysValues(){

        HashMap <String, String> testData=new HashMap<>();
        Enumeration enuKeys = properties.keys();
        while (enuKeys.hasMoreElements()) {
            String key = (String) enuKeys.nextElement();
            String value = properties.getProperty(key);
            //System.out.println(key + ": " + value);
            testData.put(key, value);
        }
        return testData;
    }

}
