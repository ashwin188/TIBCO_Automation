package page.actions;

import org.openqa.selenium.By;
import org.testng.Assert;

import Config.BasePageActions;
import data.VerificationData;
import page.objects.HomePageObjects;

public class HomePageActions extends BasePageActions{
	
	
	public static void topNavActions() {
		verifyText(HomePageObjects.tibcoHome,VerificationData.topNav.tibcoHomeLink, "First top nav link is visible", "tc1");
		verifyText(HomePageObjects.tibcoDoc,VerificationData.topNav.tibcoDocsLink, "Second top nav link is visible", "tc2");
		verifyText(HomePageObjects.tibcoSupport,VerificationData.topNav.tibcoSupLink, "Third top nav link is visible", "tc3");
		verifyText(HomePageObjects.tibcoCommunity,VerificationData.topNav.tibcoCommLink, "Fourth top nav link is visible", "tc4");
		verifyText(HomePageObjects.tibcoContact,VerificationData.topNav.tibcoContactLink, "Fifth top nav link is visible", "tc5");
	}
	
	public static void headerActions(){
	
		elementIsPresent(HomePageObjects.tibcoLogo, "logo is present", "tc6");
		verifyText(HomePageObjects.products,VerificationData.header.productsLink, "Product in the header is visible", "tc7");
		verifyText(HomePageObjects.connectivity,VerificationData.header.connectivityLink, "Connectivity in the header is visible", "tc8");
		verifyText(HomePageObjects.services,VerificationData.header.serviceLink, "Services in the header is visible", "tc9");
		verifyText(HomePageObjects.customers,VerificationData.header.customersLink, "Customers in the header is visible", "tc10");
		verifyText(HomePageObjects.contactUs,VerificationData.header.contactLink, "Contact us in the header is visible", "tc11");
		
	}
	
	public static void productsActions(){
		
		mousehover(HomePageObjects.products, VerificationData.header.productsLink, "Product in the header is visible");
		verifyText(HomePageObjects.interconnect, VerificationData.productsSubLink.interconnect, "Interconnect text is visible", "tc12");
		verifyText(HomePageObjects.data, VerificationData.productsSubLink.data, "Data and systems text is visible","tc13");
		verifyText(HomePageObjects.apis, VerificationData.productsSubLink.api, "API text is visible", "tc14");
		verifyText(HomePageObjects.people, VerificationData.productsSubLink.people, "People and Process text is visible", "tc15");
		verifyText(HomePageObjects.index, VerificationData.productsSubLink.index, "Product indext text is visible", "tc16");
		
		verifyText(HomePageObjects.augment, VerificationData.productsSubLink.augment, "Augment Intelligence text is visible", "tc17");
		verifyText(HomePageObjects.visual, VerificationData.productsSubLink.visual, "Visual analytics text is visible", "tc18");
		verifyText(HomePageObjects.reporting, VerificationData.productsSubLink.reporting, "Reporting text is visible", "tc19");
		verifyText(HomePageObjects.streaming, VerificationData.productsSubLink.streaming, "Streaming analytics text is visible", "tc20");
		
	}
	
	public static void servicesActions() throws InterruptedException{
		mousehover(HomePageObjects.services, VerificationData.header.serviceLink, "Service text is visible");
		verifyText(HomePageObjects.consulting, VerificationData.serviceSubLink.consulting, "Consulting text is visible", "tc21");
		verifyText(HomePageObjects.education, VerificationData.serviceSubLink.education, "Education text is visible", "tc22");
		verifyText(HomePageObjects.support, VerificationData.serviceSubLink.support, "Support text is visible", "tc23");
		Thread.sleep(3000);
	}

