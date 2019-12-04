package com.sdrahnea.app.service

import com.sdrahnea.app.model.ActionType
import com.sdrahnea.app.model.Scenario
import com.sdrahnea.app.model.Step
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import java.util.concurrent.TimeUnit

open class ScenarioService {

    private lateinit var driver: ChromeDriver

    fun handleLikeChrome(scenario: Scenario) {
        val driverLocation = {}.javaClass.getResource("/drivers/chromedriver-78").path
        System.setProperty("webdriver.chrome.driver", driverLocation)
        val options = ChromeOptions()
        options.setExperimentalOption("excludeSwitches", arrayOf("enable-automation"))
        driver = ChromeDriver(options)

        precessScenario(scenario)

        driver.close()
    }

    private fun precessScenario(scenario: Scenario) {
        for (step in scenario.steps) {
            when (step.action.type) {
                ActionType.NAVIGATE -> navigate(step)
                ActionType.CLICK -> click(step)
                ActionType.SEND_KEYS -> sendKeys(step)
            }
            TimeUnit.SECONDS.sleep(2)
        }

    }

    private fun navigate(step: Step) {
        driver.navigate().to(step.action.value)
    }

    private fun sendKeys(step: Step) {
        driver.findElementByXPath(step.element?.xpath)
                .sendKeys(step.action.value)
    }

    private fun click(step: Step) {
        driver.findElementByXPath(step.element?.xpath)
                .click()
    }

}