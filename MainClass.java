import java.io.IOException;

public class MainClass {

    public static void main(String args[]) throws IOException {

        Input input = new Input("test.in");
        input.read();
        input.close();
        Output output = new Output("test.out");
        String solution = ToSaT.Transformation(input.getN(), input.getM(), input.getK(), input.getListOfEdges());
        output.write(solution);
        output.close();
    }
}
