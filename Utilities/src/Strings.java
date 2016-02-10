/**
 * This class contains string utilities 
 */
public class Strings 
{

    /**
     * NullValue returns the second value if the first value is null 
     *
     * @param  FirstValue  A first value
     * @param  SecondValue A second value
     * @return             If not empty, the first value, else the second value
     */
    public static String NullValue(String FirstValue, String SecondValue) 
    {
        //We start with the first value
        String ReturnString = FirstValue;
        if(FirstValue=="")
        {       
           //The first value is empty
           ReturnString = SecondValue;
        }                                    
        return ReturnString;
    }
}
