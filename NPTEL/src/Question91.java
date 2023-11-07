import java.util.Scanner;
public class Question91{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // Read as string, e.g., 5+6
// Declare and initialize the required variable(s)
		int i=0;
		int j=0;
		double output=0;
		// Split the input string into character array
		char seq[] = input.toCharArray();
		/*
		Use some method to separate the two operands
		and then perform the required operation.
		*/
		for(int a=0; a<seq.length; a++){
			if(seq[a]=='+'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i+j;
			}else if(seq[a]=='-'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i-j;
			}else if(seq[a]=='/'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i/j;
			}else if(seq[a]=='*'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i*j;
			}
		}
		// Print the output as stated in the question
		System.out.print(input+" = " + Math.round(output));
}
}

//import java.util.Scanner;
//public class Question91{
//	public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine(); // Read as string, e.g., 5+6
// // Declare and initialize the required variable(s)
//        double result = calculate(input);
//
//        // Print the output as stated in the question
//        System.out.println(input + " = " + Math.round(result));
//    }
//
//    public static double calculate(String input) {
//        // Split the input string into character array
//        char[] chars = input.toCharArray();
//
//        // Separate two operands and operator
//        double operand1 = Double.parseDouble(String.valueOf(chars[0]));
//        double operand2 = Double.parseDouble(String.valueOf(chars[2]));
//        char operator = chars[1];
//
//        // Perform the required operation
//        double result = 0;
//        switch (operator) {
//            case '+':
//                result = operand1 + operand2;
//                break;
//            case '-':
//                result = operand1 - operand2;
//                break;
//            case '*':
//                result = operand1 * operand2;
//                break;
//            case '/':
//                result = operand1 / operand2;
//                break;
//        }
//
//        return result;
//}
//}