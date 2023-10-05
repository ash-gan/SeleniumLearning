package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class E2WindowHandles {

    public static void main(String[] args) {

        //When links are clicked browsers open new tabs , so this is to address handling of that in selenium

        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AYZoVhe4H56rWtZmI74UCHAp6AiI17si2s6fSQ_4JTF7sQnNcLPDFRNHvK25inXOVDFgGso19zB9PQ&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S184618824%3A1696465511574284&theme=glif");
        driver.findElement(By.linkText("Help")).click();
        driver.findElement(By.linkText("Privacy")).click();
        Set<String> newSet = driver.getWindowHandles();

        for(String windowHandle:newSet){
            driver.switchTo().window(windowHandle);
            String title = driver.getTitle();
            if(title.contains("Privacy")){
                System.out.println(driver.getTitle());
                break;
            }
        }

        String paragraph = driver.findElement(By.xpath("//p[@class='q0cs9b']")).getText();
        System.out.println(paragraph);

    }
}
