package pageobjects.pages.trello_home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.pages.base.BasePage;

public class TrelloHomePage extends BasePage {
    public TrelloHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body/div[@id='trello-root']/div[@id='chrome-container']/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement homePage;

    @FindBy(css = "body.feplat3731:nth-child(2) div.chrome.chrome-101.windows.body-tabbed-page:nth-child(1) div._2ffa7ex19Eoxvc:nth-child(1) div._2W6d4IdyPwMlNi div._3cDDlVbib-11ls:nth-child(1) div.js-react-root div._2jrXk1mCSW89B1.lrVO8NeQgVVxK_ div._2mulqkws7s9rwm:nth-child(3) div._1tvnpiDHjeZfwG div:nth-child(1) button._3CAAHVX_UQofc8._3TTqkG5muwOzqZ._3jgu2AdlURonAV._1Tu9wiuW4Te8Rx > span.cSOqrUxBxAu8by")
    WebElement workSpaces;

    @FindBy(css = "body.feplat3731:nth-child(2) div.chrome.chrome-101.windows.body-tabbed-page:nth-child(1) div._2ffa7ex19Eoxvc:nth-child(1) div._2W6d4IdyPwMlNi div._3cDDlVbib-11ls:nth-child(1) div.js-react-root div._2jrXk1mCSW89B1.lrVO8NeQgVVxK_ div._2mulqkws7s9rwm:nth-child(3) div._1tvnpiDHjeZfwG div:nth-child(1) button._3CAAHVX_UQofc8._3TTqkG5muwOzqZ._3jgu2AdlURonAV._1Tu9wiuW4Te8Rx:nth-child(2) > span.cSOqrUxBxAu8by")
    WebElement recent;

    @FindBy(css = "body.feplat3731:nth-child(2) div.chrome.chrome-101.windows.body-tabbed-page:nth-child(1) div._2ffa7ex19Eoxvc:nth-child(1) div._2W6d4IdyPwMlNi div._3cDDlVbib-11ls:nth-child(1) div.js-react-root div._2jrXk1mCSW89B1.lrVO8NeQgVVxK_ div._2mulqkws7s9rwm:nth-child(3) div._1tvnpiDHjeZfwG div:nth-child(1) button._3CAAHVX_UQofc8._3TTqkG5muwOzqZ._3jgu2AdlURonAV._1Tu9wiuW4Te8Rx:nth-child(3) > span.cSOqrUxBxAu8by")
    WebElement favorites;

    @FindBy(css = "body.feplat3731:nth-child(2) div.chrome.chrome-101.windows.body-tabbed-page:nth-child(1) div._2ffa7ex19Eoxvc:nth-child(1) div._2W6d4IdyPwMlNi div._3cDDlVbib-11ls:nth-child(1) div.js-react-root div._2jrXk1mCSW89B1.lrVO8NeQgVVxK_ div._2mulqkws7s9rwm:nth-child(3) div._1tvnpiDHjeZfwG div:nth-child(1) button._3c5wlWyY4PpH1M._3TTqkG5muwOzqZ._3jgu2AdlURonAV._1Tu9wiuW4Te8Rx:nth-child(3) > span._3-fPtDaHLnHaRq")
    WebElement more;

    @FindBy(css = "body.feplat3731:nth-child(2) div.chrome.chrome-101.windows.body-tabbed-page:nth-child(1) div._2ffa7ex19Eoxvc:nth-child(1) div._2W6d4IdyPwMlNi div._3cDDlVbib-11ls:nth-child(1) div.js-react-root div._2jrXk1mCSW89B1.lrVO8NeQgVVxK_ div._2mulqkws7s9rwm:nth-child(3) div._1tvnpiDHjeZfwG div._2pPbTWxUUSTC4T:nth-child(2) button._2Twwgx1RZOAQRy._2oiDUXkPzaGedV._3TTqkG5muwOzqZ._3jgu2AdlURonAV._1Tu9wiuW4Te8Rx > p._1N9LJYg3C9x47Y")
    WebElement create;

    @FindBy(css = "body.feplat3731:nth-child(2) div.chrome.chrome-101.windows.body-tabbed-page:nth-child(1) div._2ffa7ex19Eoxvc:nth-child(1) div._2W6d4IdyPwMlNi main._13yPKk9EPKnvGB:nth-child(2) div.member-boards-view div.js-boards-page div.js-react-root div.home-container div.home-sticky-container nav.home-left-sidebar-container div.IYDUlPZJLRetD7:nth-child(1) ul._1Arr2IZhlJ7MX2 li._3jx0exM5QmvDHs:nth-child(1) a._2GFX5xx4d2BRju > span._13fwAio4RLr1IF")
    WebElement boards;

    @FindBy(css = "body.feplat3731:nth-child(2) div.chrome.chrome-101.windows.body-tabbed-page:nth-child(1) div._2ffa7ex19Eoxvc:nth-child(1) div._2W6d4IdyPwMlNi main._13yPKk9EPKnvGB:nth-child(2) div.member-boards-view div.js-boards-page div.js-react-root div.home-container div.home-sticky-container nav.home-left-sidebar-container div.IYDUlPZJLRetD7:nth-child(1) ul._1Arr2IZhlJ7MX2 div.js-react-root:nth-child(2) li._3jx0exM5QmvDHs > a._2GFX5xx4d2BRju")
    WebElement templates;

    public void enterHomePage() {
        homePage.click();
    }

    public void enterWorkSpaces() {
        workSpaces.click();
    }

    public void enterRecent() {
        recent.click();
    }

    public void enterFavorites() {
        favorites.click();
    }

    public void enterMore() {
        more.click();
    }

    public void enterCreate() {
        create.click();
    }

    public void enterBoards() {
        boards.click();
    }

    public void enterTemplates() {
        templates.click();
    }
}
