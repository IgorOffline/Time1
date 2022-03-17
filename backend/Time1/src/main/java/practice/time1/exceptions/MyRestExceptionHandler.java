package practice.time1.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import practice.time1.common.MessageRes;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@RestController
@ControllerAdvice
public class MyRestExceptionHandler extends ResponseEntityExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({ ConstraintViolationException.class })
    public List<MessageRes> handleConstraintViolationException(ConstraintViolationException ex, WebRequest request) {
        var list = new ArrayList<MessageRes>();
        ex.getConstraintViolations().forEach(violation -> list.add(new MessageRes(violation.getMessage())));
        return list;
    }
}
