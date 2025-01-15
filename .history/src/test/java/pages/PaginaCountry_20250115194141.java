package pages;

import java.util.List;

public class PaginaCountry extends BasePage {

    private String countryDropdown = "//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select";

    public PaginaCountry() {
        super(driver);
    }

    public List<String> returnCountryValues() {
        return getDropdownValues(countryDropdown);
    }
}
