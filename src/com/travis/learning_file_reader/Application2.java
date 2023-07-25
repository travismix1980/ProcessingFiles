package com.travis.learning_file_reader;

class MyClass implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
    }
}
public class Application2 {
    public static void main(String[] args) throws Exception {
        try(MyClass var = new MyClass();){
            System.out.println("Running...");
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("All done");
        }
    }
}
