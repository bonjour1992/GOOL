package gool.ast.system;

import gool.ast.constructs.Dependency;
import gool.ast.printer.GoolGeneratorController;

public class SystemOutDependency extends Dependency {

	@Override
	public String callGetCode() {
		return GoolGeneratorController.generator().getCode(this);
	}
}
