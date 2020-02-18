package maven_project2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.epam.maven_project.Cleancode;

class CostofhouseTest {

	@Test
	void test() {
		Costofhouse cost=new Costofhouse();
		double output=cost.estimatedcost("highstdmat",2,true);
		assertEquals(5000,output);
	}

}
