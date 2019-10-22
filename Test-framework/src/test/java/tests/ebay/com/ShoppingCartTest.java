package tests.ebay.com;

import app.core.test_data.EbayDataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.ebay.com.steps.HomePageSteps;

public class ShoppingCartTest extends BaseTest {
    private HomePageSteps homePageSteps = new HomePageSteps();

    @Test(description = "Shopping cart addition and deletion three products.",
            dataProvider = "shopping_cart_list_data", dataProviderClass = EbayDataProvider.class)
    public void shoppingCartAdditionAndDeletionTestThreeProducts(String firstSearchItem, int numberFirstSearchResult,
                                                                 String secondSearchItem, int numberSecondSearchResult,
                                                                 String thirdSearchItem, int numberThirdSearchResult,
                                                                 String deleteMessage) {
        homePageSteps.openPage()
                .clickOnShoppingCartIcon()
                .clickOnStartShoppingButton()
                .enterIntoSearchField(firstSearchItem)
                .clickOnSearchButton()
                .selectBuyItNowFilter()
                .chooseDesiredSearchResult(numberFirstSearchResult)
                .clickOnAddToCartButton()
                .returnToHomePage()
                .enterIntoSearchField(secondSearchItem)
                .clickOnSearchButton()
                .selectBuyItNowFilter()
                .chooseDesiredSearchResult(numberSecondSearchResult)
                .clickOnAddToCartButton()
                .returnToHomePage()
                .enterIntoSearchField(thirdSearchItem)
                .clickOnSearchButton()
                .selectBuyItNowFilter()
                .chooseDesiredSearchResult(numberThirdSearchResult)
                .clickOnAddToCartButton()
                .checkShoppingCartItemsCount(numberThirdSearchResult)
                .removeItemFromShoppingCart(numberSecondSearchResult)
                .checkRemoveSuccessfulMessage(deleteMessage)
                .checkShoppingCartItemsCount(numberSecondSearchResult)
                .removeItemFromShoppingCart(numberFirstSearchResult)
                .checkRemoveSuccessfulMessage(deleteMessage)
                .checkShoppingCartItemsCount(numberFirstSearchResult)
                .removeItemFromShoppingCart(numberFirstSearchResult - 1)
                .checkRemoveSuccessfulMessage(deleteMessage);
    }

    @Test(description = "'Save for later' list addition and deletion.",
            dataProvider = "save_for_later_list_data", dataProviderClass = EbayDataProvider.class)
    public void SaveForLaterButtonIsAddedToList(String searchItem,
                                                int numberSearchResult,
                                                String email,
                                                String password,
                                                String deleteMessage) {
        homePageSteps.openPage()
                .enterIntoSearchField(searchItem)
                .clickOnSearchButton()
                .selectBuyItNowFilter()
                .chooseDesiredSearchResult(numberSearchResult)
                .clickOnAddToCartButton()
                .clickOnSaveForLaterButton(numberSearchResult - 1)
                .enterUserName(email)
                .enterPassword(password)
                .clickOnSignInButtonAfterClickOnSaveForLaterButton()
                .checkShoppingCartSaveForLaterCountList(numberSearchResult)
                .removeItemFromShoppingCartSaveForLaterList(numberSearchResult - 1)
                .checkRemoveSuccessfulMessage(deleteMessage);
    }

}
