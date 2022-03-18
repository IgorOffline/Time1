package practice.time1.exceptions;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TimeTooLateValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeTooLateConstraint {
    String message() default "Time too late or too early";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
