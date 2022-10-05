package step_definitions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepMix {
@Test
    public void test() throws InterruptedException {

    Driver.getDriver().get("https://www.google.co.in/");
    Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    Driver.getDriver().findElement(By.name("q")).sendKeys("selenium");

    List<WebElement> autoSuggest = Driver.getDriver().findElements(By.className("UUbT9"));
    Thread.sleep(3000);

    // print the auto suggest
    for (WebElement a : autoSuggest)
    {
        System.out.println("Values are = " + a.getText());
        if (a.getText().equalsIgnoreCase("selenium webdriver"));
        a.click();
        Thread.sleep(3000);
        break;
    }
    Driver.getDriver().close();
}
}

