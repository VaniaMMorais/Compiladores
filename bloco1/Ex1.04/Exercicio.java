import java.util.Scanner;
import java.util.HashMap;
import java.io.FileInputStream;

public class Exercicio {
    static HashMap<String, Integer> loadFile(String filename){

        FileInputStream fileInput = null;
        Scanner input;
        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();
        
        try{
            fileInput = new FileInputStream(filename);
        } catch(Exception e){
            System.err.printf("Cannot use file\"%s\": %s\n", filename, e);
            System.exit(1);
        }

        input = new Scanner(fileInput);

        try{
            while(input.hasNext()){
                Integer value;
                String name;
    
                value = input.nextInt();
                input.next();
                name = input.next();
    
                dictionary.put(name, value);
                
            }
        }catch(Exception e){
            System.err.printf("Cannot use file\"%s\": wrong format\n", filename);
            System.exit(3);
        }
        return dictionary;
    }

    static void parseInput(HashMap<String, Integer> dictionary){
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
            String token = input.next();
            Integer value = dictionary.get(token);

            if(value != null){
                System.out.printf("%d", value);
            }
            else{
                System.out.printf("%s", token);
            }
        }
        System.out.printf("\n");
    }

    public static void main(String args[]){
        if(args.length != 1){
            System.err.printf("Usage: java Exercicio <filename>\n");
            System.exit(1);
        }
        
        parseInput(loadFile(args[0]));
    }
}
