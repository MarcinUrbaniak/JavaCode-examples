import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ConvertJsonToCsv {

    public static void generate(String inputFileName, String outputFileName) throws IOException {


        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(inputFileName));
            outputStream = new PrintWriter(new FileWriter(outputFileName));

            readFile(inputStream);
            writeFile(outputStream);

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    private static void writeFile(PrintWriter outputStream) {
        Set<String> keySet = new LinkedHashSet<>();
        List<String> valueList = new ArrayList<>();
        for (String key : keySet
        ) {
            outputStream.append(key + ";");
        }
        outputStream.append("\n");

        int i = 0;
        for (String value : valueList
        ) {
            outputStream.append(value + ";");
            i++;
            if (i == keySet.size()) {
                outputStream.append("\n");
                i = 0;
            }
        }
    }

    private static void readFile(BufferedReader inputStream) throws IOException {
        String l;
        Set<String> keySet = new LinkedHashSet<>();
        List<String> valueList = new ArrayList<>();
        while ((l = inputStream.readLine()) != null) {
            if (l.startsWith("\"")) {
                String readyString = l.replaceAll("\"", "");
                readyString = readyString.replaceAll(",", "");
                int index = readyString.indexOf(":");
                keySet.add(readyString.substring(0, index));
                valueList.add(readyString.substring(index + 1));
            }
        }
    }
}
