import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Ndict extends NumbersBaseListener {

   private HashMap<String, Integer> mappings;

   public Ndict() {
      mappings = new HashMap<String, Integer>();
   }

   @Override public void enterMapping(NumbersParser.MappingContext ctx) {
      System.out.printf("%s -> %s\n", ctx.WORD().getText(),ctx.NUMBER().getText());
      mappings.put(ctx.WORD().getText(), Integer.parseInt(ctx.NUMBER().getText()));
   }

   public HashMap<String, Integer> mappings() {
      return mappings;
   }

}
