import java.util.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;

public class GMain {
   public static void main(String[] args) {
      try {
         if(args.length == 0) {
            System.out.println("Usage: java GMain <inputfile> \n");
            System.exit(2);
         }
         Scanner sc = new Scanner(new FileInputStream(args[0]));
         String lineText = null;
         int numLine = 1;
         if (sc.hasNextLine())
            lineText = sc.nextLine();
         GParser parser = new GParser(null);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         Execute visitor0 = new Execute();
         while(lineText != null) {
            // create a CharStream that reads from standard input:
            CharStream input = CharStreams.fromString(lineText + "\n");
            // create a lexer that feeds off of input CharStream:
            GLexer lexer = new GLexer(input);
            lexer.setLine(numLine);
            lexer.setCharPositionInLine(0);
            // create a buffer of tokens pulled from the lexer:
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // create a parser that feeds off the tokens buffer:
            parser.setInputStream(tokens);
            // begin parsing at program rule:
            ParseTree tree = parser.program();
            if (parser.getNumberOfSyntaxErrors() == 0) {
               // print LISP-style tree:
               // System.out.println(tree.toStringTree(parser));
               visitor0.visit(tree);
            }
            if (sc.hasNextLine())
               lineText = sc.nextLine();
            else
               lineText = null;
            numLine++;
         }
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(Exception e) {
         System.err.printf("File cannot be used: %s \n", args[0]);
         System.exit(1);
      }
   }
}
