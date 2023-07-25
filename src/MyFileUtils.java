import com.travis.exceptions.FooRuntimeException;

public class MyFileUtils {
    public int subtractTenFromLargerNumber(int number) throws Exception{
        if(number < 10){
            throw new FooRuntimeException("Number less than 10");
        }
        return number - 10;
    }
}


