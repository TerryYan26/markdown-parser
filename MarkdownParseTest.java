import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.text.AbstractDocument.Content;

import org.junit.*;
public class MarkdownParseTest {
    // String link =("[https://something.com, some-thing.html]");
    // List link2 = List.of("https://something.com, some-thing.html");
    // private ArrayList<String> link1;
    // private ArrayList<String> links;
    // @Before
    // public void setup()throws IOException{
            

    //     Path fileName = Path.of("test-file.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
    //     links = new ArrayList<String>( );
         
        
    // }
    @Test
    public void addition() {
    assertEquals(2, 1 + 1);
    }
    @Test
    public void testMarkdownparse()throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList link2 = (ArrayList) List.of("https://something.com, some-thing.html");

        assertEquals(link2,links);
        
    }
    
}