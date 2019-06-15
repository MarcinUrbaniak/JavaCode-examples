
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class ConvertCsvToJson {
    public static void generate(String inputFileName, String outputFileName) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputSteram = null;

        try {
            inputStream = new BufferedReader(new FileReader(inputFileName));
            outputSteram = new PrintWriter(new FileWriter(outputFileName));

            writeFile(inputStream, outputSteram);

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        if (outputSteram != null) {
            outputSteram.close();
        }

    }

    private static void writeFile(BufferedReader inputStream, PrintWriter outputSteram) throws IOException {
        String title = inputStream.readLine();
        String[] splitedTitle = title.split(";");

        Map<String, String> jsonMap = new HashMap<>();
        String value;
        String[] splitedValues;

        outputSteram.append("[ \n");
        while ((value = inputStream.readLine()) != null) {
            splitedValues = value.split(";");

            for (int i = 0; i < splitedTitle.length; i++) {

                jsonMap.put(splitedTitle[i], splitedValues[i]);
            }

            Set<String> keySet = jsonMap.keySet();

            outputSteram.append("{\n");
            for (String key : keySet
            ) {
                outputSteram.append("\"" + key + "\":\"" + jsonMap.get(key) + "\",\n");
            }
            outputSteram.append("},\n");
        }
        outputSteram.append("] \n");
    }

}
