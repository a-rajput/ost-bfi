package com.ostmodern.bfiplayer;

import static com.ostmodern.bfiplayer.selenium.SeleniumHelper.*;

import com.ostmodern.bfiplayer.selenium.locators.BFILocator;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class SeleniumTest {


	 @BeforeClass
     public static void openBrowser(){
			openUrl(BFILocator.webURL);
			maximize();	
	} 

	 @Test
	 /*
	  * Signup for BFI and create an account
	  */
     public void SignUp(){

		 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
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
		 
		 System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
     }

	 @Test
	 /*
	  * Once signed up, search for a file.
	  */
     public void searchFilm()
     {
		 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
			click(BFILocator.cookieModal);
			click(BFILocator.search);
			type(BFILocator.searchTerm,"45 Years");
			click(BFILocator.cookieModal);	
			click(BFILocator.selectFilm);
			click(BFILocator.cookieModal);
			
	     System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
     }
	 
	 /*
	  * Verify that we have opened correct film
	  */
	 
	 @Test
     public void verifyResult()
     {
		 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
		Assert.assertEquals(getCurrentUrl(), "http://player.bfi.org.uk/film/watch-45-years-2014/" );
			
	     System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
     }

	 
	 @AfterClass
	 public static void closeBrowser(){
		 exit();
	 }
}