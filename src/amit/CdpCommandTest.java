package amit;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v130.emulation.Emulation;

public class CdpCommandTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
	    DevTools devTools =	driver.getDevTools();
	    devTools.createSession();
	    
	    Map deviceMetrics = new HashMap();
	    
	    deviceMetrics.put("width", 600);
	    deviceMetrics.put("height", 1000);
	    deviceMetrics.put("deviceScaleFactor", 50);
	    deviceMetrics.put("mobile", true);

	    
	    
	    // directly called cdp command
	    driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
	    driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".navbar-toggler")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Library']")).click();
		
		driver.close();
	    

	}

}
