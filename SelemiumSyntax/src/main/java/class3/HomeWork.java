package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys("Syntax Student");

        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("syntaxtstudent@syntax.com");

        WebElement currentAddress = driver.findElement(By.xpath("//textarea[contains(@placeholder,'Current')]"));
        currentAddress.sendKeys("890 Main St, \nBristol, \nConnecticut , \nUnited States Of America - 06053");

        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[starts-with(@id,'permanent')]"));
        permanentAddress.sendKeys("850 Farmington Ave, \nNew Britain, \nConnecticut , \nUnited States Of America - 06053");

        WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submitButton.click();
    }
}
