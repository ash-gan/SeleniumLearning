package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E2RadioButtons {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        WebElement radioButton = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));



        radioButton.click();

        boolean status = radioButton.isSelected();

        if(status){
            System.out.println("The radio button Male was selected");
        }else{
            System.out.println("The radio button male was not selected");
        }

        boolean buttonEnabled = radioButton.isEnabled();
        System.out.println(buttonEnabled);

        boolean buttonDisplayed = radioButton.isDisplayed();
        System.out.println("Button displayed " + buttonDisplayed);

        //from age range select 5-15
        List<WebElement> ageRanges = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for(WebElement a: ageRanges){
            String text = a.getAttribute("value");
            if(text.equalsIgnoreCase("5 - 15")){
                a.click();
            };

        }
    }
}
