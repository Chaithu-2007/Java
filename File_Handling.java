import java.io.BufferedReader;
import java.io.FileReader;
public class File_Handling 
{
    public static void main(String[] args) 
    {
        try 
        {
            BufferedReader slide = new BufferedReader(new FileReader("Unknown.java"));
            String Line;
            while((Line=slide.readLine())!=null)
                {
                    System.out.println(Line);
                }
                slide.close();               
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }    
}