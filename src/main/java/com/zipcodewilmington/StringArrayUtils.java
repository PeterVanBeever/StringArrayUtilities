package com.zipcodewilmington;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODOf
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODOf
    public static String getLastElement(String[] array) {
        return array[array.length-1];

        //return null;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ //
    public static boolean contains(String[] array, String value) {
        for (int i =0; i <array.length; i++){
            if (array[i].equals(value)){
                return true;
            }
        } return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        //create a new array to hold reversed array
        String[] reversedArray = new String[array.length];
        // work backwards
        // make counter
        int counter = 0;
        for (int i = array.length-1; i>= 0; i--){
            // set revArray to new array values i
            // place into reverse array, meet at 0
            reversedArray[counter] = array[i];
            counter++;
        }
        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODOf
    public static boolean isPalindromic(String[] array) {
        // for (int i = array.length-1; i>= 0; i--){
        //create a counter for each side
        // %2 == 0
        int fromLeft = 0;
        int fromRight = array.length - 1;
        // while loop, while condition is true....
        while (fromLeft < fromRight) {
            // ! not equals, reverses logic?
            if (array[fromLeft]!=(array[fromRight])) {
                return false;
            }
            //increment from left, decrement from right
            fromLeft++;
            fromRight--;
        }
        return true;

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public boolean isPangramic(String[] array) {



        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        return 0;


    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