	public static void cookieLawActions() throws InterruptedException{
		verifyText(HomePageObjects.cookieDesc, VerificationData.cookiePopup.descPopup, "Cookie law is visible", "tc47");
		verifyText(HomePageObjects.cookieMoreInfo, VerificationData.cookiePopup.morePopup, "More Info text is visible", "tc48");
		verifyText(HomePageObjects.cookieAgree, VerificationData.cookiePopup.agreePopup, "I Agree is visible", "tc49");
		click(HomePageObjects.cookieAgree, "Click on I Agree button", "tc50");
		Thread.sleep(3000);	
		pageDown("Scrolls the whole page to footer");
	}
	
	
	public static void upperFooterActions(){
		verifyTextByindex(HomePageObjects.about,1, VerificationData.upperFooter.aboutup, "About text is visible", "tc24");
		verifyTextByindex(HomePageObjects.news,1, VerificationData.upperFooter.newsup, "News text is visible", "tc25");
		verifyTextByindex(HomePageObjects.events,1, VerificationData.upperFooter.eventsup, "Events text is visible", "tc26");
		verifyTextByindex(HomePageObjects.blog,1, VerificationData.upperFooter.blogup, "Blog text is visible", "tc27");
		verifyTextByindex(HomePageObjects.community,1, VerificationData.upperFooter.communityup, "Community text is visible", "tc28");
		verifyTextByindex(HomePageObjects.partners,1, VerificationData.upperFooter.partnersup, "Partner text is visible", "tc29");
		verifyTextByindex(HomePageObjects.careers,1, VerificationData.upperFooter.careersup, "Careers text is visible", "tc30");
		verifyTextByindex(HomePageObjects.search,1, VerificationData.upperFooter.searchup, "Search text is visible", "tc31");
		verifyTextByindex(HomePageObjects.contact,1, VerificationData.upperFooter.contactup, "contact text is visible", "tc32");
		
		elementIsPresent(HomePageObjects.fb, "Fb logo is present", "tc33");
		elementIsPresent(HomePageObjects.twitter, "Twitter logo is present", "tc34");
		elementIsPresent(HomePageObjects.linkedin, "Linkedin logo is present", "tc35");
		elementIsPresent(HomePageObjects.meetup, "Meetup logo is present", "tc36");
	}
	
	public static void lowerFooterActions(){
		
		verifyText(HomePageObjects.Copyright, VerificationData.lowerFooter.copyrightlf, "Copyright text is visible", "tc37");
		verifyText(HomePageObjects.privacy, VerificationData.lowerFooter.privacylf, "Privacy policy text is visible", "tc38");
		verifyText(HomePageObjects.terms, VerificationData.lowerFooter.termslf, "Terms of use text is visible", "tc39");
		verifyText(HomePageObjects.trademark, VerificationData.lowerFooter.trademarkslf, "Trademark text is visible", "tc40");
	}

	public static void localeDropdown(){
	
		click(HomePageObjects.locale, "click on locale drop down", "tc41");
//		verifyText(HomePageObjects.locale, VerificationData.localeDropdown.engLocale, "English text is visible", "tc42");
//		verifyText(HomePageObjects.locale, VerificationData.localeDropdown.fraLocale, "French text is visible", "tc43");
//		verifyText(HomePageObjects.locale, VerificationData.localeDropdown.deuLocale, "Dutch text is visible", "tc44");
//		verifyText(HomePageObjects.locale, VerificationData.localeDropdown.itaLocale, "Italy text is visible", "tc45");
//		verifyText(HomePageObjects.locale, VerificationData.localeDropdown.spaLocale, "Spanish text is visible", "tc46");
	}

	public static void pageSourceSEO(){
		//Check Meta Title
		
		getAttribute(HomePageObjects.seoTitle, "content", VerificationData.seo.metaTitle, "Meta Title is visible", "tc47");
		getAttribute(HomePageObjects.seoDesc, "content", VerificationData.seo.metaDesc, "Meta Description is visible", "tc48");
		getAttribute(HomePageObjects.seoCanonical, "href", VerificationData.seo.metaCanonical, "Canonical tag is visible", "tc49");
	
		
	    //check GTM
	    boolean b = driver.getPageSource().contains("googletagmanager");
	    Assert.assertTrue(b);
	}
	
}


