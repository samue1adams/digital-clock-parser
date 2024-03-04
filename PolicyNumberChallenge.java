import java.util.Scanner;
import java.util.HashMap;

public class PolicyNumberChallenge {
    public static void main(String[] args) {

        HashMap<String, String> validPolicyDigits = new HashMap<>(){{
            put(" _ "+
                "| |"+
                "|_|", "0");

            put("   "+
                "  |"+
                "  |", "1");

            put(" _ "+
                " _|"+
                "|_ ", "2");

            put(" _ "+
                " _|"+
                " _|", "3");

            put("   "+
                "|_|"+
                "  |", "4");

            put(" _ "+
                "|_ "+
                " _|", "5");

            put(" _ "+
                "|_ "+
                "|_|", "6");

            put(" _ "+
                "  |"+
                "  |", "7");

            put(" _ "+
                "|_|"+
                "|_|", "8");

            put(" _ "+
                "|_|"+
                " _|", "9");

        }};
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Policy Numbers: \n\n");
        
        while (scanner.hasNext()) {
            
            String start = scanner.nextLine();
                    
            String line1 = start.trim().isEmpty() ? scanner.nextLine() : start;
            String line2 = scanner.nextLine();
            String line3 = scanner.nextLine();

            StringBuilder policyNumber = new StringBuilder();

            for (int i = 0; i < line1.length() - 2; i = i + 3 ){
                String policyDigit = validPolicyDigits.get(line1.substring(i, i + 3) + line2.substring(i, i + 3) + line3.substring(i, i + 3));
                if (policyDigit != null ) {
                    policyNumber.append(policyDigit);
                }
                else {
                    policyNumber.append("?");
                }
            }
           
            
            System.out.println(policyNumber);
            System.out.println("Policy number is valid: " + policyNumberValidation(policyNumber.toString())  + "\n");
        }
        
    }
    
    public static boolean policyNumberValidation(String policyNumber){
        char[] charArray = policyNumber.toCharArray();
        int checkSum = 0;
        int multiple = 1;
        
        for(int i = charArray.length - 1 ; i >= 0; i--){
            checkSum = checkSum + (Character.getNumericValue(charArray[i]) * multiple);
            multiple++;
        }
        
        return (checkSum % 11 == 0);
        
    }
}
