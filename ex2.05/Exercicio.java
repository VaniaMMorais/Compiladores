import java.util.Scanner;
import java.util.HashMap;
import java.io.FileInputStream;

import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.w3c.dom.traversal.TreeWalker;

public class Exercicio {
    static HashMap<String, Integer> loadFile(String filename){

        FileInputStream fileInput = null;
        Ndict listener = null;

        
        try{
            fileInput = new FileInputStream(filename);
        } catch(Exception e){
            System.err.printf("Cannot use file\"%s\": %s\n", filename, e);
            System.exit(2);
        }

        // ANTLR4 stuff

        try{
            CharStream input = CharStreams.fromStream( fileInput );
            NumbersLexer lexer = new NumbersLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            NumbersParser parser = new NumbersParser(tokens);
            ParseTree tree = parser.top();

            if (parser.getNumberOfSyntaxErrors() != 0) {
                System.err.printf("Cannot use file \"s\": it has syntatic errors", filename);
                System.exit(3);
            };
            

            ParseTreeWalker walker= new ParseTreeWalker();
            listener = new Ndict();
            walker.walk(listener, tree);

            
        }catch(IOException E){
            E.printStackTrace();
            System.exit(4);
        }

        // end of it
    
        return listener.mappings();
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
