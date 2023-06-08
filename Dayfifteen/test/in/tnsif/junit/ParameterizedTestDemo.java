package in.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings= {"Abinav","Ankita","Prabal"})
	void test() {
		System.out.println("Parameteized"+"Test");
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Sandhya","Ankita"})
	void accept(String str) {
		assertNotNull(str);
	}

}
