package day03_EscapeSequences;
/*   Escape Sequences : must be given within double quote.

      \n: starts a new line
      \t: Horizontal tab
      \\: a backslash will be printed
 */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPhyton \nC#");

        System.out.println("--------------------");
        System.out.println("Hello Cydeo! \nHow are you all today ? \nIt's nice to see you all.");
        System.out.println("\tJava is a cool programming language."); // give a paragraph space

        System.out.println("-------------------------");
        System.out.println("/ \\"); //in order to print one backward slash we have to type two backward slash
        System.out.println("My favorite Tv show is \" Good Place \"."); // in order to type " double quote you have to type \"

    }


}
