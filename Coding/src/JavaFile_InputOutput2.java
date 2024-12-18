import java.io.*;
public class JavaFile_InputOutput2 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("input.txt");
        FileWriter writer = new FileWriter("output.txt");

        int data;
        while ((data = reader.read()) != -1) {
            writer.write(data);
        }

        reader.close();
        writer.close();
    }
}

/*Used for handling text data (characters).

Classes:

Reader: Abstract class for reading character data.
Common subclasses: FileReader, BufferedReader.
Writer: Abstract class for writing character data.
Common subclasses: FileWriter, BufferedWriter.
*/


class ByteStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("input.txt");
        FileOutputStream output = new FileOutputStream("output.txt");

        int data;
        while ((data = input.read()) != -1) {
            output.write(data);
        }

        input.close();
        output.close();
    }
}

/*Byte Streams
Used for handling binary data like images, videos, and other non-text files.

Classes:

InputStream: Abstract class for reading byte data.
Common subclasses: FileInputStream, BufferedInputStream.
OutputStream: Abstract class for writing byte data.
Common subclasses: FileOutputStream, BufferedOutputStream.
 */