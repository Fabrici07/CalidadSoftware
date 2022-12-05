package testCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        //Establece la ubicacion del driver
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        //Inicializa el chrome driver
        WebDriver driver = new ChromeDriver();
        //Si no encuentra el elemento en 30 segundos la prueba fallara
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Abre la url
        driver.get("https://www.amazon.com");
        //Maximiza la pantalla
        driver.manage().window().maximize();

        //Registrarse
        /*Registrar registrar = new Registrar();
        try {
            registrar.ingresaPantalla(driver);
        }
        catch (Exception e){
            System.out.println("Fallo al ingresar a la pantalla de login");
            driver.close();
        }
        try{
            registrar.ingresarValores(driver);
        }catch (Exception e){
            System.out.println("Fallo al ingresar la informacion");
            driver.close();
        }
        try{
            registrar.validar(driver);
        }catch (Exception e){
            System.out.println("Fallo al validar");
            driver.close();
        }*/

        //Se inicializa la clase de iniciar sesion
        iniciarSesion iniciar = new iniciarSesion();

        try {
            iniciar.ingresaPantalla(driver);
        } catch (Exception e) {
            System.out.println("Fallo ingresando al login");
            driver.close();
        }

        try {
            iniciar.ingresarValores(driver);
        } catch (Exception e) {
            System.out.println("Fallo ingresando los valores");
            driver.close();
        }

        try {
            iniciar.validar(driver);
        } catch (Exception e) {
            System.out.println("Fallo validando la accion");
            driver.close();
        }

        modificarDatos modificar = new modificarDatos();

        try {
            modificar.ingresaPantalla(driver);
        } catch (Exception e) {
            System.out.println("Fallo ingresando al login");
            driver.close();
        }

        try {
            modificar.validar(driver);
        } catch (Exception e) {
            System.out.println("Fallo validando el cambio");
            driver.close();
        }

        listasPersonalizadas listas = new listasPersonalizadas();

        try {
            listas.ingresaPantalla(driver);
        } catch (Exception e) {
            System.out.println("Fallo ingresando al login");
            driver.close();
        }

        try {
            listas.validar(driver);
        } catch (Exception e) {
            System.out.println("Fallo ingresando al login");
            driver.close();
        }
        agregarCarrito agregar = new agregarCarrito();

        try {
            agregar.ingresarPantalla(driver);
        } catch (Exception e) {
            System.out.println("Fallo ingresando al login");
            driver.close();
        }

        try {
            driver.close();
            System.out.println("Se cerro el web driver");
        } catch (Exception e) {
            System.out.println("Falló cerrando el driver");
        }


    }
}


