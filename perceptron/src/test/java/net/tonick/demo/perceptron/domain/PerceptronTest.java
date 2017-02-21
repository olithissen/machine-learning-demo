package net.tonick.demo.perceptron.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PerceptronTest {

	@Test
	public void test() {
		Perceptron p = new Perceptron(new float[] {1.0f, 0.0f});
		
		assertTrue("Point 1 misclassified.", p.isPositive(new float[] {0.5f, 0.5f,}));
		assertFalse("Point 2 misclassified.", p.isPositive(new float[] {-0.5f, 0.5f,}));
		assertFalse("Point 3 misclassified.", p.isPositive(new float[] {-500f, -500f,}));
	}
}
