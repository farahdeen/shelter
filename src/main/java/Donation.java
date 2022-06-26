import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Donation extends Basement {
    public Donation() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'England')]")
    private WebElement option_england;
    @FindBy(xpath = "//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/span[1]")
    private WebElement click_donate_element;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/main[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[1]/button[1]")
    private WebElement donate_once_element;
    @FindBy(xpath = "//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/main[@id='main']/section[1]/div[1]/div[2]/div[1]/form[1]/div[2]/button[1]")
    private WebElement click_10pound_amount;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/main[1]/section[1]/div[1]/div[2]/div[1]/form[1]/button[1]")
    private WebElement click_donate_button_element_in_donationpage;
    @FindBy(id = "email")
    private WebElement enter_email_textbox_element;
    @FindBy(id = "civility")
    private WebElement choose_title_element;


    public void shelter_home_page() {
        driver.get("https://england.shelter.org.uk/");
        driver.findElement(By.xpath("//*[@id=\"ccc-notify-reject\"]")).click();

    }

    public void click_donate_method_in_homapage() {

        click_donate_element.click();

    }


    public void verify_donation_page_method() {
        String check = new String("https://england.shelter.org.uk/donate");
        String url = new String(driver.getCurrentUrl());
        System.out.println(url.equals(check));
        System.out.println(driver.getCurrentUrl());
    }

    public void click_donate_once_method() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[2]/div[1]/main[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[1]/button[1]")));

        donate_once_element.click();
    }

    public void click_amount_method() {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='___gatsby']/div[@id='gatsby-focus-wrapper']/main[@id='main']/section[1]/div[1]/div[2]/div[1]/form[1]/div[2]/button[1]")));
        click_10pound_amount.click();
    }

    public void donate_button_method_in_doantion_page() {
        click_donate_button_element_in_donationpage.click();
    }

    public void verify_customer_detail_page_method() {
        WebElement strValue = driver.findElement(By.xpath("//h2[contains(text(),'Your details')]"));
        String strExpected = "Your details";
        String strActual = strValue.getText();
        System.out.println(strActual);
        if (strExpected.equals(strActual)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are NOT equal");
        }

    }

    public void enter_email_address_method() {
        enter_email_textbox_element.sendKeys("deensfr@hotamill.com");
    }

    public void choose_title_method() {
        //   choose_title_element.click();
        Select title = new Select(choose_title_element);
        title.selectByVisibleText("Mr");
    }

    //testing radio button
    public void stay_touch_choice_method() {
        driver.findElement(By.xpath("//*[@id=\"fieldset-step2\"]/div[2]/div/div[2]/fieldset/div/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"fieldset-step2\"]/div[2]/div/div[3]/fieldset/div/input[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[5]/form/div[2]/div/div[2]/div/fieldset/div[2]/div/div[4]/fieldset/div/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"fieldset-step2\"]/div[2]/div/div[5]/fieldset/div/input[2]")).click();
    }
    public void method4_empty_field (){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
    }
    //delte the code below , copy and pasted same code from above for learning git
}

