// Generated from Demo.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__24=1, T__23=2, T__22=3, T__21=4, T__20=5, T__19=6, T__18=7, T__17=8, 
		T__16=9, T__15=10, T__14=11, T__13=12, T__12=13, T__11=14, T__10=15, T__9=16, 
		T__8=17, T__7=18, T__6=19, T__5=20, T__4=21, T__3=22, T__2=23, T__1=24, 
		T__0=25, IDENTIFIER=26, NUMBER=27, WHITESPACE=28;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'println('", "'return'", "'!='", "'{'", "'while'", 
		"';'", "'='", "'}'", "'if'", "'<='", "'int'", "'('", "'*'", "','", "'['", 
		"'>='", "'=='", "'<'", "']'", "'>'", "'else'", "')'", "'+'", "'-'", "IDENTIFIER", 
		"NUMBER", "WHITESPACE"
	};
	public static final int
		RULE_program = 0, RULE_programPart = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_iteratorDeclaration = 4, RULE_ifElseDeclaration = 5, RULE_varDeclaration = 6, 
		RULE_vectorDeclaration = 7, RULE_assignment = 8, RULE_println = 9, RULE_functionDefinition = 10, 
		RULE_parameterDeclaration = 11, RULE_param = 12, RULE_statementList = 13, 
		RULE_functionCall = 14, RULE_expressionList = 15;
	public static final String[] ruleNames = {
		"program", "programPart", "statement", "expression", "iteratorDeclaration", 
		"ifElseDeclaration", "varDeclaration", "vectorDeclaration", "assignment", 
		"println", "functionDefinition", "parameterDeclaration", "param", "statementList", 
		"functionCall", "expressionList"
	};

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DemoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramPartContext programPart(int i) {
			return getRuleContext(ProgramPartContext.class,i);
		}
		public List<ProgramPartContext> programPart() {
			return getRuleContexts(ProgramPartContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32); programPart();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__19) | (1L << T__15) | (1L << T__13) | (1L << IDENTIFIER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramPartContext extends ParserRuleContext {
		public ProgramPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programPart; }
	 
		public ProgramPartContext() { }
		public void copyFrom(ProgramPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainStatementContext extends ProgramPartContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainStatementContext(ProgramPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterMainStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitMainStatement(this);
		}
	}
	public static class ProgPartFunctionDefinitionContext extends ProgramPartContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ProgPartFunctionDefinitionContext(ProgramPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterProgPartFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitProgPartFunctionDefinition(this);
		}
	}

	public final ProgramPartContext programPart() throws RecognitionException {
		ProgramPartContext _localctx = new ProgramPartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programPart);
		try {
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new MainStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37); statement();
				setState(38); match(T__18);
				}
				break;
			case 2:
				_localctx = new ProgPartFunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40); functionDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IteratorDeclarationContext iteratorDeclaration() {
			return getRuleContext(IteratorDeclarationContext.class,0);
		}
		public VectorDeclarationContext vectorDeclaration() {
			return getRuleContext(VectorDeclarationContext.class,0);
		}
		public IfElseDeclarationContext ifElseDeclaration() {
			return getRuleContext(IfElseDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); println();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); iteratorDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45); ifElseDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46); varDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47); vectorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48); assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitVariable(this);
		}
	}
	public static class BgContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BgContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBg(this);
		}
	}
	public static class BneqContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BneqContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBneq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBneq(this);
		}
	}
	public static class BleqContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BleqContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBleq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBleq(this);
		}
	}
	public static class BlContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBl(this);
		}
	}
	public static class BgeqContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BgeqContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBgeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBgeq(this);
		}
	}
	public static class FuncCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterFuncCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitFuncCallExpression(this);
		}
	}
	public static class BeqContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BeqContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBeq(this);
		}
	}
	public static class DivContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitDiv(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public Token number;
		public TerminalNode NUMBER() { return getToken(DemoParser.NUMBER, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitNumber(this);
		}
	}
	public static class MultContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MultContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitMult(this);
		}
	}
	public static class PlusContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitPlus(this);
		}
	}
	public static class VectorContext extends ExpressionContext {
		public Token varName;
		public ExpressionContext right;
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VectorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitVector(this);
		}
	}
	public static class MinusContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitMinus(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(52); ((NumberContext)_localctx).number = match(NUMBER);
				}
				break;
			case 2:
				{
				_localctx = new VectorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53); ((VectorContext)_localctx).varName = match(IDENTIFIER);
				setState(54); match(T__9);
				setState(55); ((VectorContext)_localctx).right = expression(0);
				setState(56); match(T__5);
				}
				break;
			case 3:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58); ((VariableContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 4:
				{
				_localctx = new FuncCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59); functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(92);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new DivContext(new ExpressionContext(_parentctx, _parentState));
						((DivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(63); match(T__24);
						setState(64); ((DivContext)_localctx).right = expression(15);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState));
						((MultContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(66); match(T__11);
						setState(67); ((MultContext)_localctx).right = expression(14);
						}
						break;
					case 3:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						((MinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(69); match(T__0);
						setState(70); ((MinusContext)_localctx).right = expression(13);
						}
						break;
					case 4:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						((PlusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(72); match(T__1);
						setState(73); ((PlusContext)_localctx).right = expression(12);
						}
						break;
					case 5:
						{
						_localctx = new BleqContext(new ExpressionContext(_parentctx, _parentState));
						((BleqContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(75); match(T__14);
						setState(76); ((BleqContext)_localctx).right = expression(11);
						}
						break;
					case 6:
						{
						_localctx = new BlContext(new ExpressionContext(_parentctx, _parentState));
						((BlContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(78); match(T__6);
						setState(79); ((BlContext)_localctx).right = expression(10);
						}
						break;
					case 7:
						{
						_localctx = new BgContext(new ExpressionContext(_parentctx, _parentState));
						((BgContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(81); match(T__4);
						setState(82); ((BgContext)_localctx).right = expression(9);
						}
						break;
					case 8:
						{
						_localctx = new BgeqContext(new ExpressionContext(_parentctx, _parentState));
						((BgeqContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(84); match(T__8);
						setState(85); ((BgeqContext)_localctx).right = expression(8);
						}
						break;
					case 9:
						{
						_localctx = new BeqContext(new ExpressionContext(_parentctx, _parentState));
						((BeqContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(86);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(87); match(T__7);
						setState(88); ((BeqContext)_localctx).right = expression(7);
						}
						break;
					case 10:
						{
						_localctx = new BneqContext(new ExpressionContext(_parentctx, _parentState));
						((BneqContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(90); match(T__21);
						setState(91); ((BneqContext)_localctx).right = expression(6);
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IteratorDeclarationContext extends ParserRuleContext {
		public IteratorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratorDeclaration; }
	 
		public IteratorDeclarationContext() { }
		public void copyFrom(IteratorDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileContext extends IteratorDeclarationContext {
		public ExpressionContext evaluation;
		public StatementListContext statements;
		public ExpressionContext returnValue;
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public WhileContext(IteratorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitWhile(this);
		}
	}

	public final IteratorDeclarationContext iteratorDeclaration() throws RecognitionException {
		IteratorDeclarationContext _localctx = new IteratorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_iteratorDeclaration);
		int _la;
		try {
			_localctx = new WhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(T__19);
			setState(98); match(T__12);
			setState(99); ((WhileContext)_localctx).evaluation = expression(0);
			setState(100); match(T__2);
			setState(101); match(T__20);
			setState(102); ((WhileContext)_localctx).statements = statementList();
			setState(107);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(103); match(T__22);
				setState(104); ((WhileContext)_localctx).returnValue = expression(0);
				setState(105); match(T__18);
				}
			}

			setState(109); match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseDeclarationContext extends ParserRuleContext {
		public IfElseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseDeclaration; }
	 
		public IfElseDeclarationContext() { }
		public void copyFrom(IfElseDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfElseContext extends IfElseDeclarationContext {
		public ExpressionContext expr;
		public StatementListContext ifStats;
		public ExpressionContext returnIfValue;
		public StatementListContext elseStats;
		public ExpressionContext returnElseValue;
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IfElseContext(IfElseDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitIfElse(this);
		}
	}
	public static class IfContext extends IfElseDeclarationContext {
		public ExpressionContext expr;
		public StatementListContext ifStats;
		public ExpressionContext returnIfValue;
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IfContext(IfElseDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitIf(this);
		}
	}

	public final IfElseDeclarationContext ifElseDeclaration() throws RecognitionException {
		IfElseDeclarationContext _localctx = new IfElseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifElseDeclaration);
		int _la;
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111); match(T__15);
				setState(112); match(T__12);
				setState(113); ((IfContext)_localctx).expr = expression(0);
				setState(114); match(T__2);
				setState(115); match(T__20);
				setState(116); ((IfContext)_localctx).ifStats = statementList();
				setState(121);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(117); match(T__22);
					setState(118); ((IfContext)_localctx).returnIfValue = expression(0);
					setState(119); match(T__18);
					}
				}

				setState(123); match(T__16);
				}
				break;
			case 2:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125); match(T__15);
				setState(126); match(T__12);
				setState(127); ((IfElseContext)_localctx).expr = expression(0);
				setState(128); match(T__2);
				setState(129); match(T__20);
				setState(130); ((IfElseContext)_localctx).ifStats = statementList();
				setState(135);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(131); match(T__22);
					setState(132); ((IfElseContext)_localctx).returnIfValue = expression(0);
					setState(133); match(T__18);
					}
				}

				setState(137); match(T__16);
				setState(138); match(T__3);
				setState(139); match(T__20);
				setState(140); ((IfElseContext)_localctx).elseStats = statementList();
				setState(145);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(141); match(T__22);
					setState(142); ((IfElseContext)_localctx).returnElseValue = expression(0);
					setState(143); match(T__18);
					}
				}

				setState(147); match(T__16);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleVarDeclarationContext extends VarDeclarationContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public SimpleVarDeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterSimpleVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitSimpleVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDeclaration);
		try {
			_localctx = new SimpleVarDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(T__13);
			setState(152); ((SimpleVarDeclarationContext)_localctx).varName = match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorDeclarationContext extends ParserRuleContext {
		public VectorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorDeclaration; }
	 
		public VectorDeclarationContext() { }
		public void copyFrom(VectorDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VectorVarDeclarationContext extends VectorDeclarationContext {
		public Token varName;
		public ExpressionContext expr;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public VectorVarDeclarationContext(VectorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterVectorVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitVectorVarDeclaration(this);
		}
	}

	public final VectorDeclarationContext vectorDeclaration() throws RecognitionException {
		VectorDeclarationContext _localctx = new VectorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vectorDeclaration);
		int _la;
		try {
			_localctx = new VectorVarDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(T__13);
			setState(155); ((VectorVarDeclarationContext)_localctx).varName = match(IDENTIFIER);
			setState(156); match(T__9);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER || _la==NUMBER) {
				{
				{
				setState(157); ((VectorVarDeclarationContext)_localctx).expr = expression(0);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163); match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VectorAssignmentContext extends AssignmentContext {
		public Token varName;
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public VectorAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterVectorAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitVectorAssignment(this);
		}
	}
	public static class SimpleAssignmentContext extends AssignmentContext {
		public Token varName;
		public ExpressionContext expr;
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterSimpleAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitSimpleAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new SimpleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165); ((SimpleAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(166); match(T__17);
				setState(167); ((SimpleAssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				_localctx = new VectorAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168); ((VectorAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(169); match(T__9);
				setState(170); ((VectorAssignmentContext)_localctx).left = expression(0);
				setState(171); match(T__5);
				setState(172); match(T__17);
				setState(173); ((VectorAssignmentContext)_localctx).right = expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintlnContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitPrintln(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(T__23);
			setState(178); ((PrintlnContext)_localctx).argument = expression(0);
			setState(179); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public Token funcName;
		public ParameterDeclarationContext params;
		public StatementListContext statements;
		public ExpressionContext returnValue;
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(T__13);
			setState(182); ((FunctionDefinitionContext)_localctx).funcName = match(IDENTIFIER);
			setState(183); match(T__12);
			setState(184); ((FunctionDefinitionContext)_localctx).params = parameterDeclaration();
			setState(185); match(T__2);
			setState(186); match(T__20);
			setState(187); ((FunctionDefinitionContext)_localctx).statements = statementList();
			setState(188); match(T__22);
			setState(189); ((FunctionDefinitionContext)_localctx).returnValue = expression(0);
			setState(190); match(T__18);
			setState(191); match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	 
		public ParameterDeclarationContext() { }
		public void copyFrom(ParameterDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerParamDeclarationContext extends ParameterDeclarationContext {
		public ParamContext param;
		public List<ParamContext> declarations = new ArrayList<ParamContext>();
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public IntegerParamDeclarationContext(ParameterDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterIntegerParamDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitIntegerParamDeclaration(this);
		}
	}
	public static class EmptyContext extends ParameterDeclarationContext {
		public EmptyContext(ParameterDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitEmpty(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameterDeclaration);
		int _la;
		try {
			setState(202);
			switch (_input.LA(1)) {
			case T__13:
				_localctx = new IntegerParamDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193); ((IntegerParamDeclarationContext)_localctx).param = param();
				((IntegerParamDeclarationContext)_localctx).declarations.add(((IntegerParamDeclarationContext)_localctx).param);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(194); match(T__10);
					setState(195); ((IntegerParamDeclarationContext)_localctx).param = param();
					((IntegerParamDeclarationContext)_localctx).declarations.add(((IntegerParamDeclarationContext)_localctx).param);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__2:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	 
		public ParamContext() { }
		public void copyFrom(ParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VectorParamContext extends ParamContext {
		public VectorDeclarationContext vectorDeclaration() {
			return getRuleContext(VectorDeclarationContext.class,0);
		}
		public VectorParamContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterVectorParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitVectorParam(this);
		}
	}
	public static class IntegerParamContext extends ParamContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public IntegerParamContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterIntegerParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitIntegerParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param);
		try {
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new IntegerParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204); varDeclaration();
				}
				break;
			case 2:
				_localctx = new VectorParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205); vectorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__19) | (1L << T__15) | (1L << T__13) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(208); statement();
				setState(209); match(T__18);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public Token funcName;
		public ExpressionListContext arguments;
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); ((FunctionCallContext)_localctx).funcName = match(IDENTIFIER);
			setState(217); match(T__12);
			setState(218); ((FunctionCallContext)_localctx).arguments = expressionList();
			setState(219); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> expressions = new ArrayList<ExpressionContext>();
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionList);
		int _la;
		try {
			setState(230);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(221); ((ExpressionListContext)_localctx).expression = expression(0);
				((ExpressionListContext)_localctx).expressions.add(((ExpressionListContext)_localctx).expression);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(222); match(T__10);
					setState(223); ((ExpressionListContext)_localctx).expression = expression(0);
					((ExpressionListContext)_localctx).expressions.add(((ExpressionListContext)_localctx).expression);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 14);
		case 1: return precpred(_ctx, 13);
		case 2: return precpred(_ctx, 12);
		case 3: return precpred(_ctx, 11);
		case 4: return precpred(_ctx, 10);
		case 5: return precpred(_ctx, 9);
		case 6: return precpred(_ctx, 8);
		case 7: return precpred(_ctx, 7);
		case 8: return precpred(_ctx, 6);
		case 9: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u00eb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2"+
		"$\n\2\r\2\16\2%\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5_\n\5\f\5\16\5b\13\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7|\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u008a\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0094\n\7\3\7\3\7\5"+
		"\7\u0098\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00a1\n\t\f\t\16\t\u00a4"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b2\n\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\7\r\u00c7\n\r\f\r\16\r\u00ca\13\r\3\r\5\r\u00cd\n\r\3\16\3\16"+
		"\5\16\u00d1\n\16\3\17\3\17\3\17\7\17\u00d6\n\17\f\17\16\17\u00d9\13\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00e3\n\21\f\21\16\21\u00e6"+
		"\13\21\3\21\5\21\u00e9\n\21\3\21\2\3\b\22\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \2\2\u00fb\2#\3\2\2\2\4+\3\2\2\2\6\63\3\2\2\2\b>\3\2\2\2\nc"+
		"\3\2\2\2\f\u0097\3\2\2\2\16\u0099\3\2\2\2\20\u009c\3\2\2\2\22\u00b1\3"+
		"\2\2\2\24\u00b3\3\2\2\2\26\u00b7\3\2\2\2\30\u00cc\3\2\2\2\32\u00d0\3\2"+
		"\2\2\34\u00d7\3\2\2\2\36\u00da\3\2\2\2 \u00e8\3\2\2\2\"$\5\4\3\2#\"\3"+
		"\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'(\5\6\4\2()\7\t\2\2)"+
		",\3\2\2\2*,\5\26\f\2+\'\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-\64\5\24\13\2.\64"+
		"\5\n\6\2/\64\5\f\7\2\60\64\5\16\b\2\61\64\5\20\t\2\62\64\5\22\n\2\63-"+
		"\3\2\2\2\63.\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2"+
		"\2\2\64\7\3\2\2\2\65\66\b\5\1\2\66?\7\35\2\2\678\7\34\2\289\7\22\2\29"+
		":\5\b\5\2:;\7\26\2\2;?\3\2\2\2<?\7\34\2\2=?\5\36\20\2>\65\3\2\2\2>\67"+
		"\3\2\2\2><\3\2\2\2>=\3\2\2\2?`\3\2\2\2@A\f\20\2\2AB\7\3\2\2B_\5\b\5\21"+
		"CD\f\17\2\2DE\7\20\2\2E_\5\b\5\20FG\f\16\2\2GH\7\33\2\2H_\5\b\5\17IJ\f"+
		"\r\2\2JK\7\32\2\2K_\5\b\5\16LM\f\f\2\2MN\7\r\2\2N_\5\b\5\rOP\f\13\2\2"+
		"PQ\7\25\2\2Q_\5\b\5\fRS\f\n\2\2ST\7\27\2\2T_\5\b\5\13UV\f\t\2\2VW\7\23"+
		"\2\2W_\5\b\5\nXY\f\b\2\2YZ\7\24\2\2Z_\5\b\5\t[\\\f\7\2\2\\]\7\6\2\2]_"+
		"\5\b\5\b^@\3\2\2\2^C\3\2\2\2^F\3\2\2\2^I\3\2\2\2^L\3\2\2\2^O\3\2\2\2^"+
		"R\3\2\2\2^U\3\2\2\2^X\3\2\2\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2"+
		"a\t\3\2\2\2b`\3\2\2\2cd\7\b\2\2de\7\17\2\2ef\5\b\5\2fg\7\31\2\2gh\7\7"+
		"\2\2hm\5\34\17\2ij\7\5\2\2jk\5\b\5\2kl\7\t\2\2ln\3\2\2\2mi\3\2\2\2mn\3"+
		"\2\2\2no\3\2\2\2op\7\13\2\2p\13\3\2\2\2qr\7\f\2\2rs\7\17\2\2st\5\b\5\2"+
		"tu\7\31\2\2uv\7\7\2\2v{\5\34\17\2wx\7\5\2\2xy\5\b\5\2yz\7\t\2\2z|\3\2"+
		"\2\2{w\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\13\2\2~\u0098\3\2\2\2\177\u0080"+
		"\7\f\2\2\u0080\u0081\7\17\2\2\u0081\u0082\5\b\5\2\u0082\u0083\7\31\2\2"+
		"\u0083\u0084\7\7\2\2\u0084\u0089\5\34\17\2\u0085\u0086\7\5\2\2\u0086\u0087"+
		"\5\b\5\2\u0087\u0088\7\t\2\2\u0088\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\13\2\2\u008c\u008d\7"+
		"\30\2\2\u008d\u008e\7\7\2\2\u008e\u0093\5\34\17\2\u008f\u0090\7\5\2\2"+
		"\u0090\u0091\5\b\5\2\u0091\u0092\7\t\2\2\u0092\u0094\3\2\2\2\u0093\u008f"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\13\2\2"+
		"\u0096\u0098\3\2\2\2\u0097q\3\2\2\2\u0097\177\3\2\2\2\u0098\r\3\2\2\2"+
		"\u0099\u009a\7\16\2\2\u009a\u009b\7\34\2\2\u009b\17\3\2\2\2\u009c\u009d"+
		"\7\16\2\2\u009d\u009e\7\34\2\2\u009e\u00a2\7\22\2\2\u009f\u00a1\5\b\5"+
		"\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\26\2\2"+
		"\u00a6\21\3\2\2\2\u00a7\u00a8\7\34\2\2\u00a8\u00a9\7\n\2\2\u00a9\u00b2"+
		"\5\b\5\2\u00aa\u00ab\7\34\2\2\u00ab\u00ac\7\22\2\2\u00ac\u00ad\5\b\5\2"+
		"\u00ad\u00ae\7\26\2\2\u00ae\u00af\7\n\2\2\u00af\u00b0\5\b\5\2\u00b0\u00b2"+
		"\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b2\23\3\2\2\2\u00b3"+
		"\u00b4\7\4\2\2\u00b4\u00b5\5\b\5\2\u00b5\u00b6\7\31\2\2\u00b6\25\3\2\2"+
		"\2\u00b7\u00b8\7\16\2\2\u00b8\u00b9\7\34\2\2\u00b9\u00ba\7\17\2\2\u00ba"+
		"\u00bb\5\30\r\2\u00bb\u00bc\7\31\2\2\u00bc\u00bd\7\7\2\2\u00bd\u00be\5"+
		"\34\17\2\u00be\u00bf\7\5\2\2\u00bf\u00c0\5\b\5\2\u00c0\u00c1\7\t\2\2\u00c1"+
		"\u00c2\7\13\2\2\u00c2\27\3\2\2\2\u00c3\u00c8\5\32\16\2\u00c4\u00c5\7\21"+
		"\2\2\u00c5\u00c7\5\32\16\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\31\3\2\2\2\u00ce\u00d1\5\16\b\2\u00cf\u00d1\5\20\t\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00cf\3\2\2\2\u00d1\33\3\2\2\2\u00d2\u00d3\5\6\4\2\u00d3\u00d4"+
		"\7\t\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\35\3\2\2\2\u00d9\u00d7\3\2\2"+
		"\2\u00da\u00db\7\34\2\2\u00db\u00dc\7\17\2\2\u00dc\u00dd\5 \21\2\u00dd"+
		"\u00de\7\31\2\2\u00de\37\3\2\2\2\u00df\u00e4\5\b\5\2\u00e0\u00e1\7\21"+
		"\2\2\u00e1\u00e3\5\b\5\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e9\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"!\3\2\2\2\25%+\63>^`m{\u0089\u0093\u0097\u00a2\u00b1\u00c8\u00cc\u00d0"+
		"\u00d7\u00e4\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}