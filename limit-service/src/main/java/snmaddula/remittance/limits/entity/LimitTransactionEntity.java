package snmaddula.remittance.limits.entity;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author snmaddula
 *
 */
@Data
@Entity
@NoArgsConstructor
@Table(name = "LIMIT_TRANSACTION")
public class LimitTransactionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private BigDecimal remitAmount;
	private BigDecimal exchangeRateUSD;
	private BigDecimal destCurrencyExchangeRate;
	
	private String status;
	private String remarks;
	private String payeeId;
	private String customerId;
	private String destCountry;
	private String customerType;
	private String destCurrency;
	private String sourceCountry;
	private String sourceCurrency;

	private Date createdDate;
	private Date payeeCreationTime;

	@PrePersist
	public void insertDefaults() {
		createdDate = new Date();
	}

	@Override
	public String toString() {
		return reflectionToString(this, SHORT_PREFIX_STYLE);
	}
}
