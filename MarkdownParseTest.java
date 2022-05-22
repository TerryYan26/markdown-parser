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

    private Path fileName5;
    private String content5;
    private ArrayList<String> links5;

    private Path fileName6;
    private String content6;
    private ArrayList<String> links6;

    private Path fileName7;
    private String content7;
    private ArrayList<String> links7;
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

        fileName5 = Path.of("Snippet1.md");
        content5 = Files.readString(fileName5);
        links5 = new ArrayList<String>();

        fileName6 = Path.of("Snippet2.md");
        content6 = Files.readString(fileName6);
        links6 = new ArrayList<String>();

        fileName7 = Path.of("Snippet3.md");
        content7 = Files.readString(fileName7);
        links7 = new ArrayList<String>();
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
        links2.add("some-thing.html");
        links2.add("tgr1.com");
        links2.add("abcd.com");
       
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
    @Test
    public void testTestFile5() {
        links5.add("`google.com");
        links5.add("google.com");
        links5.add("ucsd.edu");
       
        assertEquals(links5, MarkdownParse.getLinks(content5));
    
    }
    @Test
    public void testTestFile6() {
        links5.add("a.com");
        links5.add("a.com(())");
        links5.add("example.com");
       
        assertEquals(links6, MarkdownParse.getLinks(content6));
    
    }
    @Test
    public void testTestFile7() {
        links7.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");

       
        assertEquals(links7, MarkdownParse.getLinks(content7));
    
    }
}
// javac -cp ".;lib\junit-4.13.2jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
// java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest

//window
//javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest