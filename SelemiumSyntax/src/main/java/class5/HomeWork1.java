package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@data-toggle='dropdown']")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div/div[2]/div/ul/li"));
        for(WebElement a: elements){
            String country = a.getText();
            if(country.equals("Peru")){
                a.click();
            }
        }
    }
}
