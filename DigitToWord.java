import java.util.Scanner;
public class DigitToWord{
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        int num = 0;//initalize
        int digitCount = 0;//initialize
        String numString = null;//initialize
        String oneNum = null;
        String tenNum = null;
        String hundNum = null;
        String thouNum = null;
        String tenThouNum = null;
        String hundThouNum = null;
        String millNum = null;
        String finalNum = null;
        
        while(true){

            System.out.print("Please enter a whole number: ");
            num = scanner.nextInt();
            numString = String.valueOf(num);
        
            if(numString.length()>=1){
                oneNum = getOnes(numString);
            }
            if(numString.length()>=2){
                tenNum = getTens(numString);
            }
            if(numString.length()>=3){
                hundNum = getHundreds(numString);
            }
            if(numString.length()>= 4){
                thouNum = getThousands(numString);
            }
            if(numString.length()>=5){
                tenThouNum = getTenThousands(numString);
            }
            if(numString.length()>=6){
                hundThouNum = getHundThousands(numString);
            }
            if(numString.length()>=7){
                millNum = getMillions(numString);
            }
            
            finalNum = combinedNum(numString, oneNum, tenNum, hundNum, thouNum, tenThouNum, hundThouNum, millNum);
            System.out.println(finalNum);

        }
    }   

    public static String getOnes(String numString) {

        int stringLength = numString.length();
        String oneString = null;
        
        int oneNum = numString.charAt(stringLength - 1) - '0';
    
        switch (oneNum) {
            case 0:
                return null;

            case 1:
                oneString = "one";
                break;

            case 2:
                oneString = "two";
                break;

            case 3:
                oneString = "three";
                break;
                
            case 4:
                oneString = "four";
                break;

            case 5:
                oneString = "five";
                break;

            case 6:
                oneString = "six";
                break;

            case 7:
                oneString = "seven";
                break;

            case 8:
                oneString = "eight";
                break;

            case 9:
                oneString = "nine";
                break;
        }
        return oneString;
    }
    
    public static String getTens(String numString){

        int stringLength = numString.length();
        String tenString = null;

        int tenNum = numString.charAt(stringLength - 2) - '0';
        int oneNum = numString.charAt(stringLength - 1) - '0';

        switch (tenNum) {

            case 0:
                return null;

            case 1:
                if(oneNum == 0){
                    tenString = "ten ";
                }

                else if(oneNum == 1){
                    tenString = "eleven ";
                }

                else if(oneNum == 2){
                    tenString = "twelve ";
                }

                else if(oneNum == 3){
                    tenString = "thirteen ";
                }

                else if(oneNum == 4){
                    tenString = "fourteen ";
                }

                else if(oneNum == 5){
                    tenString = "fifteen ";
                }

                else if(oneNum == 6){
                    tenString = "sixteen ";
                }

                else if(oneNum == 7){
                    tenString = "seventeen "; 
                }

                else if(oneNum == 8){
                    tenString = "eighteen ";
                }

                else if(oneNum == 9){
                    tenString = "nineteen ";
                }
                break;

            case 2:
                tenString = "twenty ";
                break;

            case 3:
                tenString = "thirty ";
                break;

            case 4:
                tenString = "fourty ";
                break;

            case 5:
                tenString = "fifty ";
                break;

            case 6:
                tenString = "sixty ";
                break;
                
            case 7:
                tenString = "seventy ";
                break;

            case 8:
                tenString = "eighty ";
                break;

            case 9:
                tenString = "ninety ";
                break;
        }      
        return tenString;
    }

    public static String getHundreds(String numString){

        int stringLength = numString.length();
        String hundString = null;

        int hundNum = numString.charAt(stringLength - 3) - '0';

        switch(hundNum){

            case 0:
            hundString = null;
            break;

            case 1: 
            hundString = "one hundred ";
            break;

            case 2: 
            hundString = "two hundred ";
            break;

            case 3: 
            hundString = "three hundred ";
            break;

            case 4: 
            hundString = "four hundred ";
            break;

            case 5: 
            hundString = "five hundred ";
            break;

            case 6: 
            hundString = "six hundred ";
            break;

            case 7: 
            hundString = "seven hundred ";
            break;

            case 8: 
            hundString = "eight hundred ";
            break;

            case 9: 
            hundString = "nine hundred ";
            break;
        }
        return hundString;
    }

    public static String getThousands(String numString){

        int stringLength = numString.length();
        String thouString = null;

        int thouNum = numString.charAt(stringLength - 4) - '0';

        switch(thouNum){

            case 0:
            thouString = null;
            break;

            case 1: 
            thouString = "one thousand ";
            break;

            case 2: 
            thouString = "two thousand ";
            break;

            case 3: 
            thouString = "three thousand ";
            break;

            case 4: 
            thouString = "four thousand ";
            break;

            case 5: 
            thouString = "five thousand ";
            break;

            case 6: 
            thouString = "six thousand ";
            break;

            case 7: 
            thouString = "seven thousand ";
            break;

            case 8: 
            thouString = "eight thousand ";
            break;

            case 9: 
            thouString = "nine thousand ";
            break;
        }
        return thouString;
    }

    public static String getTenThousands(String numString){

        int stringLength = numString.length();
        String tenThouString = null;

        int tenThouNum = numString.charAt(stringLength - 5) - '0';
        int thouNum = numString.charAt(stringLength - 4) - '0';

        switch(tenThouNum){

            case 0:
            tenThouString = null;
            break;

            case 1:
                if(thouNum == 0){
                    tenThouString = "ten thousand ";
                }
                else if(thouNum == 1){
                    tenThouString = "eleven thousand ";
                }
                else if(thouNum == 2){
                    tenThouString = "twelve thousand ";
                }
                else if(thouNum == 3){
                    tenThouString = "thirteen thousand ";
                }
                else if(thouNum == 4){
                    tenThouString = "fourteen thousand ";
                }
                else if(thouNum == 5){
                    tenThouString = "fifteen thousand ";
                }
                else if(thouNum == 6){
                    tenThouString = "sixteen thousand ";
                }
                else if(thouNum == 7){
                    tenThouString = "seventeen thousand "; 
                }
                else if(thouNum == 8){
                    tenThouString = "eighteen thousand ";
                }
                else if(thouNum == 9){
                    tenThouString = "nineteen thousand ";
                }
                break;

            case 2: 
            tenThouString = "twenty ";
            break;

            case 3: 
            tenThouString = "thirty ";
            break;

            case 4: 
            tenThouString = "fourty ";
            break;

            case 5: 
            tenThouString = "fifty ";
            break;

            case 6: 
            tenThouString = "sixty ";
            break;

            case 7: 
            tenThouString = "seventy ";
            break;

            case 8: 
            tenThouString = "eighty ";
            break;

            case 9: 
            tenThouString = "ninety ";
            break;
        }
        return tenThouString;
    }

    public static String getHundThousands(String numString){

        int stringLength = numString.length();
        String hundThouString = null;

        int tenThouNum = numString.charAt(stringLength - 6) - '0';

        switch(tenThouNum){

            case 0:
            hundThouString = null;
            break;

            case 1: 
            hundThouString = "one hundred ";
            break;

            case 2: 
            hundThouString = "two hundred ";
            break;

            case 3: 
            hundThouString = "three hundred ";
            break;

            case 4: 
            hundThouString = "four hundred ";
            break;

            case 5: 
            hundThouString = "five hundred ";
            break;

            case 6: 
            hundThouString = "six hundred ";
            break;

            case 7: 
            hundThouString = "seven hundred ";
            break;

            case 8: 
            hundThouString = "eight hundred ";
            break;

            case 9: 
            hundThouString = "nine hundred ";
            break;
        }
        return hundThouString;
    }

    public static String getMillions(String numString){

        int stringLength = numString.length();
        String millString = null;

        int millNum = numString.charAt(stringLength - 7) - '0';

        switch(millNum){

            case 0:
            millString = null;
            break;

            case 1: 
            millString = "one million ";
            break;

            case 2: 
            millString = "two million ";
            break;

            case 3: 
            millString = "three million ";
            break;

            case 4: 
            millString = "four million ";
            break;

            case 5: 
            millString = "five million ";
            break;

            case 6: 
            millString = "six million ";
            break;

            case 7: 
            millString = "seven million ";
            break;

            case 8: 
            millString = "eight million ";
            break;

            case 9: 
            millString = "nine million ";
            break;
        }
        return millString;
    }
    
    public static String combinedNum(String numString, String oneNum, String tenNum, String hundNum, String thouNum, String tenThouNum, String hundThouNum, String millNum) {
        String finalNum = "";
        int stringLength = numString.length();
        
        // Get the individual digits
        int oneNumDig = stringLength >= 1 ? numString.charAt(stringLength - 1) - '0' : 0;
        int tenNumDig = stringLength >= 2 ? numString.charAt(stringLength - 2) - '0' : 0;
        int thouNumDig = stringLength >= 4 ? numString.charAt(stringLength - 4) - '0' : 0;
    
        if (stringLength == 1) {
            finalNum = oneNum;
        } else if (stringLength == 2) {
            if (tenNumDig == 1) {
                finalNum = tenNum;
            } else {
                finalNum = tenNum + oneNum;
            }
        } else if (stringLength == 3) {
            finalNum = hundNum + tenNum + oneNum;
        } else if (stringLength == 4) {
            finalNum = thouNum + hundNum + tenNum + oneNum;
        } else if (stringLength == 5) {
            if (tenNumDig == 1) {
                finalNum = tenThouNum + thouNum + hundNum + tenNum;
            } else if (thouNumDig == 1) {
                finalNum = tenThouNum + hundNum + tenNum + oneNum;
            } else {
                finalNum = tenThouNum + thouNum + hundNum + tenNum + oneNum;
            }
        } else if (stringLength == 6) {
            if (tenNumDig == 1) {
                finalNum = hundThouNum + tenThouNum + thouNum + hundNum + tenNum;
            } else if (thouNumDig == 1) {
                finalNum = hundThouNum + tenThouNum + hundNum + tenNum + oneNum;
            } else {
                finalNum = hundThouNum + tenThouNum + thouNum + hundNum + tenNum + oneNum;
            }
        } else if (stringLength == 7) {
            if (tenNumDig == 1) {
                finalNum = millNum + hundThouNum + tenThouNum + thouNum + hundNum + tenNum;
            } else if (thouNumDig == 1) {
                finalNum = millNum + hundThouNum + tenThouNum + hundNum + tenNum + oneNum;
            } else {
                finalNum = millNum + hundThouNum + tenThouNum + thouNum + hundNum + tenNum + oneNum;
            }
        }
        
        return finalNum;
    }    
}