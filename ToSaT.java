public class ToSaT {

    public static int varid(int i, int c, int k) {
        return i * k + c;
    }

    /**
     * @param listOfEdges
     * @param n
     * @return Intoarce numarul maxim de muchii ale unui nod
     */
    public static int MaxEdge(Edge[] listOfEdges, int n) {
        int[] nodes = new int[n];
        for (int i = 0; i < listOfEdges.length; i++) {
            nodes[listOfEdges[i].source]++;
            nodes[listOfEdges[i].destination]++;
        }

        int max = 0;
        for (int i = 0; i < nodes.length; i++) {
            if (max < nodes[i]) {
                max = nodes[i];
            }
        }
        return max;
    }

    /**
     * Calculeaza efectic transformara
     *
     * @param n
     * @param m
     * @param k
     * @param listOfEdges
     * @return Intoarce Stringul de afisat
     */
    public static String Transformation(int n, int m, int k, Edge[] listOfEdges) {


        String output = "";

        /**
         * Putem verifica rapid daca raspunsul este 0
         */
        /*if (MaxEdge(listOfEdges, n) > k) {

            output = "x0^~x0";
            return output;
        }*/

        /*
        * Daca avem o culoare
         */

        if (k == 1) {

            for (int i = 0; i < n - 1; i++) {
                output = output + "x" + i + '^';
            }

            int j = n - 1;
            output = output + "x" + j;

            /**
             * Daca nu avem muchii
             */
            if (m == 0) {
                return output;
            } else {
                for (int i = 0; i < m; i++) {
                    output = output + "^(~x" + listOfEdges[i].source + "V~x" + listOfEdges[i].destination + ")";
                }
                return output;
            }

        }



        /**
         * Prima parte
         */
        for (int i = 0; i < n; i++) {
            output = output + "(x" + varid(i, 0, k);
            for (int c = 1; c < k; c++) {
                output = output + "Vx" + varid(i, c, k);
            }
            if (i != n - 1) {
                output = output + ")^";
            }
        }

        /**
         * A doua parte
         */
        for (int i = 0; i < n; i++) {
            for (int c = 0; c < k; c++) {
                for (int j = 1; c + j < k; j++) {
                    output = output + ")^(~x" + varid(i, c, k) + "V~x" + varid(i, c + j, k);
                }
            }
        }

        /**
         * A treia parte
         */
        for (int i = 0; i < m; i++) {
            for (int c = 0; c < k; c++) {
                output = output + ")^(~x" + varid(listOfEdges[i].source, c, k) + "V~x" + varid(listOfEdges[i].destination, c, k);
            }
        }


        output = output + ")";

        return output;
    }
}
