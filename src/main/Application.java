package main;

public class Application {

    public static void main(String[] args) {
        FileDataConverter fileConverter = new FileDataConverter();

        fileConverter.convertFile("test.txt");
        System.out.println("Conversion is finished.");
    }
}
