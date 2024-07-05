package com.zipcodewilmington;

import java.sql.Array;
import java.util.ArrayList;

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
     */ // TODOf
    public static boolean isPangramic(String[] array) {
        StringBuffer sb = new StringBuffer();
        //loop through array and group into string buffer
        for (int i = 0; i <=array.length-1; i++) {
            sb.append(array[i]);
        }
        String stringAssembled = new String();
        String testPangram = sb.toString().toLowerCase();
        // get length of array which has been repurposed as string builder, assembled, to lowercase
        int length = testPangram.length();

        // add unique values a-z only if not found
        for (int i = 0; i < length; i++) {
            char charAtPosition = testPangram.charAt(i);
            // check if character is in string assembled and between unicode values a-z
            if (charAtPosition >= 'a' && charAtPosition <= 'z' && stringAssembled.indexOf(charAtPosition) < 0) {
                stringAssembled += charAtPosition;
            }
        }

        if (stringAssembled.length() == 26) {
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODOf
    public static int getNumberOfOccurrences(String[] array, String value) {
        // loop through
        int counter = 0;
        for (int i = 0; i <array.length; i++) {
            // conditional
            if (array[i].equals(value)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODOf
    public static String[] removeValue(String[] array, String valueToRemove) {
        int x = 0;
        for (int i =0; i <array.length; i++){
            //check if element i matches value
            //use ! to reverse the locic equals
            if (!array[i].equals(valueToRemove)) {
                //if no match to remove, go to next array element
                x++;
            }
        }
        //create empty fixed array
        String[] fixedArray = new String[x];
        int y = 0;
        //build array with a loop
        for (int i=0; i<array.length;i++){
            if (!array[i].equals(valueToRemove)){
                //as long as no match to remove
                fixedArray[y++] = array[i];
            }
        }
        return fixedArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] result = new String[array.length]; // new array for result
        int x = 0; // indexer for original array
        for (int i = 0; i < array.length; i++) { // loop
            result[x++] = array[i]; // add element to result
            while (i < array.length - 1 && array[i].equals(array[i + 1])) { // skip duplicate
                i++;
            }
        }
        String[] finalArray = new String[x]; // new final array
        System.arraycopy(result, 0, finalArray, 0, x); // copy to final array

        return finalArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> outputArray = new ArrayList<>();
        // change to string builder from basic string
        // array initialized empty first element
        StringBuilder tempConcat = new StringBuilder(array[0]);
            for (int i = 1; i < array.length; i++ ){
                // while true loop, meaning while element 1 and next are equal, keep concat going
                if (array[i].equals(array[i-1])){
                    // change + concat to append
                    tempConcat.append(array[i]);
                } else {
                    // change tempConcat to string
                    outputArray.add(tempConcat.toString());
                    // reset the stringbuilder tempcat
                    tempConcat = new StringBuilder(array[i]);
                    }
                }
                // add the last concat tempConcat to the output array
                outputArray.add(tempConcat.toString());
                return outputArray.toArray(new String[0]);

    }


}
