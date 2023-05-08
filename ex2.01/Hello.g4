grammar Hello;

top: (r | bye)+;
r: 'hello' name;
bye: 'bye' name;
name: ID+;

ID: [a-zA-Z]+;
WS: [ \t\r\n]+ -> skip;
