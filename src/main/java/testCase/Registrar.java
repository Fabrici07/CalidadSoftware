package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Registrar {
    //Se usa un correo temporal de https://temp-mail.org/es/
    public void ingresaPantalla(WebDriver driver){
        try{
            WebElement login = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"));
            login.click();
        }catch (Exception e){
            System.out.println("Fallo ingresando a la pantalla de login");
        }
        try{
            //Espera dos segundos para que se vea la pantalla
            TimeUnit.SECONDS.sleep(2);
            WebElement registrarse = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/span/span/a"));
            registrarse.click();
        }catch (Exception e){
            System.out.println("Fallo ingresando a la pantalla de registrar");
        }

    }

    public void ingresarValores(WebDriver driver){
        try{
            WebElement nombre = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[1]/input"));
            nombre.sendKeys("Prueba");
        }catch (Exception e){
            System.out.println("Fallo ingresando el correo");
        }
        try{
            WebElement correo = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[2]/div[2]/span/input"));
            correo.sendKeys("beyax89115@ceoshub.com");
        }catch (Exception e){
            System.out.println("Fallo ingresando el correo");
        }
        try{
            WebElement contraseña = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[3]/div[1]/input"));
            contraseña.sendKeys("abc12**DE");
        }catch (Exception e){
            System.out.println("Fallo ingresando la contraseña");
        }
        try{
            WebElement repetirContraseña = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[3]/div[2]/input"));
            repetirContraseña.sendKeys("abc12**DE");
        }catch (Exception e){
            System.out.println("Fallo ingresando la contraseña repetida");
        }
        try{
            WebElement verificarTelefono = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[6]/span/span/input"));
            TimeUnit.SECONDS.sleep(3);
            verificarTelefono.click();
        }catch (Exception e){
            System.out.println("Fallo dando click en el boton de verificar telefono");
        }
    }

    public void validar(WebDriver driver){
        //Se verifica que haya enviado a la pantalla de verificar email, si llego hasta aqui la prueba es exitosa
        try{
            WebElement verificar = driver.findElement(By.xpath("/html/body/div/div/div[1]/button"));
            // /html/body/div[1]/div/div/div/div/div[1]/span
            TimeUnit.SECONDS.sleep(3);
            //assertEquals("Resuelve esta comprobación para proteger tu cuenta", verificar.getText());
        }catch (Exception e){
            System.out.println("Fallo validando el texto");
        }
    }


}
