package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class E2MultipleDD {

    /*

    1. Locate the WebElement --> Select Tag
    2. Create an object of select class and pass in the WebElement(dd)
    3. Use available methods to select the desired value

        byIndex()
        byVisibleText()
        byValue()

        multiselect additional methods --->



     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        WebElement dropDown = driver.findElement(By.xpath("//select[@name='States']"));
        Select actualDropDown = new Select(dropDown);
        actualDropDown.selectByIndex(4);
        actualDropDown.selectByIndex(5);
        actualDropDown.selectByIndex(6);
        Thread.sleep(2000);
        actualDropDown.deselectByValue("Texas");
        System.out.println(actualDropDown.isMultiple());

        List<WebElement> res = actualDropDown.getAllSelectedOptions();
        System.out.println(res);
    }
}
