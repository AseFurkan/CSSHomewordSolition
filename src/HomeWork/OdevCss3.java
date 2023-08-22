package HomeWork;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OdevCss3 extends BaseDriver {
  /*  3-
1) Bu siteye gidin. -> https://www.snapdeal.com/

2) "teddy bear" aratın ve Search butonuna tıklayın.

3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
    Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

   */

    @Test
    public void Test(){
        driver.get("https://www.snapdeal.com/");
        MyFunction.Wait(2);

        WebElement key=driver.findElement(By.cssSelector("[class='col-xs-20 searchformInput keyword']"));
        key.sendKeys("teddy bear");
        MyFunction.Wait(2);

        WebElement button=driver.findElement(By.cssSelector("[class='searchformButton col-xs-4 rippleGrey']"));
        button.click();
        MyFunction.Wait(2);

        WebElement text=driver.findElement(By.cssSelector("[id='searchMessageContainer'] [class='nnn']"));

        Assert.assertTrue("Doğru sonuç bulunamadı",text.getText().contains("We've got 298 results for teddy bear"));

        BekleVeKapat();

    }
}
