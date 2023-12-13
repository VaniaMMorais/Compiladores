import java.util.*;
import java.io.*;

@SuppressWarnings("CheckReturnValue")
public class Execute extends GBaseVisitor<String> {

   Map<String, String> variables = new HashMap<String, String>();

   @Override public String visitPrint(GParser.PrintContext ctx) {
      String expr = visit(ctx.expr());
      
      if (expr != null){
         System.out.printf("%s\n", expr);
      }

      return null;
   }

   @Override public String visitAssign(GParser.AssignContext ctx) {
      String expr = visit(ctx.expr());
      
      if (expr != null){
         variables.put(ctx.ID().getText(), expr);
      }

      return null;
   }

   @Override public String visitParentesis(GParser.ParentesisContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitAdd(GParser.AddContext ctx) {
      String expr1, expr2;
      expr1 = visit(ctx.expr(0));
      expr2 = visit(ctx.expr(1));

      if(expr1 == null || expr2 == null){
         return null;
      }

      return expr1 + expr2;
   }

   @Override public String visitInput(GParser.InputContext ctx) {
      String expr = visit(ctx.expr());

      Scanner sc = new Scanner(System.in);

      if (expr == null){
         return null;
      }
      System.out.print(expr);

      return sc.nextLine();
   }

   @Override public String visitSub(GParser.SubContext ctx) {
      String expr1, expr2;
      expr1 = visit(ctx.expr(0));
      expr2 = visit(ctx.expr(1));

      if(expr1 == null || expr2 == null){
         return null;
      }


      return (new String(expr1)).replace(expr2, ""); // Isto é feito para não modificar o valor de expr1
   }

   @Override public String visitTrim(GParser.TrimContext ctx) {
      String expr = visit(ctx.expr());

      if (expr == null){
         return null;
      }

      return (new String(expr)).trim();  // Mesma situação que no visitSub
   }

   @Override public String visitVar(GParser.VarContext ctx) {
      String varName = ctx.ID().getText();
      String varValue = variables.get(varName);

      if (varValue == null){
         System.err.printf("Error: variable %s not defined\n", varName);
      }

      return varValue;
   }

   @Override public String visitReplace(GParser.ReplaceContext ctx) {
      String expr1, expr2, expr3;
      expr1 = visit(ctx.expr(0));
      expr2 = visit(ctx.expr(1));
      expr3 = visit(ctx.expr(2));

      if(expr1 == null || expr2 == null || expr3 == null){
         return null;
      }


      return (new String(expr1)).replace(expr2, expr3); // Mesma situação que no visitSub
   }

   @Override public String visitLiteral(GParser.LiteralContext ctx) {
      String value = ctx.LITERAL().getText();
      return value.substring(1, value.length() - 1);
   }
}
