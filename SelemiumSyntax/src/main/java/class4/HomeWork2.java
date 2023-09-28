package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
        WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@type='radio' and @value='gender-female']"));
        boolean buttonDisplayed  = femaleRadioButton.isDisplayed();
        System.out.println(buttonDisplayed);
        if(buttonDisplayed){
            driver.findElement(By.xpath("//button[text()='Show Buttons']")).click();
        }
        if(buttonDisplayed){
            System.out.println("Button is hidden successfully now");
        }else{
            System.out.println("Button is not still hidden");
        }
    }
}
