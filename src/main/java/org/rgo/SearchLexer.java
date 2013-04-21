// Generated from Search.g4 by ANTLR 4.0
package org.rgo;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SearchLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, VMS=3, HOSTS=4, USERS=5, KEY=6, VAL=7, INT=8, WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"':'", "'='", "'Vms'", "'Hosts'", "'Users'", "KEY", "VAL", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "VMS", "HOSTS", "USERS", "KEY", "VAL", "INT", "WS"
	};


	public SearchLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Search.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 8: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\13D\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\62\n\7\3"+
		"\b\6\b\65\n\b\r\b\16\b\66\3\t\6\t:\n\t\r\t\16\t;\3\n\6\n?\n\n\r\n\16\n"+
		"@\3\n\3\n\2\13\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\2\3\2\5\5\62;C\\c|\3\62;\5\13\f\17\17\"\"G\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2\7\31\3\2\2\2\t\35\3\2\2\2"+
		"\13#\3\2\2\2\r\61\3\2\2\2\17\64\3\2\2\2\219\3\2\2\2\23>\3\2\2\2\25\26"+
		"\7<\2\2\26\4\3\2\2\2\27\30\7?\2\2\30\6\3\2\2\2\31\32\7X\2\2\32\33\7o\2"+
		"\2\33\34\7u\2\2\34\b\3\2\2\2\35\36\7J\2\2\36\37\7q\2\2\37 \7u\2\2 !\7"+
		"v\2\2!\"\7u\2\2\"\n\3\2\2\2#$\7W\2\2$%\7u\2\2%&\7g\2\2&\'\7t\2\2\'(\7"+
		"u\2\2(\f\3\2\2\2)*\7p\2\2*+\7c\2\2+,\7o\2\2,\62\7g\2\2-.\7u\2\2./\7k\2"+
		"\2/\60\7|\2\2\60\62\7g\2\2\61)\3\2\2\2\61-\3\2\2\2\62\16\3\2\2\2\63\65"+
		"\t\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\20"+
		"\3\2\2\28:\t\3\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\22\3\2\2\2"+
		"=?\t\4\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\b\n\2\2"+
		"C\24\3\2\2\2\7\2\61\66;@";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}