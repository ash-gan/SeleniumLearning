package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));

        for(WebElement checkBox: checkBoxes){
            String option = checkBox.getAttribute("value");
            if(option.equals("Checkbox-1")){
                boolean state = checkBox.isEnabled();
                if(!state){
                    WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
                    enableBtn.click();
                    boolean isCheckBoxEnabledNow = checkBox.isEnabled();
                    if(isCheckBoxEnabledNow){
                        checkBox.click();
                    }

                    //last part
                    if(checkBox.isSelected()){
                        System.out.println("Checkbox 1 is selected successfully");
                    }else{
                        System.out.println("Check box 1 is not selected.");
                    }
                }
            }
        }

    }
}
