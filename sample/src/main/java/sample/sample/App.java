package sample.sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	writedataonaTxtFile("C:\\Users\\arira\\Desktop\\Coding\\workspace1\\sample\\test.txt", "ärivazhagan");
    }
    
    
    public static void writedataonaTxtFile(String filePath, String data) throws IOException {
    	
    	FileWriter fr =new FileWriter(filePath);
    	BufferedWriter bu= new BufferedWriter(fr);
    	
    	bu.write(data);
    	
    	bu.close();
    }
}
