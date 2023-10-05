package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HomeWork2 {

    /*
    1. goto gmail.com
    2. click on help
    3. click on privacy
    4. click on terms
    5. switch the focus on terms page and get the title and print on screen
    6. then switch the focus back to the gmail page
    7. and print the title of the main page on screen
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AYZoVhe4H56rWtZmI74UCHAp6AiI17si2s6fSQ_4JTF7sQnNcLPDFRNHvK25inXOVDFgGso19zB9PQ&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S184618824%3A1696465511574284&theme=glif");
        driver.findElement(By.linkText("Help")).click();
        driver.findElement(By.linkText("Privacy")).click();
        driver.findElement(By.linkText("Terms")).click();

        //get the main handle and save it in variable
        String mainHandle = driver.getWindowHandle();

        Set<String> openHandles =  driver.getWindowHandles();
        for(String handle: openHandles){
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if(title.contains("Terms of Service")){
                System.out.println(title);
                break;
            }
        }

        //switch back to main handle
        driver.switchTo().window(mainHandle);
        System.out.println(driver.getTitle());
    }

}
