package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1CSSSelector {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/cssSelector.php");
        driver.manage().window().maximize();

        //Learning css selector way for id -->   tagname[attribute='value']
        WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("syntax student");

        //Learning css selector way for id shortcut   tagname#value
        WebElement profileInput = driver.findElement(By.cssSelector("input#profileBox"));
        profileInput.sendKeys("syntaxstudent@email.com");


        //Learning css selector with attribute -->    tagname[attribute='value']
        WebElement feedback1 = driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedback1.sendKeys("website isn't working");

        //Learning css selector with class name  -->     tagname.classname   If there is a space in class name replace it with .
        WebElement feedback2 = driver.findElement(By.cssSelector("input.feedbackBox2"));
        feedback2.sendKeys("Now it's working after the fix.");


        //Learning css selector with method contains short cut *    tagname[attribute*='value']
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("Selenium Basics");

        //Learning css selector with method starts-with shortcut ^    tagname[attribute^='value']
        WebElement advancedCSS = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        advancedCSS.sendKeys("Learning CSS Selector");

        //Learning css selector with method ends-with shortcut ^    tagname[attribute$='value']
        WebElement conclusionCSS = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusionCSS.sendKeys("Wrapping CSS Selector");

    }
}
