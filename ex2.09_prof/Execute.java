import java.util.HashMap;
import java.util.Map;
public class Execute extends FracBaseVisitor<Frac> {

   static Map<String, Frac> variables = new HashMap<String, Frac>();

   @Override public Frac visitPrint(FracParser.PrintContext ctx) {
      Frac value = visit(ctx.expr());
      if(value.denominador ==1){
         System.out.printf("%d\n",value.numerador);
      }
      else{
         System.out.printf("%d/%d\n",value.numerador,value.denominador);
      }

      return null;
   }

   @Override public Frac visitAssign(FracParser.AssignContext ctx) {
      Frac value = visit(ctx.expr());
      variables.put(ctx.ID().getText(), value);
      return null;
   }

   @Override public Frac visitUnaryExpr(FracParser.UnaryExprContext ctx) {
      Frac value = visit(ctx.expr());
      return value.minus();
   }

   @Override public Frac visitPowerExpr(FracParser.PowerExprContext ctx) {
      Frac exp = visit(ctx.expr(1));
      Frac base;

      exp.reduce();
      if(exp.denominador != 1){
         System.err.printf("Invalid exponent %d / %d\n", exp.numerador, exp.denominador);
         System.exit(1);
      }

      base = visit(ctx.expr(0));

      return base.power(exp);
   }

   @Override public Frac visitLiteralExpr(FracParser.LiteralExprContext ctx) {
      String[] numbers = ctx.LITERAL().getText().split("/");
      Integer n = Integer.parseInt(numbers[0]) ;
      Integer d;

      if(numbers.length == 1)
         return new Frac(n, 1);
      else
         d = Integer.parseInt(numbers[1]);
         return new Frac(n, d);

      // if (d == null){
      //    return new Frac(n, 1);
      // }

      // return new Frac(n, d);
   }

   @Override public Frac visitReduceExpr(FracParser.ReduceExprContext ctx) {
      Frac value = visit(ctx.expr());
      return value.reduce();
   }

   @Override public Frac visitMulDivExpr(FracParser.MulDivExprContext ctx) {
      Frac a = visit(ctx.expr(0));
      Frac b = visit(ctx.expr(1));
      if (ctx.op.getText().equals("*")){
         return a.mult(b);
      }
      else{
         return a.div(b);
      }
   }

   @Override public Frac visitSumSubExpr(FracParser.SumSubExprContext ctx) {
      Frac a = visit(ctx.expr(0));
      Frac b = visit(ctx.expr(1));
      if (ctx.op.getText().equals("+")){
         return a.sum(b);
      }
      else{
         return a.sub(b);
      }
   }
   

   @Override public Frac visitParenExpr(FracParser.ParenExprContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Frac visitIdExpr(FracParser.IdExprContext ctx) {
      String varName = ctx.ID().getText();
      Frac value = variables.get(varName);

      if (value == null){
         System.err.printf("Variable %s not declared\n", varName);
         System.exit(1);
      }
      return value;
   }
}
