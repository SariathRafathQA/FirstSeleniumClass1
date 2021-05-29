package overviewPage;

import base.ScriptBase;
import controller.OverviewPageController;
import org.testng.annotations.Test;

public class OverviewDisplayTest extends ScriptBase {
    OverviewPageController overviewPageController;
    @Test
    public void verifySpecialTextDisplay(){
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"Special");

    }
    @Test
    public void newProductsTextDisplay(){
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"New products");

    }
    @Test
    public void bestSellersTextDisplay(){
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"Best sellers");

    }
    @Test
    public void ourStoresTextDisplay(){
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"Our stores");

    }
    @Test
    public void contactUsTextDisplay(){
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"Contact us");

    }
    @Test
    public void termsAndConditionTextDisplay(){
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"Terms and conditions of us");

    }
    @Test
    public void aboutUSTextDisplay(){
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"About us");

    }
    @Test
    public void siteMapTextDisplay(){
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"Sitemap");

    }
    @Test
    public void myOrdersTextDisplay(){
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"My orders");

    }
    @Test
    public void myCreditSlipsTextDisplay(){
        overviewPageController=new OverviewPageController(driver);
        overviewPageController.overviewPageInfo(driver,"My credit slips");

    }

}
