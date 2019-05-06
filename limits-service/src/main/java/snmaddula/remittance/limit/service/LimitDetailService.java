package snmaddula.remittance.limit.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import snmaddula.remittance.limit.dto.LimitDetails;
import snmaddula.remittance.limit.dto.LimitServiceResponse;

/**
 * 
 * @author snmaddula
 *
 */
@Service
public class LimitDetailService {

	public LimitServiceResponse<LimitDetails> fetch(String customerId, String customerType) {
		// TODO::
		return null;
	}

	public LimitServiceResponse<LimitDetails> save(String customerId, String customerType, BigDecimal dailyLimit) {
		// TODO::
		return null;
	}

	public void updateRemainingLimits(String customerId, String customerType, String remitAmount, String exchangeRateUSD) {
		// TODO::
	}
}
