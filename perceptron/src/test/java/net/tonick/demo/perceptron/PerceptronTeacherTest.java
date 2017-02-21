package net.tonick.demo.perceptron;

import org.junit.Test;

import net.tonick.demo.perceptron.domain.Perceptron;

public class PerceptronTeacherTest {
	/**
	 * 
	 */
	private static final int MAX_DATAPOINTS = 200;
	private static final float[][] testInputs1 = { { 1.0f, 1.0f }, { 1.0f, -1.0f }, { -1.0f, 1.0f }, { -1.0f, -1.0f } };
	private static final boolean[] testLabels1 = { true, true, false, false };
	private static final float[][] testInputs2 = { { 1.0f, 1.0f }, { 1.0f, -1.0f }, { -1.0f, 1.0f }, { -1.0f, -1.0f } };
	private static final boolean[] testLabels2 = { false, false, true, true };
	private static final float[][] testInputs3 = { { 1.0f, 1.0f }, { 1.0f, -1.0f }, { -1.0f, 1.0f }, { -1.0f, -1.0f } };
	private static final boolean[] testLabels3 = { false, false, true, true };

	private static float[][] testInputs4 = new float[MAX_DATAPOINTS][2];
	private static boolean[] testLabels4 = new boolean[MAX_DATAPOINTS];

	@Test
	public void perceptronShoudLearn() {
//		PerceptronTeacher teacher1 = new PerceptronTeacher(testInputs1, testLabels1);
//		Perceptron p1 = teacher1.createPerceptron();
//		PerceptronTeacher teacher2 = new PerceptronTeacher(testInputs2, testLabels2);
//		Perceptron p2 = teacher2.createPerceptron();
//		PerceptronTeacher teacher3 = new PerceptronTeacher(testInputs3, testLabels3);
//		Perceptron p3 = teacher2.createPerceptron();
		
		for (int i = 0; i < MAX_DATAPOINTS; i++) {
			float x = (float)Math.random() * 50f;
			float y = -2f + x*0.8f;
			float training_y = (float)Math.random() * 50f;
			boolean label = (training_y > y) ? true : false;
			testInputs4[i][0] = x;
			testInputs4[i][1] = training_y;
			testLabels4[i] = label;
		}

		PerceptronTeacher teacher4 = new PerceptronTeacher(testInputs4, testLabels4);
		Perceptron p4 = teacher4.createPerceptron();
		
//		assertTrue("Point 1 misclassified.", p3.isPositive(new float[] {0.5f, 0.5f,}));
//		assertFalse("Point 2 misclassified.", p3.isPositive(new float[] {-0.5f, 0.5f,}));
//		assertFalse("Point 3 misclassified.", p3.isPositive(new float[] {-500f, -500f,}));
		
	}
}