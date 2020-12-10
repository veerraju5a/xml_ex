package prime2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class primeornot {

	@Test
	void test() {
		PrimeExample p= new PrimeExample();
		assertEquals(true, p.primeornot(5)); 
	}
	@Test
	void test1() {
		PrimeExample p= new PrimeExample();
		assertEquals(false, p.primeornot(6)); 
	}
}
