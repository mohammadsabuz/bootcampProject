package mainAmazon;

import base.CommonAPI;

public class OfficeProducts extends CommonAPI {

    public void CategoriesOfficeProducts(){
        clickByXpath("//option[@value='search-alias=office-products']");
        typeByCssNEnter("#twotabsearchtextbox", "Office Products");
    }
}
