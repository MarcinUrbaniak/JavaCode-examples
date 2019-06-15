import java.io.IOException;

public class Conversion {

    public static void main(String[] args) throws IOException {

        ConvertCsvToJson.generate("data.txt", "outputData.txt");
        ConvertJsonToCsv.generate("inputJson.txt", "outputCsv.txt");
    }
}
