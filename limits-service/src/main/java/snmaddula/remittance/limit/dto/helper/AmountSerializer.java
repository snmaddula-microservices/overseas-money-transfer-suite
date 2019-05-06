package snmaddula.remittance.limit.dto.helper;

import static java.math.BigDecimal.ROUND_HALF_UP;

import java.io.IOException;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * 
 * @author snmaddula
 *
 */
public class AmountSerializer extends JsonSerializer<BigDecimal>{

	@Override
	public void serialize(BigDecimal value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeString(value.setScale(2, ROUND_HALF_UP).toString());
	}
}
