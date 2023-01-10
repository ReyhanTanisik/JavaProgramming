package utilities;

import java.util.Arrays;

public class ArraysUtilities {


    // print integer from integer array with seperate lines

    public static void printEach( int [] array){
        for ( int each : array) {
            System.out.println(each);
         }
    }


    public static void printEach( double [] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    public static void printEach(char[] array){
            for (char each : array) {
                System.out.println(each);
            }
        }

    public static void printEach( String [] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }


    public static int max ( int[] numbers){
        Arrays.sort(numbers);
        return numbers[ numbers.length-1];
    }



    public static double max ( double[] numbers){
        Arrays.sort(numbers);
        return numbers[ numbers.length-1];
    }

    public static int min ( int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static double min ( double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

  // checks if the given int is contained in the contained array

    public static boolean contains (int[] array ,int element){
        boolean result=false;
        for( int each : array){
            if(each==element){
                result=true;
            }

        }
        return result;
    }


    public static boolean contains (double[] array ,double element){
        boolean result=false;
        for( double each : array){
            if(each==element){
                result=true;
            }

        }
        return result;
    }


    public static boolean contains (char[] array ,char element){
        boolean result=false;
        for( char each : array){
            if(each==element){
                result=true;
            }

        }
        return result;
    }


    public static boolean contains (String [] array ,String element){
        boolean result=false;
        for( String each : array){
            if(each.equals(element)){
                result=true;
            }

        }
        return result;
    }



    public static int frequencyOfElement ( int[] array , int element ){
        int count =0;
        for (int each : array){
            if( each== element){
                count++;
            }
        }
        return count;
    }


    public static int frequencyOfElement ( double[] array , double element ){

        int count =0;
        for (double each : array){
            if( each== element){
                count++;
            }
        }
        return count;


    }



    public static int frequencyOfElement ( String[] array , String element ){
        int count =0;
        for (String each : array){
            if( each.equals(element)){
                count++;
            }
        }
        return count;
    }


    public static int frequencyOfElement ( char[] array , char element ){
        int count =0;
        for (char each : array){
            if( each== element){
                count++;
            }
        }
        return count;
    }

    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element; // i will be the last element after loop
        return result;

    }

    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;

        }
        result[i] = element; // i will be the last element after loop
        return result;


    }


    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;
    }


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


    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtilities.addElement(result, each);
        }

        for (int each : arr2) {
            result = ArraysUtilities.addElement(result, each);
        }

        return result;
    }


    // merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){

        double[] result = {};

        for (double each : arr1) {
            result = ArraysUtilities.addElement(result, each);
        }

        for (double each : arr2) {
            result = ArraysUtilities.addElement(result, each);
        }

        return result;
    }


    // merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){

        char[] result = {};

        for (char each : arr1) {
            result = ArraysUtilities.addElement(result, each);
        }

        for (char each : arr2) {
            result = ArraysUtilities.addElement(result, each);
        }

        return result;
    }


    // merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2){

        String[] result = {};

        for (String each : arr1) {
            result = ArraysUtilities.addElement(result, each);
        }

        for (String each : arr2) {
            result = ArraysUtilities.addElement(result, each);
        }

        return result;
    }


    public static int[] reverse(int[] array){

        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }



    public static int [] replace ( int [] array , int index ,int newElement){
        if(index <=0 || index>= array.length){
            System.out.println("Invalid index");
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }

    public static double [] replace ( double [] array , int index ,double newElement){
        if(index <=0 || index>= array.length){
            System.out.println("Invalid index");
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }


    public static char [] replace ( char [] array , int index ,char newElement){
        if(index <=0 || index>= array.length){
            System.out.println("Invalid index");
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }

    public static String [] replace ( String [] array , int index ,String newElement){
        if(index <=0 || index>= array.length){
            System.out.println("Invalid index");
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }


    public static int [] replaceAll ( int [] array , int oldElement , int newElement){
        for (int i = 0; i < array.length; i++) {

            if( array [i]== oldElement){
                array[i]=newElement;
            }

        }
        return array;


    }
    public static char [] replaceAll ( char [] array , char oldElement , char newElement){
        for (int i = 0; i < array.length; i++) {

            if( array [i]== oldElement){
                array[i]=newElement;
            }

        }
        return array;


    }


    public static double [] replaceAll ( double [] array , double oldElement , double newElement){
        for (int i = 0; i < array.length; i++) {

            if( array [i]== oldElement){
                array[i]=newElement;
            }

        }
        return array;


    }

    public static String [] replaceAll ( String [] array , String oldElement ,String newElement){
        for (int i = 0; i < array.length; i++) {

            if( array[i].equals(oldElement)){
                array[i]=newElement;
            }

        }
        return array;


    }

    public static  int [] removeDuplicates ( int [] array){
        int [] result={};
        for (int each : array){
            if(!(ArraysUtilities.contains(result,each))){
                result= ArraysUtilities.addElement(result,each);
            }
        }
        return result;
    }

    public static  double [] removeDuplicates ( double [] array){
        double [] result={};
        for (double each : array){
            if(!(ArraysUtilities.contains(result,each))){
                result= ArraysUtilities.addElement(result,each);
            }
        }
        return result;
    }

    public static  char [] removeDuplicates ( char [] array){
        char [] result={};
        for (char each : array){
            if(!(ArraysUtilities.contains(result,each))){
                result= ArraysUtilities.addElement(result,each);
            }
        }
        return result;
    }


    public static  String [] removeDuplicates ( String [] array){
        String [] result={};
        for (String each : array){
            if(!(ArraysUtilities.contains(result,each))){
                result= ArraysUtilities.addElement(result,each);
            }
        }
        return result;
    }








}


