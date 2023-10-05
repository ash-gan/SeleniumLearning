package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E1DropDown {

    public static void main(String[] args) {

        /*
        Drop Down
        does this drop down have a select tag ?

        if yes -->  use Select class in selenium to deal with it
        if no --> Deal with it like a normal web element

         Steps:
         1. Locate element (drop down) the select tag using appropriate locator
         2.  to create an object of select class and pass in the webElement
         3. to use methods from select class to select the desired option
                    .byvisibleText("ijk") --> "ijk" is the value you see in the drop down
                    .byvalue("b") -->  value="b" attribute present
                    .byIndex(0)  -->   Here by index

         */

        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        WebElement dropDown = driver.findElement(By.id("select-demo"));
        Select selectDropDown = new Select(dropDown);
//        selectDropDown.selectByVisibleText("Friday");
        selectDropDown.selectByValue("Tuesday");
        selectDropDown.selectByVisibleText("Friday");
        selectDropDown.selectByIndex(2);












    }
}
