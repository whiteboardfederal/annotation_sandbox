package demoApp.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import demoApp.domain.ErrorInfo;

public class BaseController {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)	//500
    @ExceptionHandler(Exception.class)
    @ResponseBody 
    ErrorInfo handleBadRequest(HttpServletRequest req, Exception ex) {
        return new ErrorInfo(	HttpStatus.INTERNAL_SERVER_ERROR.value(), 
        							"Mask the issue, but also log it", 
        							"We fucked up, sorry.  There is nothing you can do to fix the problem.");
    }
    
}
