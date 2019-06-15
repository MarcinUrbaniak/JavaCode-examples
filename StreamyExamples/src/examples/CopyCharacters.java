package examples;

import java.io.*;

public class CopyCharacters {

    public static void main(String[] args) throws IOException {

        BufferedReader inputStrem = null;
        PrintWriter outputStream = null;

        try {
            inputStrem = new BufferedReader( new FileReader("xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));

            String l;
            while ((l = inputStrem.readLine()) != null) {
                outputStream.println(l);

            }

        } finally {
            if (inputStrem != null) {
                inputStrem.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }


    }
}
