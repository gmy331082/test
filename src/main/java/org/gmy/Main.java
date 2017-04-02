package org.gmy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by chenghao on 2017/3/18.
 */
public class Main {
    public static void main(String args[]){
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.baidu.com/");
        driver.findElement(By.xpath(".//*[@id='kw']")).sendKeys("aaaaa");
        driver.findElement(By.xpath(".//*[@id='su']")).click();
        //System.out.println(driver.getPageSource());
        //driver.close();
    }
}
