import java.io.*;
import java.util.StringTokenizer;

public class Input {
    private int n;
    private int m;
    private int k;
    private BufferedReader reader;
    private Edge [] listOfEdges;

    public Input(String name) throws FileNotFoundException {
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
    }

    public void close() throws IOException {
        reader.close();
    }

    public void read() throws IOException {
        String aux = reader.readLine();
        StringTokenizer Tok = new StringTokenizer(aux);
        n = Integer.parseInt(Tok.nextToken());
        m = Integer.parseInt(Tok.nextToken());
        k = Integer.parseInt(Tok.nextToken());
        listOfEdges = new Edge [m];

        for(int i = 0; i < m; i++ ) {
            aux = reader.readLine();
            Tok = new StringTokenizer(aux);
            listOfEdges[i] = new Edge(Integer.parseInt(Tok.nextToken()), Integer.parseInt(Tok.nextToken()));
        }
    }

    public Edge[] getListOfEdges() {
        return listOfEdges;
    }

    public int getK() {
        return k;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }
}
