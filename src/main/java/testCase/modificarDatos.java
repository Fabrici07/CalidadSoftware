package testCase;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
public class modificarDatos {
    public void ingresaPantalla(WebDriver driver) {
        try {
            WebElement menu = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"));
            Actions action = new Actions(driver);
            action.moveToElement(menu).perform();
        } catch (Exception e) {
            System.out.println("Fallo ingresando a la pantalla Cuenta y Listas");
            driver.close();
        }
        try {
            WebElement cuenta = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[2]/a[1]/span"));
            cuenta.click();
            System.out.println("Dio click en cuenta");

        } catch (Exception e) {
            System.out.println("Fallo ingresando a Tu Cuenta");
            driver.close();
        }
        try {
            WebElement perfiles = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[3]/a/div/div/div"));
            //click en Tus perfiles
            perfiles.click();
        } catch (Exception e) {
            System.out.println("No pudo dar click en el boton de Tus perfiles");
            driver.close();
        }
        try {
            WebElement perfil = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[1]/form/div/div/span/a/div/div[2]"));
            //click en perfil activo
            perfil.click();
        } catch (Exception e) {
            System.out.println("No pudo dar click en el boton de perfil activo");
            driver.close();
        }
        try {
            WebElement modificar = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/div/div[1]/div/span/a"));
            //click en editar
            modificar.click();
        } catch (Exception e) {
            System.out.println("No pudo dar click en el boton de editar");
            driver.close();
        }
        try {
            WebElement rellenar = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div[1]/input[3]"));
            //elegir un nuevo nombre
            rellenar.click();
            rellenar.sendKeys(Keys.CONTROL, "a");
            rellenar.sendKeys(Keys.DELETE);
            TimeUnit.SECONDS.sleep(4);
            rellenar.sendKeys("Carlos Zumbado Cárdenas");
        } catch (Exception e) {
            System.out.println("Fallo ingresando el nuevo nombre");
            driver.close();
        }
        try {
            TimeUnit.SECONDS.sleep(3);
            WebElement guardarCambios = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div[2]/span/span/input"));
            //click en guardar cambios
            guardarCambios.click();
        } catch (Exception e) {
            System.out.println("No pudo dar click en el boton de Guardar cambios");
            driver.close();
        }
    }

    public void validar(WebDriver driver){
        //Se verifica que haya enviado a la pantalla de verificar email, si llego hasta aqui la prueba es exitosa
        try{
            WebElement verificar = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/div/div[1]/div/h1"));
            // /html/body/div[1]/div/div/div/div/div[1]/span
            TimeUnit.SECONDS.sleep(3);
            verificar = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/div/div[1]/div/h1"));
            assertEquals("Carlos Zumbado Cárdenas", verificar.getText());
        }catch (Exception e){
            System.out.println("Fallo validando el texto");
            driver.close();
        }
        try {
            WebElement inicio = driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div[1]/div[1]/a"));
            //click en Amazon
            inicio.click();
        } catch (Exception e) {
            System.out.println("No pudo dar click en el boton de Amazon");
            driver.close();
        }

    }

}

