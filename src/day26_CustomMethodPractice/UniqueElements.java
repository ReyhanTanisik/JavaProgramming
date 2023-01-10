package day26_CustomMethodPractice;

import utilities.ArraysUtilities;

public class UniqueElements {


        public static int[] uniqueElements(int[] array){
            int[] result = {}; //new int[0]

            for (int each : array) {

                if( ArraysUtilities.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                    result = ArraysUtilities.addElement(result, each);
                }

            }

            return result;
        }


        // returns the unique elements of the array as a new array
        public static double[] uniqueElements(double[] array){
            double[] result = {}; //new int[0]

            for (double each : array) {

                if( ArraysUtilities.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                    result = ArraysUtilities.addElement(result, each);
                }

            }

            return result;
        }


        // returns the unique elements of the array as a new array
        public static char[] uniqueElements(char[] array){
            char[] result = {}; //new int[0]

            for (char each : array) {

                if( ArraysUtilities.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                    result = ArraysUtilities.addElement(result, each);
                }

            }

            return result;
        }


        // returns the unique elements of the array as a new array
        public static String[] uniqueElements(String[] array){
            String[] result = {}; //new int[0]

            for (String each : array) {

                if( ArraysUtilities.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                    result = ArraysUtilities.addElement(result, each);
                }

            }

            return result;
        }



    }


