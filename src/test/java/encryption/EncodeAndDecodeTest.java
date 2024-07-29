package encryption;

import java.util.Base64;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class EncodeAndDecodeTest {

	@Test
	public void sampleTest() {
		String encoded = new String(Base64.getEncoder().encode("pavankalyan".getBytes()));

		System.out.println(encoded);

		String decoded = new String(Base64.getDecoder().decode("cm1neWFudHJhOnJtZ3lAOTk5OQ==".getBytes()));

		System.out.println(decoded);
	}
}
