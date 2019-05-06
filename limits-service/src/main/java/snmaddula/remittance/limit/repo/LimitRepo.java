package snmaddula.remittance.limit.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Optional;

import snmaddula.remittance.limit.entity.LimitEntity;

/**
 * 
 * @author snmaddula
 *
 */
@Repository
public interface LimitRepo extends JpaRepository<LimitEntity, Long> {

	@Transactional(readOnly = true)
	Optional<LimitEntity> findOneByCustomerIdIgnoreCaseAndCustomerTypeIgnoreCase(String customerId, String customerType);
}
