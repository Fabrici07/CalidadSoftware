package testCase;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
public class listasPersonalizadas {
    public void ingresaPantalla(WebDriver driver) {
        try {
            WebElement menu = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"));
            Actions action = new Actions(driver);
            action.moveToElement(menu).perform();
        } catch (Exception e) {
            System.out.println("Fallo ingresando a la pantalla cuenta y listas");
            driver.close();
        }
        try {
            WebElement cuenta = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[1]/a[1]/span"));
            cuenta.click();
            System.out.println("Dio click en crear una lista");
        } catch (Exception e) {
            System.out.println("Fallo ingresando en crear una lista");
            driver.close();
        }

        try {
            WebElement rellenar = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div[2]/div[1]/span/input"));
            //elegir un nuevo nombre
            rellenar.sendKeys(Keys.CONTROL, "a");
            rellenar.sendKeys(Keys.DELETE);
            rellenar.sendKeys("Compras grupo");
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            System.out.println("Fallo ingresando el nuevo nombre");
            driver.close();
        }
        try {
            WebElement crearLista = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div[3]/span[3]/span/span/input"));
            //click en crear una lista
            crearLista.click();
        } catch (Exception e) {
            System.out.println("No pudo dar click en el boton de crear una lista");
            driver.close();
        }
        try {
            WebElement amazon = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div[1]/a"));
            //click en Amazon
            amazon.click();
        } catch (Exception e) {
            System.out.println("No pudo dar click en el boton de Amazon");
            driver.close();
        }

    }

    public void validar(WebDriver driver){

        //Se verifica que se haya creado la lista personalizada, si llego hasta aqui la prueba es exitosa
        try{
            WebElement compras = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ul/li[1]/a"));

            TimeUnit.SECONDS.sleep(3);
            compras = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ul/li[1]/a"));
            assertEquals("Compras grupo", compras.getText());
        }catch (Exception e){
            System.out.println("Fallo validando el texto");
            driver.close();
        }
        try {
            WebElement amazon = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div[1]/a"));
            //click en Amazon
            amazon.click();
        } catch (Exception e) {
            System.out.println("No pudo dar click en el boton de Amazon");
            driver.close();
        }
    }
}