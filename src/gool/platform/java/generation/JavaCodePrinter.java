package gool.platform.java.generation;

import gool.platform.common.CodePrinter;

import java.io.File;

/**
 * Provides the basic functionality to generate Java code from a list of GOOL
 * classes.
 */
public class JavaCodePrinter extends CodePrinter {
	private static final String TEMPLATE_DIR = "gool/platform/java/generation/templates/";

	public JavaCodePrinter(File outputDir) {
		super(new JavaGenerator(), outputDir);
	}
	
	@Override
	public String getTemplateDir() {
		return TEMPLATE_DIR;
	}

	@Override
	public String getFileName(String className) {
		return className + ".java";
	}
}
