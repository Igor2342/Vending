package MainApp;

import com.sun.jmx.remote.util.EnvHelp;

import java.io.*;

class DataBase {

    static void writeToBase(String data) throws IOException { // Writing data in file by parameters
        FileWriter file = null;
        char[] arrayOfData = data.toCharArray();
        try {
            file = new FileWriter("c:/base", true);
        } catch (FileNotFoundException e) {
            System.out.println("Нет файла");
        }
        try {
            file.write(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.close();
    }

    static void readBase() { // Reading base
        FileReader file = null;
        try {
            file = new FileReader("c:/base");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        int c;

        try {
            while (-1 != (c = file.read())){

                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
