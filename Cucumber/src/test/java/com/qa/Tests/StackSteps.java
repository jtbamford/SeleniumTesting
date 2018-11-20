package com.qa.Tests;

import java.util.Stack;
import org.junit.Assert;
import static org.junit.Assert.*;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StackSteps {
	
	StackObject stack;
	String str1;
	
	@Before
	public void setup() {
		stack=new StackObject();
	}
	
	@Given("an empty stack")
	public void an_empty_stack() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(0,stack.size());
	}

	@When("I push an item into the stack")
	public void i_push_an_item_into_the_stack() {
	    // Write code here that turns the phrase above into concrete actions
		stack.push("first");
	}

	@Then("the stack contains one item")
	public void the_stack_contains_one_item() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(1,stack.size());
	}

	@When("I push another item into the stack")
	public void i_push_another_item_into_the_stack() {
	    // Write code here that turns the phrase above into concrete actions
		stack.push("two");
	}

	@Then("the stack contains two items")
	public void the_stack_contains_two_items() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(2,stack.size());
	}

	@When("I pop from the stack")
	public void i_pop_from_the_stack() {
	    // Write code here that turns the phrase above into concrete actions
		str1=stack.pop();
	}

	@Then("I get the same item back")
	public void i_get_the_same_item_back() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("first",str1);
	}

	@Given("a stack with {int} items")
	public void a_stack_with_items(int int1) {
	    // Write code here that turns the phrase above into concrete actions
		int1=3;
		for(int i=0;i<int1;i++) {
		stack.push("i");
		}
	    assertEquals(int1,stack.size());
		}

}
