package pl.radical.mojos.javascript;

import org.apache.maven.plugin.AbstractMojo;

public abstract class AbstractJSLint extends AbstractMojo {
	/**
	 * <p>
	 * Either to stop processing the file when first error is found.
	 * 
	 * @parameter default-value=false
	 */
	@JSLintProperty("passfail")
	protected boolean stopOnFirstError;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("white")
	protected boolean strictWhiteSpace;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("browser")
	protected boolean assumeBrowser;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("devel")
	protected boolean assumeDevel;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("widget")
	protected boolean assumeYahooWidget;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("windows")
	protected boolean assumeWindows;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("rhino")
	protected boolean assumeRhino;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("safe")
	protected boolean safeSubset;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("adsafe")
	protected boolean adSafe;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("debug")
	protected boolean tolerateDebugger;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("eval")
	protected boolean tolerateEval;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("laxbreak")
	protected boolean tolerateLaxBreak;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("forin")
	protected boolean tolerateForIn;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("sub")
	protected boolean tolerateSubscripting;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("css")
	protected boolean tolerateCSSWorkarounds;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("cap")
	protected boolean tolerateHTMLCase;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("on")
	protected boolean tolerateHTMLEventHandlers;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("fragment")
	protected boolean tolerateHTMLFragments;

	/**
	 * @parameter default-value=false
	 */
	@JSLintProperty("es5")
	protected boolean tolerateES5Syntax;

	/**
	 * @parameter default-value=true
	 */
	@JSLintProperty("onevar")
	protected boolean allowOneVARPerFunction;

	/**
	 * @parameter default-value=true
	 */
	@JSLintProperty("undef")
	protected boolean disallowUndefVariables;

	/**
	 * @parameter default-value=true
	 */
	@JSLintProperty("nomen")
	protected boolean dissalowDanglingVariables;

	/**
	 * @parameter default-value=true
	 */
	@JSLintProperty("eqeqeq")
	protected boolean disallowEqualEqualEqual;

	/**
	 * @parameter default-value=true
	 */
	@JSLintProperty("plusplus")
	protected boolean disallowPlusPlus;

	/**
	 * @parameter default-value=true
	 */
	@JSLintProperty("bitwise")
	protected boolean disallowBitwise;

	/**
	 * @parameter default-value=true
	 */
	@JSLintProperty("regexp")
	protected boolean disallowInsecureRegex;

	/**
	 * @parameter default-value=true
	 */
	@JSLintProperty("newcap")
	protected boolean requireInitialCaps;

	/**
	 * @parameter default-value=true
	 */
	@JSLintProperty("immed")
	protected boolean requireParensAroundImmediateInv;

	/**
	 * @parameter default-value=true
	 */
	@JSLintProperty("strict")
	protected boolean requireUseStrict;

	/**
	 * @parameter default-value="4"
	 */
	@JSLintProperty("onevar")
	protected boolean whiteSpaceIndent;

	/**
	 * @parameter
	 */
	@JSLintProperty("maxlen")
	protected boolean maxLineLength;

	/**
	 * @parameter default-value="50"
	 */
	@JSLintProperty("maxerr")
	protected int maxErrors;

}
