import java.io.IOException;

public class Postfix 
{
    public static void main(String args[]) throws IOException
    {
        String txt = "datos.txt";
        
        String directorio = System.getProperty("user.dir");
 	    System.out.println("Directorio Actual: " + directorio);
        
        try 
        {
            LecturaDatos postfix = new LecturaDatos(txt);
            String[] LecturaLinea = postfix.abrirTxt();
            
            int i;
            for (i=0;i<LecturaLinea.length;i++)
                System.out.println(LecturaLinea[i]);
        }
        
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        } 
    }
}
