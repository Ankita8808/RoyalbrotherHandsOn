package royalTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hybridRoyal.capabilitiesRoyal;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class royalClassTest extends capabilitiesRoyal {

	AndroidDriver<AndroidElement>driver;
	@BeforeTest
	public void bt() throws MalformedURLException {
		driver = capability();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)	;
		}
	@Test
	public void skipTest() throws InterruptedException {
	
			
			driver.findElement(MobileBy.xpath("//*[@text='SKIP']")).click();	
			//driver.findElement(MobileBy.xpath("//*[@text='Select City']")).click();
			Thread.sleep(2000);
			driver.findElement(MobileBy.xpath("//*[@text='BANGALORE']")).click();	
			//driver.findElement(MobileBy.xpath("//*[@text='VIEW ALL']")).click();
			Thread.sleep(2000);
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Royal Enfield Meteor Supernova 350\"))").click();
			Thread.sleep(2000);
			driver.findElement(MobileBy.xpath("//*[@text='7 DAYS']")).click();
			Thread.sleep(2000);		
		   // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"BOOK NOW\"))");	
			driver.findElement(MobileBy.xpath("//*[@text='HOME']")).click();	
			driver.findElement(MobileBy.xpath("//*[@text='Offers']")).click();
			Thread.sleep(2000);	
			driver.findElement(MobileBy.xpath("//*[@text='FIRSTRIDE']")).click();
			Thread.sleep(2000);	
			driver.findElement(MobileBy.xpath("//*[@text='T&C']")).click();
			Thread.sleep(2000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(5000);	
			driver.findElement(MobileBy.xpath("//*[@text='VIEW ALL']")).click();
			Thread.sleep(2000);
			driver.findElement(MobileBy.xpath("//*[@text='Search by Model']")).click();
			Thread.sleep(2000); 
			 driver.findElement(MobileBy.xpath("//*[@text='Honda Activa 6G']")).click();
				Thread.sleep(2000);
				driver.closeApp();
		}
	}
