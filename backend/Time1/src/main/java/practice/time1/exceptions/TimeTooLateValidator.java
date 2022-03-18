package practice.time1.exceptions;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDateTime;

public class TimeTooLateValidator implements
        ConstraintValidator<TimeTooLateConstraint, LocalDateTime> {


    @Override
    public void initialize(TimeTooLateConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(LocalDateTime value, ConstraintValidatorContext context) {
        return value != null && value.getHour() > 7 && value.getHour() < 23;
    }
}
