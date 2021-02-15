package week16d01;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Vowels {
public String vowelRemove(BufferedReader reader)
        throws IOException{
    StringBuilder sb = new  StringBuilder();
    String line;
    while((line = reader.readLine()) !=  null){
      replace(sb, line);

    }
    return sb.toString();

}
private void replace(StringBuilder sb, String line) {
    String result =  line.replaceAll("[\"aAáÁeEéÉiIíÍoOóÓöÖőŐuUúÚüÜűŰ\"]", "");
    sb.append(result).append("\n");
}


}




