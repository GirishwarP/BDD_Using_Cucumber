Feature: String anagram checking
				 As user I want to check that, both given Strings are anagram or not

Scenario: check whether the Silent and Listen are anagrams or not
Given I have anagram checker 
When i give Silent and Listen to anagram checker
Then the result should be true

Scenario: check whether the Girish and Patil are anagrams or not
Given I have anagram checker 
When i give Girish and Patil to anagram checker
Then the result should be false

Scenario: check whether the Dirty Room and Dormitory are anagrams or not
Given I have anagram checker 
When i give Dirty Room and Dormitory to anagram checker
Then the result should be true

Scenario Outline: Check Anagram functionality using scenario outline
Given I have anagram checker 
When i give "<String1>" and "<String2>" to anagram checker
Then the result should be "<Result>"
Examples:
		| String1| String2	| Result|
    	| Act 	 | Cat		| true	|
    	| Girish | Yash 	| false |
    	| God 	 | Dog 	  	| true	|
    	| sink	 | skin   	| true 	|
    
Scenario: Check Anagram functionality using Data Table without header with valid data
Given I have anagram checker
When i give valid data to anagram checker
			 | Act 	 | Cat		|
			 | God 	 | Dog 	  	|
			 | sink	 | skin   	|
Then the result should be true

Scenario: Check Anagram functionality using Data Table without header with invalid data
Given I have anagram checker
When i give invalid data to anagram checker
			 | Girish 	 | Patil	|
			 | Pramod 	 | Tekale  	|
			 | Sudam   	 | Jadhav   |
Then the result should be false