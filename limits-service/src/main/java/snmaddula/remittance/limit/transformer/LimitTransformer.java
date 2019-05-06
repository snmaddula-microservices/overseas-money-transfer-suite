package snmaddula.remittance.limit.transformer;

import static org.springframework.beans.BeanUtils.copyProperties;
import org.springframework.stereotype.Service;

import snmaddula.remittance.limit.dto.LimitDetails;
import snmaddula.remittance.limit.entity.LimitEntity;

/**
 * Object transformation service utility
 * 
 * @author snmaddula
 *
 */
@Service
public class LimitTransformer {

	public LimitDetails toLimitDetails(LimitEntity entity) {
		LimitDetails limitDetails = new LimitDetails();
		copyProperties(entity, limitDetails);
		return limitDetails;
	}
}
