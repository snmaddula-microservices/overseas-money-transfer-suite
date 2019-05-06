package snmaddula.remittance.limit.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.data.annotation.Id;

import lombok.Data;

/**
 * This entity corresponds to the table <b>"LIMIT_DETAILS"</b>. We save the
 * updates done to customer's daily limit / remaining daily limit.
 * 
 * @author snmaddula
 *
 */
@Data
@Entity
public class LimitEntity {

	@Id
	@GeneratedValue
	private Long id;
	private String customerId;
	private String customerType;
	private BigDecimal dailyLimit;
	private BigDecimal remainingDailyLimit;
	private BigDecimal yearlyLimit;
	private BigDecimal remainingYearlyLimit;
	private Date createdDate;
	private Date modifiedDate;
	
	@PrePersist
	public void preInsert() {
		createdDate = new Date();
		modifiedDate = createdDate;
	}

	@PreUpdate
	public void preUpdate() {
		modifiedDate = new Date();
	}
}
