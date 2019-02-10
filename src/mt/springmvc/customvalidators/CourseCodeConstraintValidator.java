package mt.springmvc.customvalidators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	@Override
	public void initialize(CourseCode constraintAnnotation) {
		
		//constraintAnnotation : Is the value attribute specified by user
		//						 in @CourseCode.(e.g: @CourseCode(value="TOPS")
		
		coursePrefix = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {

		boolean result ;
		
		// theCode :Is the data , user entered in Course Code HTML field.

		if(theCode != null)
		{
			result = theCode.startsWith(coursePrefix);
		}else {
			result = true;
		}

		return result;
	}
}
