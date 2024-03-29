package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Co_curricular_objects {
	
	@FindBy(xpath="//*[text()='Co Curricular Achievements']")
	public static WebElement co_curricular;
	
	@FindBy(xpath="//*[text()='Certifications']")
	public static WebElement cerfificate;
	
	@FindBy(xpath="//*[@id='title'][1]")
	public static WebElement title;
	
	@FindBy(xpath="//*[@name='issuing']")
	public static WebElement issuing;
	
	@FindBy(xpath="//*[@name='board_name']")
	public static WebElement board_name;
	
	@FindBy(xpath="//*[@name='scope']")//selection
	public static WebElement scope;
	
	@FindBy(xpath="//*[@name='year']")
	public static WebElement year;
	
	@FindBy(xpath="//*[@title='Select a year']")//selection
	public static WebElement select_year;

	@FindBy(xpath="//*[@title='Select a month']")//selection
	public static WebElement select_month;

    @FindBy(xpath="//table/tbody/tr[3]/td[4]/div")
    public static WebElement select_date;
    
    @FindBy(xpath="//*[text()='Submit']")
    public static WebElement submit;
    
    @FindBy(xpath="//*[text()='Co Curricular Achievements']")
	public static WebElement co_curricular_act;
	
	@FindBy(xpath="//*[text()='Certifications']")
	public static WebElement certificate;
	
	@FindBy(xpath=("//tbody/tr[1]/td[6]/a[1]"))
	public static WebElement pending;
	
	@FindBy(xpath="//*[@class='sidenav-overlay']/preceding::button[1]")
	public static WebElement approve;


}
