package snmaddula.remittance.limit.exception;

/**
 * Custom exception for limit service
 * 
 * @author snmaddula
 *
 */
public class LimitServiceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final Integer code;

	public LimitServiceException(Integer code, String message) {
		super(message);
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}
}
