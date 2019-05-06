package snmaddula.remittance.limit.exception;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import snmaddula.remittance.limit.dto.LimitServiceResponse;

/**
 * Global exception handler for Remittance Limit Service
 * 
 * @author snmaddula
 *
 */
@RestControllerAdvice
public class LimitServiceExceptionsHandler {

	@ExceptionHandler({Exception.class})
    public ResponseEntity<LimitServiceResponse<String>> handleInternalExceptions(Exception ex) {
        return responseFrom(ex, BAD_REQUEST.value());
    }
    
    @ExceptionHandler({LimitServiceException.class})
    public ResponseEntity<LimitServiceResponse<String>> handleServiceExceptions(LimitServiceException ex) {
    	return responseFrom(ex, ex.getCode());
    }
    
    private ResponseEntity<LimitServiceResponse<String>> responseFrom(Exception ex, int statusCode){
    	return ResponseEntity.ok(new LimitServiceResponse<String>() {{
        	setErrorMessage(ex.getMessage());
        	setHasError(true);
        	setCode(BAD_REQUEST.value());
        }});
    }
}
