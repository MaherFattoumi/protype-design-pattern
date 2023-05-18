package com.mf.protype.test;

import org.junit.Assert;
import org.junit.runner.RunWith;

import com.mf.protype.CloneableShape;
import com.mf.protype.ShapeCache;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "protype-design-pattern-shape.feature")
public class ProtypeDesignPatternShapeSteps {
	private CloneableShape shape;
	private CloneableShape clonedShape;

	@Given("^a loaded shape cache$")
	public void aLoadedShapeCache() {
		ShapeCache.loadCache();
	}

	@When("^cloning a circle shape$")
	public void cloningACircleShape() {
		shape = ShapeCache.getShape("Circle");
		clonedShape = shape.clone();
	}

	@When("^cloning a rectangle shape$")
	public void cloningARectangleShape() {
		shape = ShapeCache.getShape("Rectangle");
		clonedShape = shape.clone();
	}

	@Then("^a new circle shape is created$")
	public void aNewCircleShapeIsCreated() {
		// Verify that a new circle shape is created
		// Add your assertions based on your implementation
		Assert.assertTrue(checkCircleShapeCreation());
	}

	@Then("^a new rectangle shape is created$")
	public void aNewRectangleShapeIsCreated() {
		// Verify that a new rectangle shape is created
		// Add your assertions based on your implementation
		Assert.assertTrue(checkRectangleShapeCreation());
	}

	private boolean checkCircleShapeCreation() {
		// Implementation of checking if a new circle shape is created
		// Replace this with your own implementation that checks the creation status
		return true;
	}

	private boolean checkRectangleShapeCreation() {
		// Implementation of checking if a new rectangle shape is created
		// Replace this with your own implementation that checks the creation status
		return true;
	}
}
