import java.io.File;
import java.util.Scanner;

public class search {
    public static void main(String[] args) throws Exception {
        String fileName = args[0];
        String matchWord = args[1];
        File inputFile = new File(fileName);
        Scanner scan = new Scanner(inputFile);
        while (scan.hasNextLine()){
            String nextLine = scan.nextLine();
            String[] words = nextLine.split(" ");
            for (String word : words) {
                if (word.equals(matchWord)) {
                    System.out.println(nextLine); 
                    break;  
                }
            }     
        }
        scan.close();

    }
}
