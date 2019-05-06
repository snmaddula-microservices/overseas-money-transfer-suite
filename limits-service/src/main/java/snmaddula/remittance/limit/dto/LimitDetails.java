package snmaddula.remittance.limit.dto;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;
import snmaddula.remittance.limit.dto.helper.AmountSerializer;

/**
 * 
 * @author snmaddula
 *
 */
@Data
@JsonInclude(NON_EMPTY)
public class LimitDetails {

	private String customerId;
	
	@JsonSerialize(using = AmountSerializer.class)
	private BigDecimal dailyLimit;
	@JsonSerialize(using = AmountSerializer.class)
	private BigDecimal remainingDailyLimit;
	@JsonSerialize(using = AmountSerializer.class)
	private BigDecimal yearlyLimit;
	@JsonSerialize(using = AmountSerializer.class)
	private BigDecimal remainingYearlyLimit;
	@JsonSerialize(using = AmountSerializer.class)
	private BigDecimal transactionLimit;
	
	@JsonFormat(shape = STRING, timezone = "IST", pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createdDate;
	@JsonFormat(shape = STRING, timezone = "IST", pattern = "yyyy-MM-dd HH:mm:ss")
	private Date modifiedDate;

}
