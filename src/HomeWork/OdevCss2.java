package HomeWork;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OdevCss2 extends BaseDriver {
    /*
1) Bu siteye gidin. -> https://demo.applitools.com/

2) Username kısmına "ttechno@gmail.com" girin.

3) Password kısmına "techno123." girin.

4) "Sign in" buttonunan tıklayınız.

5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.


     */
    @Test
    public void Test(){
        driver.get("https://demo.applitools.com/");
        MyFunction.Wait(2);

        WebElement username=driver.findElement(By.cssSelector("[class='form-control'][placeholder='Enter your username']"));
        username.sendKeys("ttechno@gmail.com");
        MyFunction.Wait(2);

        WebElement password=driver.findElement(By.cssSelector("[class='form-control'][placeholder='Enter your password']"));
       password.sendKeys("techno123.");
        MyFunction.Wait(2);


        WebElement Login=driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        Login.click();
        MyFunction.Wait(2);

        WebElement Text=driver.findElement(By.cssSelector("[style='text-align: center;font-size: x-large;color:red']"));
        MyFunction.Wait(2);

        Assert.assertTrue("Hatalı  zaman ",Text.getText().contains("Your nearest branch closes in: 30m 5s"));
        BekleVeKapat();
    }
}
