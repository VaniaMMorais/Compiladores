grammar SuffixCalculator;

program: stat * EOF;

stat: expr? NEWLINE;

expr:  op=('*'|'/'|'+'|'-') expr expr   #ExprSuffix
    | NUMBER                            #ExprNumberw3
    ;

NUMBER: [0-9]+('.'[0-9]+)?;

NEWLINE: '\r'? '\n';

WS: [ \t]+ -> skip;