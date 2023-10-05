package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E1iFrames {

    public static void main(String[] args) {

        /*
          1. first switch to required iFrame where the element is present
          2. switch to another iFrame for nested iFrame elements
          3. locate and click
          4. Switch to default page
          5. Switch to another iFrame
         */

        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//iframe[@id='textfieldIframe']"));
        driver.switchTo().frame(frame);
        WebElement element = driver.findElement(By.xpath("//input[@name='Topic']"));
        element.sendKeys("Hello");

        //inner frame nested frame
        WebElement nestedFrame =  driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(nestedFrame);
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        driver.switchTo().defaultContent();
        //switch using web lement
        WebElement dropDwonIframe = driver.findElement(By.xpath("//iframe[@id='dropdownIframe']"));
        driver.switchTo().frame(dropDwonIframe);

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
        Select newObj = new Select(dropDown);
        newObj.selectByVisibleText("Baby Cat");
    }
}
