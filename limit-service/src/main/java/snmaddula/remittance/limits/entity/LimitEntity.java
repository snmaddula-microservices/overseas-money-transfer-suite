package snmaddula.remittance.limits.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author snmaddula
 *
 */
@Data
@Entity
@Table(name = "LIMIT_DETAILS")
@NamedQueries({
		@NamedQuery(
				name = "LimitEntity.resetDailyLimits", 
				query = "UPDATE LimitEntity e SET e.remainingDailyLimit = least(e.remainingDailyLimit, e.remainingYearlyLimit)"),
		@NamedQuery(
				name = "LimitEntity.resetYearlyLimits", 
				query = "UPDATE LimitEntity e set e.remainingYearlyLimit = e.yearlyLimit") 
		})
@NoArgsConstructor
public class LimitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
