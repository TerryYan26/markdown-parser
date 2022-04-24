import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {

    private Path fileName1;
    private String content1;
    private ArrayList<String> links1;

    private Path fileName2;
    private String content2;
    private ArrayList<String> links2;

    private Path fileName3;
    private String content3;
    private ArrayList<String> links3;

    private Path fileName4;
    private String content4;
    private ArrayList<String> links4;


    @Before
    public void setUp() throws IOException {
        fileName1 = Path.of("test-file.md");
        content1 = Files.readString(fileName1);
        links1 = new ArrayList<String>();

        fileName2 = Path.of("testing1.md");
        content2 = Files.readString(fileName2);
        links2 = new ArrayList<String>();

        fileName3 = Path.of("testing2.md");
        content3 = Files.readString(fileName3);
        links3 = new ArrayList<String>();

        fileName4 = Path.of("testing3.md");
        content4 = Files.readString(fileName4);
        links4 = new ArrayList<String>();
    }
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testTestFile1() {
        links1.add("https://something.com");
        links1.add("some-thing.html");
        assertEquals(links1, MarkdownParse.getLinks(content1));
    
    }
    @Test
    public void testTestFile2() {
        links2.add("https://something.com");
       
        assertEquals(links2, MarkdownParse.getLinks(content2));
    
    }
    @Test
    public void testTestFile3() {
        links3.add("https://something.com");
       
        assertEquals(links3, MarkdownParse.getLinks(content3));
    
    }
    @Test
    public void testTestFile4() {
     
       
        assertEquals(links4, MarkdownParse.getLinks(content4));
    
    }
}
// javac -cp ".;lib\junit-4.12.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
// java -cp ".;lib/junit-4.12.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest