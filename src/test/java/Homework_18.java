import org.testng.Assert;
import org.testng.annotations.Test;
public class Homework_18 extends BaseTest
{
    @Test (dataProvider = "CorrectLoginProviders", dataProviderClass = BaseTest.class)
    public void playSongTest(String email, String password) throws InterruptedException{
        //Put the email field inside the web page
        enterEmail(email);
        // Put the password inside the web app
        enterPassword(password);
        //Click on the submit button
        clickSubmit();

        Thread.sleep(5000);

        clickPlay();
        Assert.assertTrue(isSongPlaying());
    }
}

