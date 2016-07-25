import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class LecturaDatos 
{
    private String localpath;
    
    public LecturaDatos(String localpath_archivo)
    {
        localpath=localpath_archivo;  
    }
    
    public String[] abrirTxt() throws IOException
    {
        FileReader lectura = new FileReader(localpath);
        BufferedReader lector = new BufferedReader(lectura);
        
        int lineas = lecturaLinea();
        String[] datosTxt = new String[lineas];
        
        int i;
        for (i=0;i<lineas;i++)
            datosTxt[i] = lector.readLine();
        	lector.close();
        return datosTxt;
    }
    
    public int lecturaLinea() throws IOException
    {
        FileReader txt = new FileReader(localpath);
        BufferedReader bufferLector = new BufferedReader(txt);
        
        int cantLinea = 0;
        
        while ((bufferLector.readLine()) != null)
        {
            cantLinea++;
        }
        bufferLector.close();
        return cantLinea;
    }
}
