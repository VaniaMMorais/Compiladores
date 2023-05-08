grammar Frac;

program: (instruction? ';' )* EOF;

instruction: 'print'  
            | 'assing' 
            ;

print: 'print' expr;

assign: expr '->' ID ;

expr: op=('-'|'+') expr         # unaryExpr
    | 'reduce' expr             # reduceExpr
    | '(' expr ')'              # parenExpr
    | '(' expr ')' '^' expr     # powerExpr
    | expr op=('*'|':') expr    # mulDivExpr
    | expr op=('+'|'-') expr    # sumSubExpr
    | LITERAL                   # literalExpr
    | ID                        # idExpr
    ;

LITERAL: NUM ('/' NUM)?;

ID: [a-zA-Z]+;

NUM: [0-9]+;

WS: [ \t\n\r]+ -> skip;

COMMENT: '//' .*? '\n' -> skip;