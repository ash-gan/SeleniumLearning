package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/Xpath.php");
        driver.manage().window().maximize();
        WebElement textbox1 = driver.findElement(By.xpath("//input[@id='title']"));
        textbox1.sendKeys("batch17");
        WebElement textbox2 = driver.findElement(By.xpath("//input[@name='title']"));
        textbox2.sendKeys("batch17");

        WebElement textbox3 = driver.findElement(By.xpath("//input[contains(@name, 'security')]"));
        textbox3.sendKeys("whats the color of sun");

        String text = driver.findElement(By.xpath("//label[contains(text(),'Lorem')]")).getText();
        System.out.println(text);

        WebElement textbox4 = driver.findElement(By.xpath("//input[starts-with(@id, 'apiSettings')]"));
        textbox4.sendKeys("Hello World!");

        WebElement email1 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email1.sendKeys("syntaxtester@yahoo.com");
        WebElement email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("syntaxtester@gmail.com");
        WebElement email3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("syntaxtester@hotmail.com");

        //concatenation of two or more attributes
        WebElement field1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("cat");

        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("dog");

        WebElement field1Select = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField1']"));
        field1Select.sendKeys("butterfly");

        WebElement field2Select = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField1']"));
        field2Select.sendKeys("caterpillar");
    }
}
