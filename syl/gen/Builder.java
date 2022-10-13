package syl.gen;

public class Builder {

	private Dean dean;

	private Professor professor;

	private CourseDesigner courseDesigner;

	private CourseBuilder courseBuilder;

	private PolicyBuilder policyBuilder;

	private ModuleBuilder moduleBuilder;

	private Facade facade;

	public String setCourseName() {
		System.out.println("Call has been made to Builder Pattern");
		return null;
	}

	public int setCourseNumber() {
		return 0;
	}

	public String setCourseSyllabus() {
		return null;
	}

	public String setPolicyName() {
		return null;
	}

	public String setPolicyContent() {
		return null;
	}

	public int setTotalModules() {
		return 0;
	}

	public String setModuleName() {
		return null;
	}

	public String setModuleContent() {
		return null;
	}

}
