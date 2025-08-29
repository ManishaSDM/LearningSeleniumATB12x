package com.thetestingacademy.SeleniumTask;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class Idrive_Mini_Project {

    @Description("TC#1 - Verify that username and password expired then error message option of upgrade now is displayed!")
    @Owner("Manisha S")
    @Severity(SeverityLevel.BLOCKER)
    @Test

    public void test_idrive360_login(){

       ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");
        // Maximize the window
        driver.manage().window().maximize();

        // Step 1 - Find the username and enter the augtest_040823@idrive.com.
        // Step 2 - Find the Password  and enter the 123456.
        // Step 3 - Find the Signin button  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message option of "upgrade now" and print button lable


        // Step 1 - Find the username and enter the augtest_040823@idrive.com.
        //<input _ngcontent-dnl-c168="" type="email"
        // /id="username" name="username"
        // //autofocus="" class="id-form-ctrl ng-pristine ng-valid ng-touched">
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
                //driver.findElement(By.id("username"));
        //
           username.sendKeys("augtest_040823@idrive.com");

        // Step 2 - Find the Password  and enter the 123456.
        //<input _ngcontent-dnl-c168=""
        // //id="password" name="password" tabindex="0"
        // //maxlength="20" class="id-form-ctrl ng-pristine ng-valid ng-touched" type="password">
        WebElement logpass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        logpass.sendKeys("123456");

        // Step 3 - Find the Signin button  and click on the button.
        //<button _ngcontent-dnl-c168=""
        // type="submit" id="frm-btn"
        // class="id-btn id-info-btn-frm">Sign in</button>

        WebElement Btn_Signin=driver.findElement(By.id("frm-btn"));
        Btn_Signin.click();


        // Step 4 - Wait some time.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Step 5 - Verify the message option of "upgrade now".
        //<button _ngcontent-joh-c152=""
        // class="id-btn id-warning-btn-drk id-tkn-btn"
        // style="display: block;">Upgrade Now!</button>


        //WebElement Btn_Upgrade= driver.findElement(By.className("id-btn id-warning-btn-drk id-tkn-btn"));

        WebElement upgrade_btn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'Upgrade Now!')]")));

       // Verify the label using an assertion
        Assert.assertEquals(upgrade_btn.getText(),"Upgrade Now!");
        System.out.println(upgrade_btn.getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

          driver.quit();
    }
}
