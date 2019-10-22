package tests.ebay.com.steps;

import app.core.elements.ebay.com.pages.ProductPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Condition.visible;

@Log4j2
public class ProductPageSteps {
    private ProductPage productPage;

    public ProductPageSteps() {
        productPage = new ProductPage();
    }

    @Step("Click on 'Add to cart' button.")
    public ShoppingCartPageSteps clickOnAddToCartButton() {
        log.info("Click on 'Add to cart' button.");
        productPage.getAddToCartButton()
                .shouldBe(visible)
                .click();

        return new ShoppingCartPageSteps();
    }
}
