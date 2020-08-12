lexer grammar CoolLexer;

tokens{
	ERROR,
	TYPEID,
	OBJECTID,
	BOOL_CONST,
	INT_CONST,
	STR_CONST,
	LPAREN,
	RPAREN,
	COLON,
	ATSYM,
	SEMICOLON,
	COMMA,
	PLUS,
	MINUS,
	STAR,
	SLASH,
	TILDE,
	LT,
	EQUALS,
	LBRACE,
	RBRACE,
	DOT,
	DARROW,
	LE,
	ASSIGN,
	CLASS,
	ELSE,
	FI,
	IF,
	IN,
	INHERITS,
	LET,
	LOOP,
	POOL,
	THEN,
	WHILE,
	CASE,
	ESAC,
	OF,
	NEW,
	ISVOID,
	NOT
}

/*
  DO NOT EDIT CODE ABOVE THIS LINE
*/

@members{

	/*
		YOU CAN ADD YOUR MEMBER VARIABLES AND METHODS HERE
	*/

	/**
	* Function to report errors.
	* Use this function whenever your lexer encounters any erroneous input
	* DO NOT EDIT THIS FUNCTION
	*/
	public void reportError(String errorString){
		setText(errorString);
		setType(ERROR);
	}
	public void unknownToken() {
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();
		reportError(text);
	}

	public void processString() {
		
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();
			//write your code to test strings here
            text = text.substring(1, text.length()); //considering the substring except the fiest double quote.
			int text_len = text.length();
            String nString  = "";
			int itr = 0, str_len = 0;
			boolean terminated = false, backslash = false, Unterminated = false;
			if(text.charAt(text_len-1) == '\n')
				Unterminated = true;
			else if(text.charAt(text_len-1) == '\\')
				backslash = true;
			else if(text.charAt(text_len-1) == '\"')
				terminated = true;
			while(itr < text.length()-1)
			{	
				
			    if(text.charAt(itr) == '\n') 
                {
					reportError("Unterminated string constant");
					return;
				}
				else if(text.charAt(itr)=='\u0000')
				{
					reportError("String contains null character.");
					return;
				}
				else if(text.charAt(itr) == '\\' && itr < text.length() - 1)
				{
					
                    char nextChar = text.charAt(itr + 1);
                     switch(nextChar) {
					case 'n':
						nString = nString.concat("\n");
						break;
					case '\"':
						if(itr == text_len-2){
							terminated = false;
							break;
						}
						nString = nString.concat("\"");
						break;
					case 'b':
						nString = nString.concat("\b");
						break;
					case 'f':
						nString = nString.concat("\f");
						break;
					case  '\\':
						if(itr == text_len-2){
							backslash = false;
							break;
						}
						nString = nString.concat("\\");
						break;
					case 't':
						nString = nString.concat("\t");
						break;
					case '\n':
						if(itr == text_len-2){
							Unterminated = false;
							break;
						}
						nString = nString.concat("\n");
						break;
					case '\u0000':
						reportError("String contains escaped null character.");
						return;
					default :
						nString = nString.concat(String.valueOf(text.charAt(itr +1)));
						break;
 					}
					itr += 2;
					str_len += 1;
					if(str_len > 1024){
						reportError("String constant too long");
						return;
					}
					continue;
				}
				else
				{
					 nString = nString.concat(String.valueOf(text.charAt(itr)));
				}

				itr += 1;
				str_len += 1;
				if(str_len > 1024){
					reportError("String constant too long");
					return;
				}
			}
			if(backslash){
				reportError("backslash at end of file");
				return;
			}
			if(Unterminated){
				reportError("Unterminated string constant");
				return;
			}
			if(!Unterminated && !backslash && !terminated){
				reportError("EOF in string constant");
				return;
			}
		
		setText(nString);
		return;
	}
}

/*
	WRITE ALL LEXER RULES BELOW
*/
/***** Operators and Symbols *****/
SEMICOLON  	: ';';
COLON		: ':' ;
DOT			: '.' ;
DARROW      : '=>';
LPAREN		: '(' ;
RPAREN		: ')' ;
LBRACE		: '{' ;
RBRACE		: '}' ;
PLUS		: '+' ;
MINUS		: '-' ;
STAR		: '*' ;
SLASH		: '/' ;
ASSIGN		: '<-' ;
LT		    : '<' ;
EQUALS		: '=' ;
LE  		: '<=' ;
ATSYM		: '@' ;
COMMA		: ',' ;
TILDE		: '~' ;

