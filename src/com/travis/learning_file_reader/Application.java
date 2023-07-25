package com.travis.learning_file_reader;

import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException {
        File file = new File("myFile.txt");
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
             }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            throw new IOException(e);
        } finally {
            assert br != null;
            br.close();
        }
    }
}
