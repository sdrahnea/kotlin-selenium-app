import org.openqa.selenium.chrome.ChromeDriver
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import java.nio.file.Path
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeOptions
import java.util.concurrent.TimeUnit


@SpringBootApplication
@EnableJpaRepositories
@EntityScan("com.sdrahnea.app")
@ComponentScan("com.sdrahnea.app")
class MainService

fun main(args: Array<String>) {
//    SpringApplication.run(MainService::class.java, *args)
//        System.setProperty("webdriver.gecko.driver", "/usr/bin/firefox")
//        val driver = FirefoxDriver()


    val driverLocation = {}.javaClass.getResource("/drivers/chromedriver-78").path
    System.setProperty("webdriver.chrome.driver", driverLocation)
    val options = ChromeOptions()
    options.setExperimentalOption("excludeSwitches", arrayOf("enable-automation"))
    val driver = ChromeDriver(options)

    driver.navigate().to("url")
    TimeUnit.SECONDS.sleep(2)

    driver.findElementByXPath("/html/body/div/div/div/div/div[2]/div/div/form/div[1]/div/div[1]/div/input")
            .sendKeys("email@email.com")
    TimeUnit.SECONDS.sleep(2)

    driver.findElementByXPath("/html/body/div/div/div/div/div[2]/div/div/form/div[2]/div/div[1]/div/input")
            .sendKeys("password")
    TimeUnit.SECONDS.sleep(2)

    driver.findElementByXPath("/html/body/div/div/div/div/div[2]/div/div/form/button/div")
            .click()
    TimeUnit.SECONDS.sleep(10)

    driver.close()
}
