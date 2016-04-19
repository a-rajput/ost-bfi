package com.ostmodern.bfiplayer.steps;


import static com.ostmodern.bfiplayer.selenium.SeleniumHelper.*;

import com.ostmodern.bfiplayer.selenium.locators.BFILocator;



public class LoginSteps {

public void login() {
	
	//Signup Steps
	openUrl(BFILocator.webURL);
	maximize();
	click(BFILocator.cookieModal);
	click(BFILocator.signUp);
	click(BFILocator.createAccount);	
	type(BFILocator.firstName, "Amy");
	type(BFILocator.lastName, "Rajput");
	type(BFILocator.signUpEmail, "test3@gmail.com");
	type(BFILocator.signUpEmailConfirm, "test3@gmail.com");
	type(BFILocator.signUpPassword, "Password01");
	type(BFILocator.signUpPasswordConfirm, "Password01");
	click(BFILocator.submitYourDetails);
	
	//Login Steps
	click(BFILocator.cookieModal);
	click(BFILocator.search);
	type(BFILocator.searchTerm,"45 Years");
	click(BFILocator.cookieModal);	
	click(BFILocator.selectFilm);
	click(BFILocator.cookieModal);
	
	
}

}
