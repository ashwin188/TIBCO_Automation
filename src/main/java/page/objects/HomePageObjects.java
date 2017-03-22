package page.objects;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {
	
	//TOP NAV
	@FindBy(xpath = "//*[@id='block-globalnavigation']/ul/li/span/a")
	public static WebElement tibcoHome;
	
	@FindBy(xpath = "//*[@id='block-globalnavigation']/ul/li/ul/li[1]/span/a")
	public static WebElement tibcoDoc;
	
	@FindBy(xpath = "//*[@id='block-globalnavigation']/ul/li/ul/li[2]/span/a")
	public static WebElement tibcoSupport;

	@FindBy(xpath = "//*[@id='block-globalnavigation']/ul/li/ul/li[3]/span/a")
	public static WebElement tibcoCommunity;
	
	@FindBy(xpath = "//*[@id='block-globalnavigation']/ul/li/ul/li[4]/span/a")
	public static WebElement tibcoContact;
	
	
	
	
	//logo and Header
	
	@FindBy(xpath = "//section [@class='mainLogo']")
	public static WebElement tibcoLogo;
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[1]/span/a")
	public static WebElement products;
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[2]/span/a")
	public static WebElement connectivity;
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[3]/span/a")
	public static WebElement services;
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[4]/span/a")
	public static WebElement customers;
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[5]/span/a")
	public static WebElement contactUs;
	
	
	
	//Products sub links
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[1]/ul/li[1]/span/a")
	public static WebElement interconnect;
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[1]/ul/li[1]/ul/li[1]/span/a")
	public static WebElement data;
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[1]/ul/li[1]/ul/li[2]/span/a")
	public static WebElement apis;
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[1]/ul/li[1]/ul/li[3]/span/a")
	public static WebElement people;
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[1]/ul/li[3]/span/a")
	public static WebElement index;
	
	
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[1]/ul/li[2]/span/a")
	public static WebElement augment;
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[1]/ul/li[2]/ul/li[1]/span/a")
	public static WebElement visual;
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[1]/ul/li[2]/ul/li[2]/span/a")
	public static WebElement reporting;
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[1]/ul/li[2]/ul/li[3]/span/a")
	public static WebElement streaming;
	
	
	
	//Services
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[3]/ul/li[1]/span/a")
	public static WebElement consulting;
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[3]/ul/li[2]/span/a")
	public static WebElement education;
	
	@FindBy(xpath = "//*[@id='block-mainnavigation']/ul/li[3]/ul/li[3]/span/a")
	public static WebElement support;
	

	
	//Footer
	@FindBy(xpath = "//*[@id='block-footersitemap']/ul/li[1]/a")
	public static List <WebElement> about;
	
	@FindBy(xpath = "//*[@id='block-footersitemap']/ul/li[2]/a")
	public static List <WebElement> news;
	
	@FindBy(xpath = "//*[@id='block-footersitemap']/ul/li[3]/a")
	public static List <WebElement> events;
	
	@FindBy(xpath = "//*[@id='block-footersitemap']/ul/li[4]/a")
	public static List <WebElement> blog;
	
	@FindBy(xpath = "//*[@id='block-footersitemap']/ul/li[5]/a")
	public static List <WebElement> community;
	
	@FindBy(xpath = "//*[@id='block-footersitemap']/ul/li[6]/a")
	public static List <WebElement> partners;
	
	@FindBy(xpath = "//*[@id='block-footersitemap']/ul/li[7]/a")
	public static List <WebElement> careers;
	
	@FindBy(xpath = "//*[@id='block-footersitemap']/ul/li[8]/a")
	public static List <WebElement> search;
	
	@FindBy(xpath = "//*[@id='block-footersitemap']/ul/li[9]/a")
	public static List <WebElement> contact;
	
	@FindBy(xpath = "//*[@id='block-sociallinks']/ul/li[1]/a/span")
	public static WebElement fb;
	
	@FindBy(xpath = "//*[@id='block-sociallinks']/ul/li[2]/a/span")
	public static WebElement twitter;
	
	@FindBy(xpath = "//*[@id='block-sociallinks']/ul/li[3]/a/span")
	public static WebElement linkedin;
	
	@FindBy(xpath = "//*[@id='block-sociallinks']/ul/li[4]/a/span")
	public static WebElement meetup;
	
	
	//lower Footer
	
	@FindBy(xpath = "//*[@id='footer-links']/div/div[1]/h6")
	public static WebElement Copyright;
	
	@FindBy(xpath = "//*[@id='footer-links']/div/div[1]/ul/li[1]/a")
	public static WebElement privacy;
	
	@FindBy(xpath = "//*[@id='footer-links']/div/div[1]/ul/li[2]/a")
	public static WebElement terms;
	
	@FindBy(xpath = "//*[@id='footer-links']/div/div[1]/ul/li[3]/a")
	public static WebElement trademark;
	
	
	//locale drop down
	
	@FindBy(xpath = "//*[@id='block-languageswitcher']/select")
	public static WebElement locale;
	
	@FindBy(xpath = "//*[@id='block-languageswitcher']/select/option[1]")
	public static WebElement english;
	
	@FindBy(xpath = "//*[@id='block-languageswitcher']/select/option[2]")
	public static WebElement french;
	
	@FindBy(xpath = "//*[@id='block-languageswitcher']/select/option[3]")
	public static WebElement deutsch;
	
	@FindBy(xpath = "//*[@id='block-languageswitcher']/select/option[4]")
	public static WebElement italian;
	
	@FindBy(xpath = "//*[@id='block-languageswitcher']/select/option[5]")
	public static WebElement spanish;
	
	
	
	//Cookies enable popup
	@FindBy(xpath = "//*[@id='popup-text']/p")
	public static WebElement cookieDesc;
	
	@FindBy(xpath = "//*[@id='popup-buttons']/div/button[1]")
	public static WebElement cookieMoreInfo;
	
	@FindBy(xpath = "//*[@id='popup-buttons']/div/button[2]")
	public static WebElement cookieAgree;
	
	
	
	//SEO
	
	@FindBy(xpath = "//meta[@name='description']")
	public static WebElement seoTitle;
	
	@FindBy(xpath = "//meta[@name='title']")
	public static WebElement seoDesc;
	
	@FindBy(xpath = "//link[@rel='canonical']")
	public static WebElement seoCanonical;
	
	
}




