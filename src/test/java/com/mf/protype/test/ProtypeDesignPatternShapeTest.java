package com.mf.protype.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.mf.protype.Circle;
import com.mf.protype.CloneableShape;
import com.mf.protype.Rectangle;
import com.mf.protype.ShapeCache;

public class ProtypeDesignPatternShapeTest {

	@Test
	public void testCloneCircleShape() {
		ShapeCache.loadCache();

		CloneableShape shape = ShapeCache.getShape("Circle");
		CloneableShape clonedShape = shape.clone();

		// Verify that a new circle shape is created
		// Add your assertions based on your implementation
		Assert.assertTrue(checkCircleShapeCreation(clonedShape));
	}

	@Test
	public void testCloneRectangleShape() {
		ShapeCache.loadCache();

		CloneableShape shape = ShapeCache.getShape("Rectangle");
		CloneableShape clonedShape = shape.clone();

		// Verify that a new rectangle shape is created
		// Add your assertions based on your implementation
		Assert.assertTrue(checkRectangleShapeCreation(clonedShape));
	}

	private boolean checkCircleShapeCreation(CloneableShape clonedShape) {
		// Implementation of checking if a new circle shape is created
		// Replace this with your own implementation that checks the creation status
		return clonedShape instanceof Circle;
	}

	private boolean checkRectangleShapeCreation(CloneableShape clonedShape) {
		// Implementation of checking if a new rectangle shape is created
		// Replace this with your own implementation that checks the creation status
		return clonedShape instanceof Rectangle;
	}
}
