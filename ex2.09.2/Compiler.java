import org.stringtemplate.v4.*;
import java.util.*;

public class Compiler extends FracBaseVisitor<String> {

   STGroup group = new STGroupFile("templates.stg");
   Map<String, Boolean> varaiables = new HashMap<String, Boolean>();

   @Override public String visitProgram(FracParser.ProgramContext ctx) {
      ST st;
      String result;
      st = group.getInstanceOf("begin");
      result = st.render();

      visitChildren(ctx);

      st = group.getInstanceOf("end");
      result += st.render();

      System.out.println(result);
      return null;
   }

   @Override public String visitInstruction(FracParser.InstructionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPrint(FracParser.PrintContext ctx) {
      String e = visit(ctx.expr());
      ST st = group.getInstanceOf("print");

      st.add("e", e);
      System.out.println(st.render());
      return null;
   }

   @Override public String visitAssign(FracParser.AssignContext ctx) {
      String name = ctx.ID().getText();
      Boolean exists = varaiables.get(name);
      ST st;
      String result = "";
      String e = visit(ctx.expr());

      if(exists == null){ // variable not used
         st = group.getInstanceOf("var_decl");
         st.add("name", name);
         result += st.render();
         varaiables.put(name, true);
      }
      else{ // variable already used
         st = group.getInstanceOf("var_set");
         st.add("name", name);
         st.add("e", e);
         result += st.render();

      }
      System.out.println(result);
      return result;
   }

   @Override public String visitUnaryExpr(FracParser.UnaryExprContext ctx) {
      String e = visit(ctx.expr());
      ST st ;

      if(ctx.op.getText().equals("-")){
         st = group.getInstanceOf("unary");
         st.add("e",e);
         return st.render();
      }
      return e;
   }

   @Override public String visitPowerExpr(FracParser.PowerExprContext ctx) {
      String base = visit(ctx.expr(0));
      String exp = visit(ctx.expr(1));
      ST st = group.getInstanceOf("power");

      st.add("b", base);
      st.add("e", exp);
      return st.render();
   }

   @Override public String visitLiteralExpr(FracParser.LiteralExprContext ctx) {
      String literals[] = ctx.LITERAL().getText().split("/");
      ST st = group.getInstanceOf("literal");

      if(literals.length == 1){
         st.add("n", literals[0]);
         st.add("d", "1");
      }
      else{
         st.add("n", literals[0]);
         st.add("d", literals[1]);
      }

      return st.render();
   }

   @Override public String visitReduceExpr(FracParser.ReduceExprContext ctx) {
      String e = visit(ctx.expr());
      ST st = group.getInstanceOf("reduce");

      st.add("e", e);
      return st.render();
   }

   @Override public String visitMulDivExpr(FracParser.MulDivExprContext ctx) {
      String e1 = visit(ctx.expr(0));
      String e2 = visit(ctx.expr(2));
      ST st;

      if(ctx.op.getText().equals("*")){
         st = group.getInstanceOf("mul");
      }
      else{
         st = group.getInstanceOf("div");
      }

      st.add("e1", e1);
      st.add("e2", e2);
      
      return st.render();
   }

   @Override public String visitSumSubExpr(FracParser.SumSubExprContext ctx) {
      String e1 = visit(ctx.expr(0));
      String e2 = visit(ctx.expr(2));
      ST st;

      if(ctx.op.getText().equals("+")){
         st = group.getInstanceOf("sum");
      }
      else{
         st = group.getInstanceOf("sub");
      }

      st.add("e1", e1);
      st.add("e2", e2);

      return st.render();
   }

   @Override public String visitParenExpr(FracParser.ParenExprContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitIdExpr(FracParser.IdExprContext ctx) {
      ST st = group.getInstanceOf("var_name");
      st.add("name", ctx.ID().getText());
      return st.render();
      //return res;
   }
}
