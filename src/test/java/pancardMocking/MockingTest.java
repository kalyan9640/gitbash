package pancardMocking;

import javax.annotation.RegEx;

import org.mockito.Mockito;

class PanCard {

	public String isValid(String pancard) {
		if (pancard.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			return pancard + " is valid PANCARD";
		}
		return pancard + " is not valid PANCARD";
	}	
	
	public static PanCard getMockObject() {
		PanCard mockObj = Mockito.mock(PanCard.class);
		Mockito.when(mockObj.isValid("LTLPS6100G")).thenReturn("PANCARD is Valid");
		Mockito.when(mockObj.isValid("LTLPS6100F")).thenReturn("PANCARD is Valid");
		Mockito.when(mockObj.isValid("LTLPS6100E")).thenReturn("PANCARD is Valid");
		Mockito.when(mockObj.isValid("LTLPS6100D")).thenReturn("PANCARD is InValid");
		return mockObj;
	}
}

public class MockingTest {

	public static void main(String[] args) {

		PanCard obj = PanCard.getMockObject();
		System.out.println(obj.isValid("LTLPS6100D"));

	}
}
