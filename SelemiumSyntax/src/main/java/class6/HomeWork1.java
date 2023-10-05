package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork1 {
    /*
    HW1:

        1.  goto  http://35.175.58.98/handle-iframe.php
        2. click the checkbox
        3.  then select the  baby cat
        4. then enter topic name
        5. all of this must be done in the same order
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();

        //first go to frame 0
        driver.switchTo().frame(0);
        //then switch to inner frame from current frame using index 0
        driver.switchTo().frame(0);
        //now check the box
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        //switch to default content , this gets us to the main page
        driver.switchTo().defaultContent();

        //now switch to iFrame where Animals drop down is present
        driver.switchTo().frame("dropdownIframe"); //get iFrame by id
        // Locate the element with select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
        Select obj = new Select(dropDown);
        obj.selectByValue("babycat");

        //switch to default content , this gets us to the main page
        driver.switchTo().defaultContent();

        //switch to iFrame with Topic input field
        WebElement iFrameElement = driver.findElement(By.xpath("//iframe[@id='textfieldIframe']"));
        driver.switchTo().frame(iFrameElement);
        //locate input element Topic and send some text
        driver.findElement(By.xpath("//input[@name='Topic']")).sendKeys("Selenium iFrames");

    }
}
