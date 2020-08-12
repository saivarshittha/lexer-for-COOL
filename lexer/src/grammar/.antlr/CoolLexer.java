// Generated from /home/sai_varshittha/Compilers/CS3020_Prog_Assignment_1/lexer/src/grammar/CoolLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, STR_CONST=6, 
		LPAREN=7, RPAREN=8, COLON=9, ATSYM=10, SEMICOLON=11, COMMA=12, PLUS=13, 
		MINUS=14, STAR=15, SLASH=16, TILDE=17, LT=18, EQUALS=19, LBRACE=20, RBRACE=21, 
		DOT=22, DARROW=23, LE=24, ASSIGN=25, CLASS=26, ELSE=27, FI=28, IF=29, 
		IN=30, INHERITS=31, LET=32, LOOP=33, POOL=34, THEN=35, WHILE=36, CASE=37, 
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42, WHITESPACE=43, TERMINATED=44, 
		UN_TERMINATED=45, EOF_STRING=46, SINGLELINE_COMMENT=47, ERROR1=48, END_COMMENT=49, 
		UN_COMMENT=50, COMMENT=51, OTHER=52, ERROR2=53, ERR=54, OCOMMENT=55, CCOMMENT=56, 
		INCOMMENT_T=57, ERROR3=58, ERR3=59, OCOM=60, ERR4=61, CCOM=62, INCOM_TEXT=63;
	public static final int
		INCOMMENT=1, NESTEDCOM=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INCOMMENT", "NESTEDCOM"
	};

	public static final String[] ruleNames = {
		"SEMICOLON", "COLON", "DOT", "DARROW", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "LT", "EQUALS", "LE", "ATSYM", 
		"COMMA", "TILDE", "CLASS", "INHERITS", "NEW", "FI", "IF", "ELSE", "LET", 
		"IN", "THEN", "WHILE", "LOOP", "POOL", "CASE", "ESAC", "OF", "NOT", "ISVOID", 
		"TRUE", "FALSE", "BOOL_CONST", "WHITESPACE", "DIGIT", "LLETTER", "ULETTER", 
		"LETTER", "TYPEID", "OBJECTID", "INT_CONST", "STR_CONST", "TERMINATED", 
		"UN_TERMINATED", "EOF_STRING", "SINGLELINE_COMMENT", "ERROR1", "END_COMMENT", 
		"UN_COMMENT", "COMMENT", "OTHER", "ERROR2", "ERR", "OCOMMENT", "CCOMMENT", 
		"INCOMMENT_T", "ERROR3", "ERR3", "OCOM", "ERR4", "CCOM", "INCOM_TEXT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
		"';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", 
		"'}'", "'.'", "'=>'", "'<='", "'<-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
		"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "DARROW", 
		"LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", 
		"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "WHITESPACE", "TERMINATED", "UN_TERMINATED", "EOF_STRING", "SINGLELINE_COMMENT", 
		"ERROR1", "END_COMMENT", "UN_COMMENT", "COMMENT", "OTHER", "ERROR2", "ERR", 
		"OCOMMENT", "CCOMMENT", "INCOMMENT_T", "ERROR3", "ERR3", "OCOM", "ERR4", 
		"CCOM", "INCOM_TEXT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}



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


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 47:
			STR_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			ERROR1_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			END_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 54:
			UN_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 56:
			OTHER_action((RuleContext)_localctx, actionIndex);
			break;
		case 57:
			ERROR2_action((RuleContext)_localctx, actionIndex);
			break;
		case 58:
			ERR_action((RuleContext)_localctx, actionIndex);
			break;
		case 62:
			ERROR3_action((RuleContext)_localctx, actionIndex);
			break;
		case 63:
			ERR3_action((RuleContext)_localctx, actionIndex);
			break;
		case 65:
			ERR4_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STR_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			processString ();
			break;
		}
	}
	private void ERROR1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void END_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 reportError("Unmatched *)"); 
			break;
		}
	}
	private void UN_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 reportError("Unmatched *)"); 
			break;
		}
	}
	private void OTHER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			unknownToken();
			break;
		}
	}
	private void ERROR2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void ERR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void ERROR3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void ERR3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			 reportError("EOF in comment"); 
			break;
		}
	}
	private void ERR4_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			 reportError("EOF in comment"); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u01ce\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\5(\u0116\n(\3)\6)\u0119\n)\r)\16)\u011a\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\5-\u0127\n-\3.\3.\3.\3.\7.\u012d\n.\f.\16.\u0130\13.\3/"+
		"\3/\3/\3/\7/\u0136\n/\f/\16/\u0139\13/\3\60\6\60\u013c\n\60\r\60\16\60"+
		"\u013d\3\61\3\61\3\61\5\61\u0143\n\61\3\61\3\61\3\62\3\62\3\62\3\62\7"+
		"\62\u014b\n\62\f\62\16\62\u014e\13\62\3\62\3\62\3\63\3\63\3\63\3\63\7"+
		"\63\u0156\n\63\f\63\16\63\u0159\13\63\3\63\3\63\3\64\3\64\3\64\3\64\7"+
		"\64\u0161\n\64\f\64\16\64\u0164\13\64\3\64\5\64\u0167\n\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\7\65\u016f\n\65\f\65\16\65\u0172\13\65\3\65\3\65\3"+
		"\65\5\65\u0177\n\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3;\3;\3"+
		";\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3"+
		"?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3"+
		"D\3D\3D\3D\3D\3D\3E\3E\3E\3E\6\u014c\u0157\u0162\u0170\2F\5\r\7\13\t\30"+
		"\13\31\r\t\17\n\21\26\23\27\25\17\27\20\31\21\33\22\35\33\37\24!\25#\32"+
		"%\f\'\16)\23+\34-!/*\61\36\63\37\65\35\67\"9 ;%=&?#A$C\'E(G)I,K+M\2O\2"+
		"Q\6S-U\2W\2Y\2[\2]\4_\5a\7c\be.g/i\60k\61m\62o\63q\64s\65u\66w\67y8{9"+
		"}:\177;\u0081<\u0083=\u0085>\u0087?\u0089@\u008bA\5\2\3\4\30\4\2EEee\4"+
		"\2NNnn\4\2CCcc\4\2UUuu\4\2KKkk\4\2PPpp\4\2JJjj\4\2GGgg\4\2TTtt\4\2VVv"+
		"v\4\2YYyy\4\2HHhh\4\2QQqq\4\2RRrr\4\2XXxx\4\2FFff\4\2WWww\4\2\13\17\""+
		"\"\3\2\62;\3\2c|\3\2C\\\5\2\f\f$$^^\2\u01da\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\3w\3\2\2\2\3y\3\2\2\2\3{\3\2\2\2\3}\3\2\2\2\3\177\3\2\2\2"+
		"\4\u0081\3\2\2\2\4\u0083\3\2\2\2\4\u0085\3\2\2\2\4\u0087\3\2\2\2\4\u0089"+
		"\3\2\2\2\4\u008b\3\2\2\2\5\u008d\3\2\2\2\7\u008f\3\2\2\2\t\u0091\3\2\2"+
		"\2\13\u0093\3\2\2\2\r\u0096\3\2\2\2\17\u0098\3\2\2\2\21\u009a\3\2\2\2"+
		"\23\u009c\3\2\2\2\25\u009e\3\2\2\2\27\u00a0\3\2\2\2\31\u00a2\3\2\2\2\33"+
		"\u00a4\3\2\2\2\35\u00a6\3\2\2\2\37\u00a9\3\2\2\2!\u00ab\3\2\2\2#\u00ad"+
		"\3\2\2\2%\u00b0\3\2\2\2\'\u00b2\3\2\2\2)\u00b4\3\2\2\2+\u00b6\3\2\2\2"+
		"-\u00bc\3\2\2\2/\u00c5\3\2\2\2\61\u00c9\3\2\2\2\63\u00cc\3\2\2\2\65\u00cf"+
		"\3\2\2\2\67\u00d4\3\2\2\29\u00d8\3\2\2\2;\u00db\3\2\2\2=\u00e0\3\2\2\2"+
		"?\u00e6\3\2\2\2A\u00eb\3\2\2\2C\u00f0\3\2\2\2E\u00f5\3\2\2\2G\u00fa\3"+
		"\2\2\2I\u00fd\3\2\2\2K\u0101\3\2\2\2M\u0108\3\2\2\2O\u010d\3\2\2\2Q\u0115"+
		"\3\2\2\2S\u0118\3\2\2\2U\u011e\3\2\2\2W\u0120\3\2\2\2Y\u0122\3\2\2\2["+
		"\u0126\3\2\2\2]\u0128\3\2\2\2_\u0131\3\2\2\2a\u013b\3\2\2\2c\u0142\3\2"+
		"\2\2e\u0146\3\2\2\2g\u0151\3\2\2\2i\u015c\3\2\2\2k\u016a\3\2\2\2m\u017a"+
		"\3\2\2\2o\u0180\3\2\2\2q\u0186\3\2\2\2s\u018b\3\2\2\2u\u0191\3\2\2\2w"+
		"\u0194\3\2\2\2y\u019a\3\2\2\2{\u019e\3\2\2\2}\u01a4\3\2\2\2\177\u01aa"+
		"\3\2\2\2\u0081\u01ae\3\2\2\2\u0083\u01b4\3\2\2\2\u0085\u01b8\3\2\2\2\u0087"+
		"\u01be\3\2\2\2\u0089\u01c4\3\2\2\2\u008b\u01ca\3\2\2\2\u008d\u008e\7="+
		"\2\2\u008e\6\3\2\2\2\u008f\u0090\7<\2\2\u0090\b\3\2\2\2\u0091\u0092\7"+
		"\60\2\2\u0092\n\3\2\2\2\u0093\u0094\7?\2\2\u0094\u0095\7@\2\2\u0095\f"+
		"\3\2\2\2\u0096\u0097\7*\2\2\u0097\16\3\2\2\2\u0098\u0099\7+\2\2\u0099"+
		"\20\3\2\2\2\u009a\u009b\7}\2\2\u009b\22\3\2\2\2\u009c\u009d\7\177\2\2"+
		"\u009d\24\3\2\2\2\u009e\u009f\7-\2\2\u009f\26\3\2\2\2\u00a0\u00a1\7/\2"+
		"\2\u00a1\30\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3\32\3\2\2\2\u00a4\u00a5\7"+
		"\61\2\2\u00a5\34\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8\7/\2\2\u00a8\36"+
		"\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa \3\2\2\2\u00ab\u00ac\7?\2\2\u00ac\""+
		"\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\u00af\7?\2\2\u00af$\3\2\2\2\u00b0\u00b1"+
		"\7B\2\2\u00b1&\3\2\2\2\u00b2\u00b3\7.\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7"+
		"\u0080\2\2\u00b5*\3\2\2\2\u00b6\u00b7\t\2\2\2\u00b7\u00b8\t\3\2\2\u00b8"+
		"\u00b9\t\4\2\2\u00b9\u00ba\t\5\2\2\u00ba\u00bb\t\5\2\2\u00bb,\3\2\2\2"+
		"\u00bc\u00bd\t\6\2\2\u00bd\u00be\t\7\2\2\u00be\u00bf\t\b\2\2\u00bf\u00c0"+
		"\t\t\2\2\u00c0\u00c1\t\n\2\2\u00c1\u00c2\t\6\2\2\u00c2\u00c3\t\13\2\2"+
		"\u00c3\u00c4\t\5\2\2\u00c4.\3\2\2\2\u00c5\u00c6\t\7\2\2\u00c6\u00c7\t"+
		"\t\2\2\u00c7\u00c8\t\f\2\2\u00c8\60\3\2\2\2\u00c9\u00ca\t\r\2\2\u00ca"+
		"\u00cb\t\6\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\t\6\2\2\u00cd\u00ce\t\r\2"+
		"\2\u00ce\64\3\2\2\2\u00cf\u00d0\t\t\2\2\u00d0\u00d1\t\3\2\2\u00d1\u00d2"+
		"\t\5\2\2\u00d2\u00d3\t\t\2\2\u00d3\66\3\2\2\2\u00d4\u00d5\t\3\2\2\u00d5"+
		"\u00d6\t\t\2\2\u00d6\u00d7\t\13\2\2\u00d78\3\2\2\2\u00d8\u00d9\t\6\2\2"+
		"\u00d9\u00da\t\7\2\2\u00da:\3\2\2\2\u00db\u00dc\t\13\2\2\u00dc\u00dd\t"+
		"\b\2\2\u00dd\u00de\t\t\2\2\u00de\u00df\t\7\2\2\u00df<\3\2\2\2\u00e0\u00e1"+
		"\t\f\2\2\u00e1\u00e2\t\b\2\2\u00e2\u00e3\t\6\2\2\u00e3\u00e4\t\3\2\2\u00e4"+
		"\u00e5\t\t\2\2\u00e5>\3\2\2\2\u00e6\u00e7\t\3\2\2\u00e7\u00e8\t\16\2\2"+
		"\u00e8\u00e9\t\16\2\2\u00e9\u00ea\t\17\2\2\u00ea@\3\2\2\2\u00eb\u00ec"+
		"\t\17\2\2\u00ec\u00ed\t\16\2\2\u00ed\u00ee\t\16\2\2\u00ee\u00ef\t\3\2"+
		"\2\u00efB\3\2\2\2\u00f0\u00f1\t\2\2\2\u00f1\u00f2\t\4\2\2\u00f2\u00f3"+
		"\t\5\2\2\u00f3\u00f4\t\t\2\2\u00f4D\3\2\2\2\u00f5\u00f6\t\t\2\2\u00f6"+
		"\u00f7\t\5\2\2\u00f7\u00f8\t\4\2\2\u00f8\u00f9\t\2\2\2\u00f9F\3\2\2\2"+
		"\u00fa\u00fb\t\16\2\2\u00fb\u00fc\t\r\2\2\u00fcH\3\2\2\2\u00fd\u00fe\t"+
		"\7\2\2\u00fe\u00ff\t\16\2\2\u00ff\u0100\t\13\2\2\u0100J\3\2\2\2\u0101"+
		"\u0102\t\6\2\2\u0102\u0103\t\5\2\2\u0103\u0104\t\20\2\2\u0104\u0105\t"+
		"\16\2\2\u0105\u0106\t\6\2\2\u0106\u0107\t\21\2\2\u0107L\3\2\2\2\u0108"+
		"\u0109\7v\2\2\u0109\u010a\t\n\2\2\u010a\u010b\t\22\2\2\u010b\u010c\t\t"+
		"\2\2\u010cN\3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f\t\4\2\2\u010f\u0110"+
		"\t\3\2\2\u0110\u0111\t\5\2\2\u0111\u0112\t\t\2\2\u0112P\3\2\2\2\u0113"+
		"\u0116\5M&\2\u0114\u0116\5O\'\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2"+
		"\2\u0116R\3\2\2\2\u0117\u0119\t\23\2\2\u0118\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\b)\2\2\u011dT\3\2\2\2\u011e\u011f\t\24\2\2\u011fV\3\2\2\2\u0120"+
		"\u0121\t\25\2\2\u0121X\3\2\2\2\u0122\u0123\t\26\2\2\u0123Z\3\2\2\2\u0124"+
		"\u0127\5W+\2\u0125\u0127\5Y,\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2"+
		"\u0127\\\3\2\2\2\u0128\u012e\5Y,\2\u0129\u012d\5[-\2\u012a\u012d\5U*\2"+
		"\u012b\u012d\7a\2\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"^\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0137\5W+\2\u0132\u0136\5[-\2\u0133"+
		"\u0136\5U*\2\u0134\u0136\7a\2\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2"+
		"\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138`\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\5U*\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"b\3\2\2\2\u013f\u0143\5e\62\2\u0140\u0143\5g\63\2\u0141\u0143\5i\64\2"+
		"\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0145\b\61\3\2\u0145d\3\2\2\2\u0146\u014c\7$\2\2\u0147"+
		"\u0148\7^\2\2\u0148\u014b\13\2\2\2\u0149\u014b\n\27\2\2\u014a\u0147\3"+
		"\2\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014d\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7$"+
		"\2\2\u0150f\3\2\2\2\u0151\u0157\7$\2\2\u0152\u0153\7^\2\2\u0153\u0156"+
		"\13\2\2\2\u0154\u0156\n\27\2\2\u0155\u0152\3\2\2\2\u0155\u0154\3\2\2\2"+
		"\u0156\u0159\3\2\2\2\u0157\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015a"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7\f\2\2\u015bh\3\2\2\2\u015c"+
		"\u0162\7$\2\2\u015d\u015e\7^\2\2\u015e\u0161\13\2\2\2\u015f\u0161\n\27"+
		"\2\2\u0160\u015d\3\2\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0165\u0167\7^\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0169\7\2\2\3\u0169j\3\2\2\2\u016a\u016b\7/\2\2\u016b"+
		"\u016c\7/\2\2\u016c\u0170\3\2\2\2\u016d\u016f\13\2\2\2\u016e\u016d\3\2"+
		"\2\2\u016f\u0172\3\2\2\2\u0170\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0176\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0177\7\f\2\2\u0174\u0175\13"+
		"\2\2\2\u0175\u0177\7\2\2\3\u0176\u0173\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0179\b\65\2\2\u0179l\3\2\2\2\u017a\u017b\7*\2\2"+
		"\u017b\u017c\7,\2\2\u017c\u017d\3\2\2\2\u017d\u017e\7\2\2\3\u017e\u017f"+
		"\b\66\4\2\u017fn\3\2\2\2\u0180\u0181\7,\2\2\u0181\u0182\7+\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0184\7\2\2\3\u0184\u0185\b\67\5\2\u0185p\3\2\2\2\u0186"+
		"\u0187\7,\2\2\u0187\u0188\7+\2\2\u0188\u0189\3\2\2\2\u0189\u018a\b8\6"+
		"\2\u018ar\3\2\2\2\u018b\u018c\7*\2\2\u018c\u018d\7,\2\2\u018d\u018e\3"+
		"\2\2\2\u018e\u018f\b9\7\2\u018f\u0190\b9\2\2\u0190t\3\2\2\2\u0191\u0192"+
		"\13\2\2\2\u0192\u0193\b:\b\2\u0193v\3\2\2\2\u0194\u0195\7*\2\2\u0195\u0196"+
		"\7,\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7\2\2\3\u0198\u0199\b;\t\2\u0199"+
		"x\3\2\2\2\u019a\u019b\13\2\2\2\u019b\u019c\7\2\2\3\u019c\u019d\b<\n\2"+
		"\u019dz\3\2\2\2\u019e\u019f\7*\2\2\u019f\u01a0\7,\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a2\b=\13\2\u01a2\u01a3\b=\2\2\u01a3|\3\2\2\2\u01a4\u01a5"+
		"\7,\2\2\u01a5\u01a6\7+\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\b>\f\2\u01a8"+
		"\u01a9\b>\2\2\u01a9~\3\2\2\2\u01aa\u01ab\13\2\2\2\u01ab\u01ac\3\2\2\2"+
		"\u01ac\u01ad\b?\2\2\u01ad\u0080\3\2\2\2\u01ae\u01af\7*\2\2\u01af\u01b0"+
		"\7,\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\7\2\2\3\u01b2\u01b3\b@\r\2\u01b3"+
		"\u0082\3\2\2\2\u01b4\u01b5\13\2\2\2\u01b5\u01b6\7\2\2\3\u01b6\u01b7\b"+
		"A\16\2\u01b7\u0084\3\2\2\2\u01b8\u01b9\7*\2\2\u01b9\u01ba\7,\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bc\bB\13\2\u01bc\u01bd\bB\2\2\u01bd\u0086\3\2"+
		"\2\2\u01be\u01bf\7,\2\2\u01bf\u01c0\7+\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2"+
		"\7\2\2\3\u01c2\u01c3\bC\17\2\u01c3\u0088\3\2\2\2\u01c4\u01c5\7,\2\2\u01c5"+
		"\u01c6\7+\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\bD\f\2\u01c8\u01c9\bD\2"+
		"\2\u01c9\u008a\3\2\2\2\u01ca\u01cb\13\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01cd\bE\2\2\u01cd\u008c\3\2\2\2\30\2\3\4\u0115\u0118\u011a\u0126\u012c"+
		"\u012e\u0135\u0137\u013d\u0142\u014a\u014c\u0155\u0157\u0160\u0162\u0166"+
		"\u0170\u0176\20\b\2\2\3\61\2\3\66\3\3\67\4\38\5\7\3\2\3:\6\3;\7\3<\b\7"+
		"\4\2\6\2\2\3@\t\3A\n\3C\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}