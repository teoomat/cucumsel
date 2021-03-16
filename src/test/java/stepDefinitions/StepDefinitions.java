package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import static org.junit.Assert.assertEquals;


public class StepDefinitions {

    private WebDriver driver;

    @Before
        public void openChrome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");
    }

    @Given("I have entered {int} into the calculator")
    public void i_have_entered_into_the_calculator(int numb1) {
        WebElement searchBox = driver.findElement(By.name("n01"));
        searchBox.sendKeys("123");
    }

    @Given("I have also entered {int} into the calculator")
    public void i_have_also_entered_into_the_calculator(int numb2) {
        WebElement searchBox1 = driver.findElement(By.name("n02"));
        searchBox1.sendKeys("123");
    }

    @When("I press add")
    public void i_press_add() {
        WebElement button = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[4]/input"));
        button.click();
    }

    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(int result) {
        WebElement searchBox2 = driver.findElement(By.name("answer"));
        boolean svar = searchBox2.isDisplayed();
        assertEquals(svar, true);
    }

}