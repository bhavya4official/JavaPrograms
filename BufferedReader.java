//BufferedReader class is used to read the text from a character-based input stream (Fast performance)
import java.io.*;
public class BRDemo{
  public static void main(String arg[]){
    FileReader fr = new FileReader("D:\\test.text"); //reading the data from the text file testout.txt
    BufferedReader br = new BufferedReader(fr);
    
    int i;
    while((i=br.read())!=-1){
    System.out.println((char)i);
    }
    br.close();
    fr.close();
   }
}
/* BR class Constructors:
BufferedReader(Reader rd) 	It is used to create a buffered character input stream that uses the default size for an input buffer.
BufferedReader(Reader rd, int size) 	It is used to create a buffered character input stream that uses the specified size for an input buffer.
*/
/* BR class methods:
int read() 	It is used for reading a single character.
int read(char[] cbuf, int off, int len) 	It is used for reading characters into a portion of an array.
boolean markSupported() 	It is used to test the input stream support for the mark and reset method.
String readLine() 	It is used for reading a line of text.
boolean ready() 	It is used to test whether the input stream is ready to be read.
long skip(long n) 	It is used for skipping the characters.
void reset() 	It repositions the stream at a position the mark method was last called on this input stream.
void mark(int readAheadLimit) 	It is used for marking the present position in a stream.
void close() 	It closes the input stream and releases any of the system resources associated with the stream.
*/

