package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by User on 02/07/2017.
 */
public class Hook extends BaseUtil{

  private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void intialize(){
        System.out.println("starting the browser");
        base.stepInfo = "Chrome Driver";
    }

    @After
    public void tearDown(){
        System.out.println("Closing the browser");
    }
}
