package testCase;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
public class agregarCarrito {
    public void ingresarPantalla(WebDriver driver) {
        try {
            WebElement rellenar = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div[1]/input"));
            //buscar el articulo de su preferencia


            rellenar.sendKeys("Computadoras");
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            System.out.println("Fallo ingresando el nuevo nombre");
            driver.close();
        }
        try {
            WebElement buscar = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[4]/div/span/input"));
            buscar.click();
            System.out.println("Dio click en buscar");

        } catch (Exception e) {
            System.out.println("Fallo ingresando a buscar");
            driver.close();
        }
        try {
            WebElement laptop = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
            laptop.click();
            System.out.println("Dio click en la laptop que escogió");

        } catch (Exception e) {
            System.out.println("Falló en el click a la laptop");
            driver.close();
        }
        try {
            WebElement agregar = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[9]/div[6]/div[1]/div[4]/div/div/div/div/form/div/div/div/div/div[3]/div/div[13]/div[1]/span/span/span/input"));
            agregar.click();
            System.out.println("Dio click en agregar al carrito");

        } catch (Exception e) {
            System.out.println("Fallo agregando el producto al carrito");
            driver.close();
        }
        try {
            WebElement irCarrito = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input"));
            irCarrito.click();
            System.out.println("Dio click en ir al carrito");

        } catch (Exception e) {
            System.out.println("Fallo agregando en ir al carrito");
            driver.close();
        }
    }
    public void validar(WebDriver driver){
        //Se verifica que haya agregado el producto al carrito, si llego hasta aqui la prueba es exitosa
        try {
            WebElement carrito = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[5]"));
            carrito.click();
            System.out.println("Dio click en el carrito");

        } catch (Exception e) {
            System.out.println("Fallo dando click al carrito");
            driver.close();
        }
        try{
            TimeUnit.SECONDS.sleep(3);
            WebElement nombreLista = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[3]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span[1]/span/span[2]"));
            assertEquals("HP Laptop de 15.6 pulgadas (Intel Pentium Quad-Core N50…", nombreLista.getText());
        }catch (Exception e){
            System.out.println("Fallo validando el texto");
            driver.close();
        }
        try {
            WebElement inicio = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div[1]/a"));
            //click en Amazon
            inicio.click();
        } catch (Exception e) {
            System.out.println("No pudo dar click en el boton de Amazon");
            driver.close();
        }
    }
}
