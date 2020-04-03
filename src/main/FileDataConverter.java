package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileDataConverter {

    private LineSelector lineSelector = new Fibonacci();

    public void convertFile(String fileName) {
        File inputFile = new File(fileName);
        File outputFile = new File("output.txt");
        BufferedReader bufferedReader;
        StringBuffer buffer;
        int lineCounter = 0;
        String string;

        try {
            bufferedReader = new BufferedReader(new FileReader(inputFile));
            FileOutputStream fileOutStream = new FileOutputStream(outputFile);
            BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(fileOutStream));
            
            while ((string = bufferedReader.readLine()) != null) {
                lineCounter++;
                
                if (lineSelector.isValidLine(lineCounter)) {
                    buffer = new StringBuffer(string);
                    buffer.reverse();
                    bufferWriter.write(buffer.toString());
                    bufferWriter.newLine();
                }
            }

            bufferWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while operating with file");
            e.printStackTrace();
        }
    }
}
