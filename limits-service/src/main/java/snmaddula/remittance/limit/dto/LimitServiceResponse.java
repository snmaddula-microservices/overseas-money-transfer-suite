package snmaddula.remittance.limit.dto;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Generic response model for Remittance Limit Service
 * 
 * @author snmaddula
 *
 * @param <T>
 */
@Data
@NoArgsConstructor
@JsonInclude(NON_EMPTY)
@JsonPropertyOrder({ "code", "hasError", "errorMessaage", "data" })
public class LimitServiceResponse<T> {

	private Integer code;
	private boolean hasError;
	private String errorMessage;
	private T data;
	
	public LimitServiceResponse(Integer code, T data) {
		this.code = code;
		this.data = data;
	}
}
