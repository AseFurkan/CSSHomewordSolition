package HomeWork;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OdevCss6 extends BaseDriver {
    /*
 6-

 Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html

 Fake Alerts'e tıklayınız.

 Show modal dialog buttonuna tıklayınız.

 Ok'a tıklayınız.

 Alert kapanmalıdır.
  */
    @Test
    public void Test(){
driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunction.Wait(2);


        WebElement fakealert=driver.findElement(By.cssSelector("[href='alerts/fake-alert-test.html']"));
        fakealert.click();
        MyFunction.Wait(2);

        WebElement dialog=driver.findElement(By.cssSelector("[value='Show modal dialog']"));
       dialog.click();
        MyFunction.Wait(2);


        WebElement dialogok=driver.findElement(By.cssSelector("[class='dialog-button']"));
        dialogok.click();
        MyFunction.Wait(2);


        BekleVeKapat();
    }
}
