package class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3Alert {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        Thread.sleep(2000);
        WebElement alert3 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert3.click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.dismiss();

        WebElement alertWithPrompt = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertWithPrompt.click();
        Alert alertWindow3 = driver.switchTo().alert();
        alertWindow3.sendKeys("I am only human after all");
        Thread.sleep(2000);
        alertWindow3.accept();
    }
}
