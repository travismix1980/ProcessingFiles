import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter some text: ");
//        String enteredText = input.nextLine();
//        System.out.println(enteredText);
        try{
            File file = new File("myFile.txt");
            Scanner input = new Scanner(file);
            while(input.hasNextLine()){
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println(MyFileUtils.subtractTenFromLargerNumber(12));
        System.out.println(MyFileUtils.subtractTenFromLargerNumber(8));
    }
}
