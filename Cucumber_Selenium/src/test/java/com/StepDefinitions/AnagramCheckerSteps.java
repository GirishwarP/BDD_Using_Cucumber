package com.StepDefinitions;

import java.util.List;

import com.code.AnagramChecker;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class AnagramCheckerSteps {

	public AnagramChecker anaChecker;
	public boolean actualResult;
	
	@Given("^I have anagram checker$")
	public void i_have_anagram_checker() throws Throwable {
			anaChecker = new AnagramChecker();
	}

	@When("^i give Silent and Listen to anagram checker$")
	public void i_give_Silent_and_Listen_to_anagram_checker() throws Throwable {
			actualResult = AnagramChecker.anagramCheck("Silent", "Listen");
	}

	@Then("^the result should be true$")
	public void the_result_should_be_true() throws Throwable {
			Assert.assertEquals(true, actualResult);
	}

	@When("^i give Girish and Patil to anagram checker$")
	public void i_give_Girish_and_Patil_to_anagram_checker() throws Throwable {
			actualResult = AnagramChecker.anagramCheck("Girish", "Patil");
	}

	@Then("^the result should be false$")
	public void the_result_should_be_false() throws Throwable {
			Assert.assertEquals(false, actualResult);
	}

	@When("^i give Dirty Room and Dormitory to anagram checker$")
	public void i_give_Dirty_Room_and_Dormitory_to_anagram_checker() throws Throwable {
			actualResult = AnagramChecker.anagramCheck("Dirty Room", "Dormitory");
	}
	
	@When("^i give \"([^\"]*)\" and \"([^\"]*)\" to anagram checker$")
	public void i_give_String1_and_String2_to_anagram_checker(String String1, String String2) throws Throwable {
			actualResult = AnagramChecker.anagramCheck(String1, String2);
	}
	
	@Then("^the result should be \"([^\"]*)\"$")
	public void the_result_should_be(boolean expectedResult) throws Throwable {
			Assert.assertEquals(expectedResult, actualResult);
	}
	
	@When("^i give valid data to anagram checker$")
	public void i_give_valid_data_to_anagram_checker(DataTable dataTable) throws Throwable {
		
	    List<List<String>> data = dataTable.raw();
	    
	    for(int i=0; i<data.size(); i++) {
	    	String string1 = data.get(i).get(0);
	    	String string2 = data.get(i).get(1);
	    	
	    	actualResult = AnagramChecker.anagramCheck(string1, string2);
	    } 
	}
	
	@When("^i give invalid data to anagram checker$")
	public void i_give_invalid_data_to_anagram_checker(DataTable dataTable) throws Throwable {
		
		List<List<String>> data = dataTable.raw();
	    
	    for(int i=0; i<data.size(); i++) {
	    	String string1 = data.get(i).get(0);
	    	String string2 = data.get(i).get(1);
	    	
	    	actualResult = AnagramChecker.anagramCheck(string1, string2);
	    }
	}
}
