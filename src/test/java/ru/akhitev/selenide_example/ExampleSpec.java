package ru.akhitev.selenide_example;

import org.junit.Test;


import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class ExampleSpec {

    @Test
    public void given_bitbucketOpen_when_openFeatures_then_someTextIsCorrect() {
        open("https://bitbucket.org");
        $(withText("Features")).click();
        String cssSelectorOfTextToTest = "body > main > .xs-compact-bottom > .flex-container > .vertical-middle > div > p";
        String expectedText = "Where teams come together to plan, code, test, and deploy at scale.";
        $(cssSelectorOfTextToTest).shouldHave(text(expectedText));
    }
}
