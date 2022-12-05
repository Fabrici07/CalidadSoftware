package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

public class iniciarSesion {
    public void ingresaPantalla(WebDriver driver){
        try{
            WebElement login = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"));
            login.click();
        }catch (Exception e){
            System.out.println("Fallo ingresando a la pantalla de login");
            driver.close();
        }
    }
    public void ingresarValores(WebDriver driver){
        try{
            WebElement correo = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]"));
            //Ingresar un correo registrado en amazon
            correo.sendKeys("CREAR SU CORREO DE AMAZON");
        }catch (Exception e){
            System.out.println("Fallo ingresando el correo");
            driver.close();
        }
        try{
            WebElement continuar = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input"));
            continuar.click();
        }catch (Exception e){
            System.out.println("No pudo dar click en el boton de continuar");
            driver.close();
        }
        try{
            WebElement contraseña = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[1]/input"));
            //Ingresar la contraseña de la cuenta de amazon
            contraseña.sendKeys("CREAR SU CONTRASEÑA DE AMAZON");
        }catch (Exception e){
            System.out.println("Fallo ingresando la contraseña");
            driver.close();
        }
        try{
            WebElement botonIniciarSesion = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[2]/span/span/input"));
            botonIniciarSesion.click();
        }catch (Exception e){
            System.out.println("No pudo dar click en el boton de iniciar sesion");
            driver.close();
        }
    }

    public void validar(WebDriver driver){
        //Se verifica que muestre en el nombre en la pagina principal, lo cual significa que la prueba fue exitosa
        try{
            WebElement nombre = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div/span"));
            TimeUnit.SECONDS.sleep(3);
            //Cambiar por el nombre del usuario
            assertEquals(nombre.getText(), "Hola Carlos");
        }catch (Exception e){
            System.out.println("Fallo validando el texto");
            driver.close();
        }
    }
}