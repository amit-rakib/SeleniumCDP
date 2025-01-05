package Practice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        // Set up ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();

        // Start a DevTools session
        devTools.createSession();

        // Emulate a mobile device
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("width", 600);
        mobileEmulation.put("height", 1000);
        mobileEmulation.put("deviceScaleFactor", 50);
        mobileEmulation.put("mobile", true);

        driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", mobileEmulation);

        // Wait for the environment to load
        Thread.sleep(3000);

        // Navigate to the website
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        Thread.sleep(3000);

        // Click the hamburger menu
        driver.findElement(By.cssSelector(".navbar-toggler")).click();
        Thread.sleep(3000);

        // Click on the "Library" link
        driver.findElement(By.xpath("//a[normalize-space()='Library']")).click();
        Thread.sleep(3000);

        // Close the browser
        driver.close();
    }
}