/*****              Keywords                      *****/



CLASS	    : ('c'|'C')('l'|'L')('a'|'A')('s'|'S')('s'|'S') ;
INHERITS	: ('i'|'I')('n'|'N')('h'|'H')('e'|'E')('r'|'R')('i'|'I')('t'|'T')('s'|'S');
NEW		    : ('n' | 'N') ('e' | 'E') ('w' | 'W');
FI	        : ('f'|'F')('i'|'I');
IF	        : ('i'|'I')('f'|'F');
ELSE		: ('e'|'E')('l'|'L')('s'|'S')('e'|'E');
LET		    : ('l'|'L')('e'|'E')('t'|'T');
IN 		    : ('i'|'I')('n'|'N');
THEN		: ('t'|'T')('h'|'H')('e'|'E')('n'|'N');
WHILE		: ('w'|'W')('h'|'H')('i'|'I')('l'|'L')('e'|'E');
LOOP		: ('l'|'L')('o'|'O')('o'|'O')('p'|'P');
POOL		: ('p'|'P')('o'|'O')('o'|'O')('l'|'L');
CASE		: ('c'|'C')('a'|'A')('s'|'S')('e'|'E');
ESAC		: ('e'|'E')('s'|'S')('a'|'A')('c'|'C');
OF		    : ('o'|'O')('f'|'F');
NOT		    : ('n'|'N')('o'|'O')('t'|'T');
ISVOID		: ('i'|'I')('s'|'S')('v'|'V')('o'|'O')('i'|'I')('d'|'D');
fragment TRUE		: 't'('r'|'R')('u'|'U')('e'|'E'); // First letter should be lowercase
fragment FALSE		: 'f'('a'|'A')('l'|'L')('s'|'S')('e'|'E');
BOOL_CONST			: (TRUE|FALSE);

/*****     For skipping white spaces     *****/

 WHITESPACE:(('\n')|('\t')|('\r')|('\f')|(' ')|('\u000B'))+ -> skip;



fragment DIGIT :[0-9];
fragment LLETTER:[a-z];
fragment ULETTER:[A-Z];
fragment LETTER:(LLETTER|ULETTER);
TYPEID		: ULETTER(LETTER|DIGIT|'_')* ;
OBJECTID	: LLETTER(LETTER|DIGIT|'_')*;
INT_CONST	: DIGIT+ ;


STR_CONST:(TERMINATED|UN_TERMINATED|EOF_STRING)	 {processString ();};
TERMINATED: '"' ('\\' (.) | ~('\n' | '\\' | '"'))*? '"';
UN_TERMINATED: '"' ('\\' (.) | ~('\n' | '\\' | '"'))*? '\n';
EOF_STRING: '"' ('\\' (.) | ~('\n' | '\\' | '"'))*? ('\\')? (EOF);





/*****     Working with comments in the code      ******/

/* For line comments via '--'*/

SINGLELINE_COMMENT	: '--' .*? ('\n'|.(EOF))-> skip ;

/* For comments via '(*..*)' */

ERROR1       :'(*'(EOF) { reportError("EOF in comment"); } ;
END_COMMENT	: '*)' EOF { reportError("Unmatched *)"); } ;
UN_COMMENT 	: '*)' { reportError("Unmatched *)"); } ;
COMMENT		: '(*'-> pushMode(INCOMMENT), skip;

OTHER : .{unknownToken();};


mode INCOMMENT;
ERROR2       :'(*'(EOF) { reportError("EOF in comment"); } ;
ERR     	: .(EOF) { reportError("EOF in comment"); } ;
OCOMMENT	: '(*' -> pushMode(NESTEDCOM), skip ;
CCOMMENT	: '*)' -> popMode, skip ;
INCOMMENT_T : . -> skip ;


mode NESTEDCOM;
ERROR3      :'(*'(EOF) { reportError("EOF in comment"); } ;
ERR3		: .(EOF) { reportError("EOF in comment"); } ;
OCOM		: '(*' -> pushMode(NESTEDCOM), skip ;
ERR4		: '*)' EOF { reportError("EOF in comment"); } ; 
CCOM		: '*)' -> popMode, skip ;
INCOM_TEXT	: . -> skip ;