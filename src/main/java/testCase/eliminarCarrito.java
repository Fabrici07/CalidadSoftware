package testCase;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
public class eliminarCarrito {
    public void ingresarPantalla(WebDriver driver) {
     try{

        WebElement eliminar = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[3]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span/input"));
        eliminar.click();
        System.out.println("Dio click en eliminar");

    } catch(
    Exception e)

    {
        System.out.println("Fallo dando click al boton eliminar");
        driver.close();
    }
}
}
