import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class JavaFile_InputOutput{
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("This is I/O example");
        } 
        catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}


/*
Buffered streams enhance efficiency by reducing the number of I/O operations. Data is stored in a buffer before being read or written.
*/