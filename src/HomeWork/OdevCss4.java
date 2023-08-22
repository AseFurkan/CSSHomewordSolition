package HomeWork;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OdevCss4 extends BaseDriver {
    /*
    4-

Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Calculate'e tıklayınız.

İlk input'a herhangi bir sayı giriniz.

İkinci input'a herhangi bir sayı giriniz.

Calculate button'una tıklayınız.

Sonucu alınız.

Sonucu yazdırınız.

     */
    @Test
    public void Test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunction.Wait(2);

        WebElement calculate=driver.findElement(By.cssSelector("[href='calculator']"));
        calculate.click();
        MyFunction.Wait(2);

        WebElement Number1=driver.findElement(By.cssSelector("[name='number1']"));
        Number1.sendKeys("5");
        MyFunction.Wait(2);

        WebElement Number2=driver.findElement(By.cssSelector("[name='number2']"));
        Number2.sendKeys("53");
        MyFunction.Wait(2);

        WebElement button=driver.findElement(By.cssSelector("[class='styled-click-button']"));
        button.click();

        WebElement value=driver.findElement(By.cssSelector("id='answer'"));

        System.out.println(value);
        //Assert.assertTrue("Dikkat Yanlış hesaplandı",value.getText().equals());
        BekleVeKapat();
    }
}
