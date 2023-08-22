package HomeWork;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OdevCss5 extends BaseDriver {
    /*

Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Fake Alerts' tıklayınız.

Show Alert Box'a tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.

     */

    @Test
    public void Test()
    {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunction.Wait(2);

        WebElement fakealert=driver.findElement(By.cssSelector("[href='alerts/fake-alert-test.html']"));
        fakealert.click();
        MyFunction.Wait(2);

        WebElement showalert=driver.findElement(By.cssSelector("[value='Show alert box']"));
        showalert.click();
        MyFunction.Wait(2);


        WebElement okbutton=driver.findElement(By.cssSelector("[class='dialog-button']"));
        okbutton.click();
        MyFunction.Wait(2);

        BekleVeKapat();
    }
}
