package com.ostmodern.bfiplayer.selenium.locators;

import org.openqa.selenium.By;

public class BFILocator {

	//Signup
	public static final String webURL = "http://player.bfi.org.uk/";
	public static final By cookieModal = By.xpath(".//*[@id='cookies']/span");
	public static final By signUp = By.xpath(".//*[@id='primary-navigation']/nav/div/a[1]");
	public static final By createAccount = By.cssSelector("a[title='Sign up']");
	public static final By firstName = By.id("first_name");
	public static final By lastName = By.id("last_name");
	public static final By signUpEmail = By.id("email");
	public static final By signUpEmailConfirm = By.id("email_confirm");
	public static final By signUpPassword = By.id("password1");
	public static final By signUpPasswordConfirm = By.id("password2");
	public static final By submitYourDetails = By.cssSelector("input[value='Submit your details']");
	
	//Login
	public static final By loginEmail = By.xpath("email");
	public static final By password = By.id("password");
	public static final By signIn = By.xpath(".//*[@id='login-form']/fieldset/input");
	public static final By search = By.xpath(".//*[@id='primary-navigation']/nav/a[1]");
	public static final By searchTerm = By.id("q_id");
	public static final By selectFilm = By.cssSelector("a[href='/film/watch-45-years-2014/");	
	
}

