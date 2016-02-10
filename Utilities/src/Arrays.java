/**
 * This class contains array utilities 
 */
public class Arrays 
{

    /**
     * ElementInArray returns the asked element in the array, if that element exists
     *
     * @param  StringArray An array
     * @param  Index       An existing or non-existing index in that array
     * @return             The specific element in the array or an empty string
     */
    public static String ElementInArray(String[] StringArray, int Index) 
    {
        //We start with an empty returnstring
        String ReturnString = "";
        if(StringArray.length > Index)
        {       
           //The index exists
           ReturnString = StringArray[Index];
        }                                    
        return ReturnString;
    }
}
