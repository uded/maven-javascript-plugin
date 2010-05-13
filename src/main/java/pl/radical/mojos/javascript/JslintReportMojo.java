package pl.radical.mojos.javascript;

import java.io.File;
import java.util.Locale;

import org.apache.maven.doxia.siterenderer.Renderer;
import org.apache.maven.project.MavenProject;
import org.apache.maven.reporting.AbstractMavenReport;
import org.apache.maven.reporting.MavenReportException;

/**
 * @author <a href="mailto:lukasz@radical.com.pl">Łukasz Rżanek</a>
 * @author Radical Creations &copy;2010
 * @goal report
 * @execute phase="process-resources"
 */
public class JslintReportMojo extends AbstractMavenReport {
	/**
	 * Location where generated html will be created.
	 * 
	 * @parameter expression="${project.reporting.outputDirectory}"
	 */
	private File outputDirectory;

	/**
	 * The filename to use for the report.
	 * 
	 * @parameter expression="${outputName}" default-value="jslint-report"
	 * @required
	 */
	private String outputName;

	/**
	 * Doxia Site Renderer
	 * 
	 * @component
	 */
	private Renderer siteRenderer;

	/**
	 * Location of the source files.
	 * 
	 * @parameter default-value="${basedir}/src/main/javascript"
	 */
	private File sourceDirectory;

	/**
	 * Maven Project
	 * 
	 * @parameter expression="${project}"
	 * @required
	 * @readonly
	 */
	private MavenProject project;

	protected void executeReport(final Locale locale)
			throws MavenReportException {

	}

	public String getName(final Locale locale) {
		return "jslint report";
	}

	public String getDescription(final Locale locale) {
		return "Report on JavaScript syntax errors and warnings";
	}

	public String getOutputName() {
		return outputName;
	}

	protected String getOutputDirectory() {
		return outputDirectory.getAbsolutePath();
	}

	protected MavenProject getProject() {
		return project;
	}

	protected Renderer getSiteRenderer() {
		return siteRenderer;
	}

}
