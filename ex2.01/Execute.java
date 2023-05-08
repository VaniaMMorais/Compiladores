import org.antlr.v4.runtime.tree.*;

public class Execute extends HelloBaseVisitor<Object> {

   @Override 
   public Object visitTop(HelloParser.TopContext ctx) {
      Object res = null;
      visitChildren(ctx);
      return res;
   }   //PODEMOS USAR O METODO ORIGINAL (HELLOBASEVISITOR)

   @Override 
   public Object visitR(HelloParser.RContext ctx) {
      Object res = null;
      System.out.printf("Olá %s\n", visitName(ctx.name()));
      return res;
   }

   @Override 
   public Object visitBye(HelloParser.ByeContext ctx) {
      Object res = null;
      System.out.printf("Adeus %s\n", visitName(ctx.name()));
      return res;
   }

   @Override 
   public Object visitName(HelloParser.NameContext ctx) {
      String res = "";
      for (TerminalNode id: ctx.ID()){
         res += id.getText() + " ";
      }
      return res;
   }
}
