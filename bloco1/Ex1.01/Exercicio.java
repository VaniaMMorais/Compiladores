import java.util.Scanner;

class Exercicio{
    static Scanner input;

    static String readToken(){
        String token= null;
        try{
            token = input.next();
        }catch(Exception e){
            System.exit(0);
        }
        return token;
    }

    static String readOperation(){
        String token;

        for(;;){
            token = readToken();
            if(token.length() != 1){
                System.err.printf("%s is not a valid operation\n", token);
                continue;
            }
            
            if( (token.charAt(0) == '+' || token.charAt(0) == '-' 
                || token.charAt(0) == '*' || token.charAt(0) == '/')){
                return token;
            }

            
        }
        
    }

    static Double readOperand(){
        String token;
        Double value;

        for(;;){
            token = readToken();
            try{
                value = Double.valueOf(token);
            }catch(Exception e){
                System.err.printf("%s is not a valid real number\n", token);
                continue;
            }
            
            return value;
        }
        

    }

    static void calculator(){
        Double operand1, operand2;
        String operation;
        Double result = 0.0;

        for(;;){
            operand1= readOperand();
            operation = readOperation();
            operand2 = readOperand();

            switch(operation){
                case "+": 
                    result = operand1 + operand2; 
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
            }
            System.out.println(result);
        }
        

    }
    public static void main(String[] args){
        input = new Scanner(System.in);
        calculator();
    }
}