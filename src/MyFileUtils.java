public class MyFileUtils {
    public static int subtractTenFromLargerNumber(int number) throws Exception{
        if(number < 10){
            throw new Exception("Number less than 10");
        }
        return number - 10;
    }
}
