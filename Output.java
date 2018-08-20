import java.io.*;

public class Output {

    private Writer writer;

    public Output(String name) throws FileNotFoundException {
        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(name)));
    }

    public void write(String output) throws IOException {
        writer.write(output);
    }

    /**
     * Inchide fisierul
     *
     * @throws IOException
     */
    public void close() throws IOException {
        writer.close();
    }
}
