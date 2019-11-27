package com.sdrahnea.app.controller

import com.sdrahnea.app.model.ResultDto
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/selenium"])
class SeleniumController {

//    private lateinit var driver: ChromeDriver

    @RequestMapping(method = [RequestMethod.GET])
    fun call(): ResultDto {

        System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome")
        val driver = ChromeDriver()

//        System.setProperty("webdriver.gecko.driver", "/usr/bin/firefox")
//        val driver = FirefoxDriver()

        driver.get("www.google.com")

        driver.close()

        return ResultDto("oki")
    }

}