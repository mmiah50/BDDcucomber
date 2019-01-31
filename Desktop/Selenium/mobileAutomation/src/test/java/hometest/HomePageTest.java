package hometest;

import common.Base;
import common.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class HomePageTest extends Base {
    HomePage homePage;
    @BeforeMethod
    public void initElements(){
        homePage = PageFactory.initElements(ad, HomePage.class);
    }
    @Test
    public void sportsTest(){
        homePage.setSports();
    }
    @Test
    public void pageSixTest(){
        homePage.setPageSix();
    }
    @Test
    public void menuSearchBoxTest(){
        homePage.setMenuSearchBox();
    }
    @Test
    public void topNewsTest(){
        homePage.setTopNews();
    }
    @Test
    public void menuNewsTest(){
        homePage.setMenuNews();
    }
    @Test
    public void notificationTest(){
        homePage.setNotifications();
    }
    @Test
    public void signUpTest(){
        homePage.setSignUp();
    }
    @Test
    public void photoTest(){
        homePage.setPhotos();
    }
    @Test
    public void photo1Test(){
        homePage.setPhotos1();
    }
    @Test
    public void photo2Test(){
        homePage.setPhoto2();
    }
    @Test
    public void BreakingNewsNotificationTest(){
        homePage.setBreakingNewsNotification();
    }
    @Test
    public void PageSixNotificationsTest(){
        homePage.setPageSixNotifications();
    }
    @Test
    public void SportsNotificationsTest(){
        homePage.setSportsNotifications();
    }
    @Test
    public void EditorPickNotificationsTest(){
        homePage.setEditorPickNotifications();
    }
    @Test
    public void NewYorkMetroNotificationsTest(){
        homePage.setNewYorkMetroNotifications();
    }
}


