grammar Demo;

program: programPart+ ;

programPart: statement ';'       #MainStatement
           | functionDefinition  #ProgPartFunctionDefinition
           ;

statement: println
		 | iteratorDeclaration
		 | ifElseDeclaration
         | varDeclaration
         | vectorDeclaration
         | assignment
         ;

expression: left=expression '/'  right=expression #Div
          | left=expression '*'  right=expression #Mult
          | left=expression '-'  right=expression #Minus
          | left=expression '+'  right=expression #Plus
          | left=expression '<=' right=expression #Bleq
		  | left=expression '<'  right=expression #Bl
		  | left=expression '>'  right=expression #Bg
		  | left=expression '>=' right=expression #Bgeq
		  | left=expression '==' right=expression #Beq
		  | left=expression '!=' right=expression #Bneq
          | number=NUMBER #Number
          | varName=IDENTIFIER '[' right=expression ']' #Vector
          | varName=IDENTIFIER #Variable
          | functionCall #funcCallExpression
          ;

					
iteratorDeclaration: 'while' '(' evaluation=expression ')' '{' statements=statementList ('return' returnValue=expression ';')? '}' #While;

ifElseDeclaration: 'if' '(' expr=expression ')' '{' 
						ifStats=statementList ('return' returnIfValue=expression ';')? '}' #If
					| 'if' '(' expr=expression ')' '{' 
						ifStats=statementList ('return' returnIfValue=expression ';')? '}' 
						'else' '{' 
						elseStats=statementList ('return' returnElseValue=expression ';')?'}' #IfElse;

varDeclaration: 'int' varName=IDENTIFIER #SimpleVarDeclaration;

vectorDeclaration: 'int' varName=IDENTIFIER '[' (expr=expression)* ']' #VectorVarDeclaration;

assignment: varName=IDENTIFIER '=' expr=expression #SimpleAssignment
			| varName=IDENTIFIER '[' left=expression ']' '=' right=expression #VectorAssignment;

println: 'println(' argument=expression ')' ;

functionDefinition: 'int' funcName=IDENTIFIER '(' params=parameterDeclaration ')' '{' statements=statementList 'return' returnValue=expression ';' '}' ;


parameterDeclaration: declarations+=param (',' declarations+=param)* #IntegerParamDeclaration
                    | #Empty
                    ;

param : varDeclaration #IntegerParam
        | vectorDeclaration  #VectorParam;

statementList: (statement ';')* ;

functionCall: funcName=IDENTIFIER '(' arguments=expressionList ')' ;

expressionList: expressions+=expression (',' expressions+=expression)*
              |
              ;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9]* ;
NUMBER: [0-9]+;
WHITESPACE: [ \t\n\r]+ -> skip;