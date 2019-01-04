import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.annotations.Test;

public class login extends commonApi{

    @Test
    public void login() throws InterruptedException{
        getDriver();

        PageObject SignintoFB = PageFactory.initElements(driver, PageObject.class);
        SignintoFB.Email("miah_monir@yahoo.com");
        SignintoFB.pwd("bsjhbsjkgfjsGJDAKBSA");
        SignintoFB.play();
//        Thread.sleep(3000);
//        SignintoFB.Nav();
//        SignintoFB.lout();




    }





}



