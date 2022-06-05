import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
    Basement bm = new Basement();//instantiation
    @Before
    public void ChooseBrowser(){
        bm.openbrowser("chrome");
    }


    @After
    public void teardown(){
        //bm.closeBrowser();

    }
}
