package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E3CheckBoxes {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();
       WebElement checkBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
       checkBox.click();
       if (checkBox.isSelected()){
           System.out.println("Check box was selected successfully");
       }else{
           System.out.println("Check box was not selected.");
       }

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and @class='cb1-element']"));
       for(WebElement check:checkboxes){
           check.click();
       }

       for(WebElement checkBoxAgain: checkboxes){
           String option = checkBoxAgain.getAttribute("value");
           if(option.equalsIgnoreCase("Option-3")){
               checkBoxAgain.click();
           }
       }
    }
}
