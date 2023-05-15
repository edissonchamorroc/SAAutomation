package com.dummi.action;

import com.dummi.selector.SpaceAdvisorSelectors;
import com.dummi.utilities.Convertir;
import com.dummi.utilities.ObtenerFechaEl;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpaceAdvisorActions {

    private static WebDriver driver;

    public static void AbrirNavegadorChrome(String url) {

        //System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }

    public static void logueoConCredenciales(String user, String password) {

        driver.findElement(SpaceAdvisorSelectors.BTN_IN_TO_LOGIN).click();

        driver.findElement(SpaceAdvisorSelectors.INP_USER).sendKeys(user);

        driver.findElement(SpaceAdvisorSelectors.INP_PASS).sendKeys(password);

        driver.findElement(SpaceAdvisorSelectors.BTN_LOGIN).submit();

    }

    public static void seleccionFecha(By selector, String fecha) throws InterruptedException {

        driver.findElement(selector).click();

        buscarMesAnio(
                Convertir.mesNumericoAsString(ObtenerFechaEl.mes(fecha)),
                ObtenerFechaEl.anio(fecha),
                SpaceAdvisorSelectors.TXT_DATE_CALENDAR
        );

        driver.findElement(By.xpath(String.format(SpaceAdvisorSelectors.DAY, ObtenerFechaEl.dia(fecha)))).click();

        driver.findElement(SpaceAdvisorSelectors.BTN_OK).click();

        Thread.sleep(1000);

    }


    public static void buscarMesAnio(String mes, String anio, By selector) {

        boolean esFechaDeseada;

        while (true) {

            WebElement fechaVistaEnCalendario = driver.findElement(selector);

            esperaHastaSerVisible(fechaVistaEnCalendario, 10);

            esFechaDeseada = fechaVistaEnCalendario.getText().equals(mes.concat(" ").concat(anio));

            if (esFechaDeseada) break;

            driver.findElement(SpaceAdvisorSelectors.BTN_NEXT_CALENDAR).click();

        }

    }

    public static void esperaHastaSerVisible(WebElement element, int tiempoDeEspera) {

        WebDriverWait wait = new WebDriverWait(driver, tiempoDeEspera);

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void cerrarDriver(){
        driver.close();
    }

}
