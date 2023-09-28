package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox' and @value='Checkbox-1']"));
        boolean isCheckBoxEnabled = checkbox1.isEnabled();
        if(!isCheckBoxEnabled){
            driver.findElement(By.xpath("//button[@id='enabledcheckbox']")).click();
        }
        boolean isCheckBoxEnabledNow = checkbox1.isEnabled();
        if(isCheckBoxEnabledNow){
            checkbox1.click();
        }
        if(checkbox1.isSelected()){
            System.out.println("Checkbox 1 is selected successfully");
        }else{
            System.out.println("Check box 1 is not selected.");
        }
    }
}
