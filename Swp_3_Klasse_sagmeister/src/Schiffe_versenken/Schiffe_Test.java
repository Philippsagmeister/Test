package Schiffe_versenken;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Schiffe_Test {

	
	
	int anzahl = 0;

	@Test
	void test() {
		Schiffe.SchiffeErzeugen();
		for (int i = 0; i < Schiffe.ueberpruefen.length; i++) {
			for (int j = 0; j < Schiffe.ueberpruefen[i].length; j++) {
				if (Schiffe.ueberpruefen[i][j] > 0) {
					anzahl++;
				}
			}
		}
		assertEquals(anzahl, 30);
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

}
