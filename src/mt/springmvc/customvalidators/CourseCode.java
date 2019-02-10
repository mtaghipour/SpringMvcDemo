package mt.springmvc.customvalidators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// CourseCodeConstraintValidator : Is the class implement the logic of validation.

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Retention(RUNTIME)
@Target({FIELD, METHOD})
public @interface CourseCode {

    public String value() default "MT";

    public String message() default "must start with MT";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};

}
