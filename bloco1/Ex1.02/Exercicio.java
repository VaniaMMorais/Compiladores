import java.util.Scanner;
import java.util.HashMap;  

public class Exercicio {

    static Scanner input;
    static HashMap<String, Double> variables = new HashMap<String, Double>();

    static void setVariable(String name, Double value){
        variables.put(name, value);
    }

    static Double getVariable(String name){
        return variables.get(name);
    }

    static Double operation(String operand1, String operator, String operand2){
        Double v1, v2;
        v1 = value(operand1);
        v2 = value(operand2);

        switch(operator){
            case "+":
                return v1+v2;
            case "-":
                return v1-v2;   
            case "*":
                return v1*v2;
            case "/":
                return v1/v2;
            default: return 0.0;
        }
    }

    static Double value(String token){
        if(Character.isLetter(token.charAt(0))){// variable
            return getVariable(token);
        }
        else{ // literal
            return Double.valueOf(token);
        }
    }
    
    static Double expression(String[] tokens, int index){

        switch(tokens.length - index){
            case 1:
                return value(tokens[index]);
            case 3:
                return operation(tokens[index], tokens[index+1], tokens[index+2]);
            default:
                return 0.0;
        }
    }

    static Double instruction(String line){
        // Separado por 1 ou + espaços
        String[] tokens = line.split(" +");

        if (tokens.length >= 3 && tokens[1].equals("=")){ // var = mum (atribuição)
            setVariable(tokens[0], expression(tokens, 2));
            return getVariable(tokens[0]);
        }
        else{ // expression
            return expression(tokens, 0);
        }
    }

    static void calculator(){
        String line;
        try{
            for(;;){
                line = input.nextLine();
                System.out.printf("%f\n", instruction(line));
            }
        }catch(Exception e){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        input = new Scanner(System.in);
        calculator();
    }
}
