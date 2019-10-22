package tests.ebay.com.steps;

import app.core.elements.ebay.com.fragments.SearchFragment;
import app.core.elements.ebay.com.pages.ShoppingCartPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.visible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertTrue;

@Log4j2
public class ShoppingCartPageSteps {
    private ShoppingCartPage shoppingCartPage;
    private SearchFragment searchFragment;

    public ShoppingCartPageSteps() {
        shoppingCartPage = new ShoppingCartPage();
        searchFragment = new SearchFragment();
    }

    @Step("Return to home page.")
    public HomePageSteps returnToHomePage() {
        log.info("Return to home page.");
        searchFragment.getLogoPicture()
                .shouldBe(visible)
                .click();

        return new HomePageSteps();
    }

    @Step("Click on 'Start shopping' button.")
    public HomePageSteps clickOnStartShoppingButton() {
        log.info("Click on 'Start shopping' button.");
        shoppingCartPage.getStartShoppingButton()
                .shouldBe(visible)
                .click();

        return new HomePageSteps();
    }

    @Step("Remove {numberItem} item from shopping cart.")
    public ShoppingCartPageSteps removeItemFromShoppingCart(int numberItem) {
        log.info("Remove "+numberItem+" item from shopping cart.");
        shoppingCartPage.getRemoveButton()
                .get(numberItem)
                .shouldBe(visible)
                .click();

        shoppingCartPage.getRemoveButton()
                .get(numberItem)
                .shouldBe(not(visible));

        return this;
    }

    @Step("Remove {numberItem} item from shopping cart 'Save for later' list.")
    public ShoppingCartPageSteps removeItemFromShoppingCartSaveForLaterList(int numberItem) {
        log.info("Remove "+numberItem+" item from shopping cart 'Save for later' list.");
        shoppingCartPage.getRemoveFromSaveForLaterListButton()
                .get(numberItem)
                .shouldBe(visible)
                .click();

        shoppingCartPage.getRemoveFromSaveForLaterListButton()
                .get(numberItem)
                .shouldBe(not(visible));

        return this;
    }

    @Step("Check successful remove message.")
    public ShoppingCartPageSteps checkRemoveSuccessfulMessage(String expectedMessage) {
        log.info("Check successful remove message.");
        String actualMessage = shoppingCartPage.getConfirmationMessage().shouldBe(visible).getText();
        log.info(actualMessage);

        assertTrue(actualMessage.contains(expectedMessage));

        return this;
    }

    @Step("Check 'Shopping cart items' count list.")
    public ShoppingCartPageSteps checkShoppingCartItemsCount(int expectedItemsCount) {
        log.info("Check 'Shopping cart items' count list.");

        String currentItemsCount = shoppingCartPage.getItemsCounter().shouldBe(visible).getText();
        currentItemsCount = currentItemsCount.replaceAll("\\D", "");

        assertThat("Invalid current items count!", Integer.parseInt(currentItemsCount), equalTo(expectedItemsCount));

        return new ShoppingCartPageSteps();
    }

    @Step("Check shopping cart 'Save for later' count list.")
    public ShoppingCartPageSteps checkShoppingCartSaveForLaterCountList(int expectedItemsCount) {
        log.info("Check shopping cart 'Save for later' count list.");
        String currentItemsCount = shoppingCartPage.getSavedForLaterCounter().shouldBe(visible).getText();
        currentItemsCount = currentItemsCount.replaceAll("\\D", "");
        log.info(currentItemsCount);

        assertThat(Integer.parseInt(currentItemsCount), equalTo(expectedItemsCount));

        return new ShoppingCartPageSteps();
    }

    @Step("Click on 'Save for later' button.")
    public LoginPageSteps clickOnSaveForLaterButton(int numberItem) {
        log.info("Click on 'Save for later' button.");
        shoppingCartPage.getSaveForLaterButton()
                .get(numberItem)
                .shouldBe(visible)
                .click();

        return new LoginPageSteps();
    }
}
