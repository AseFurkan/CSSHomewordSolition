package HomeWork;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OdevCss extends BaseDriver {

/*

  1) Bu siteye gidin. -> http://demoqa.com/text-box

  2) Full Name kısmına "Automation" girin.

  3) Email kısmına "Testing@gmail.com" girin.

  4) Current Address kısmına "Testing Current Address" girin.

  5) Permanent Address kısmına "Testing Permanent Address" girin.

  6) Submit butonuna tıklayınız.

  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

*/
    @Test
    public void Test1(){
        String auto="Automation";
        driver.get("http://demoqa.com/text-box");
        MyFunction.Wait(2);

        WebElement name=driver.findElement(By.cssSelector("[class=' mr-sm-2 form-control']"));
        name.sendKeys(auto);
        MyFunction.Wait(2);

        WebElement mail=driver.findElement(By.cssSelector("[class='mr-sm-2 form-control']"));
        mail.sendKeys("Testing@gmail.com");
        MyFunction.Wait(2);

        WebElement CurrentAdress=driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        CurrentAdress.sendKeys("Testing Current Address");
        MyFunction.Wait(2);

        WebElement PermanentAddress=driver.findElement(By.cssSelector("[id='permanentAddress-wrapper'] textarea"));
        PermanentAddress.sendKeys("Testing Permanent Address");
        MyFunction.Wait(2);

        WebElement Submit=driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        Submit.click();
        MyFunction.Wait(2);

        WebElement name2=driver.findElement(By.cssSelector("[class='mt-2 justify-content-end row']+[class='mt-4 row'] [class='mb-1']:nth-child(1)"));
        Assert.assertTrue("Yanlış isim bilgisi", name2.getText().contains(auto));

        WebElement mail2=driver.findElement(By.cssSelector("[class='mt-2 justify-content-end row']+[class='mt-4 row'] [class='mb-1']:nth-child(2)"));
       Assert.assertTrue("Yanlış Mail bilgisi", mail2.getText().contains("Testing"));


        BekleVeKapat();
    }
}
