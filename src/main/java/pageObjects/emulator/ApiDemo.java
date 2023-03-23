package pageObjects.emulator;

import baseclass.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.Arrays;

public class ApiDemo extends BasePage {

    public ApiDemo(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Profile\"]/android.widget.ImageView")
    private WebElement profile;
    @FindBy(xpath = "//android.widget.TextView[@text='EDIT']")
    private WebElement edit;

    public WebElement getProfile() {
        return profile;
    }

    public void setProfile(WebElement profile) {
        this.profile = profile;
    }

    public WebElement getEdit() {
        return edit;
    }

    public void setEdit(WebElement edit) {
        this.edit = edit;
    }

    public WebElement getName() {
        return name;
    }

    public void setName(WebElement name) {
        this.name = name;
    }

    public WebElement getYourName() {
        return yourName;
    }

    public void setYourName(WebElement yourName) {
        this.yourName = yourName;
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Name']")
    private WebElement name;
    @FindBy(xpath = "//android.widget.EditText[@text='Your Name']")
    private WebElement yourName;

    public WebElement getEditName() {
        return editName;
    }

    public void setEditName(WebElement editName) {
        this.editName = editName;
    }

    @FindBy(id = "android:id/edit")
    private WebElement editName;

    public WebElement getOkButton() {
        return okButton;
    }

    public void setOkButton(WebElement okButton) {
        this.okButton = okButton;
    }

    @FindBy(id = "android:id/button1")
    private WebElement okButton;


    public WebElement getEmail() {
        return email;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Email']")
    private WebElement email;

    public WebElement getEditEmail() {
        return editEmail;
    }

    public void setEditEmail(WebElement editEmail) {
        this.editEmail = editEmail;
    }

    @FindBy(id = "android:id/edit")
    private WebElement editEmail;

    public WebElement getEmailOkButton() {
        return emailOkButton;
    }

    public void setEmailOkButton(WebElement emailOkButton) {
        this.emailOkButton = emailOkButton;
    }

    @FindBy(id = "android:id/button1")
    private WebElement emailOkButton;
    @FindBy(xpath = "//android.widget.TextView[@text='Phone Number']")
    private WebElement phoneNum;
    @FindBy(id = "android:id/edit")
    private WebElement editPhnNum;

    public WebElement getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(WebElement phoneNum) {
        this.phoneNum = phoneNum;
    }

    public WebElement getEditPhnNum() {
        return editPhnNum;
    }

    public void setEditPhnNum(WebElement editPhnNum) {
        this.editPhnNum = editPhnNum;
    }

    public WebElement getEditPhnOkButton() {
        return editPhnOkButton;
    }

    public void setEditPhnOkButton(WebElement editPhnOkButton) {
        this.editPhnOkButton = editPhnOkButton;
    }

    @FindBy(id = "android:id/button1")
    private WebElement editPhnOkButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Address']")
    private WebElement address;

    public WebElement getAddress() {
        return address;
    }

    public void setAddress(WebElement address) {
        this.address = address;
    }

    public WebElement getEditAddress() {
        return editAddress;
    }

    public void setEditAddress(WebElement editAddress) {
        this.editAddress = editAddress;
    }

    @FindBy(id = "android:id/edit")
    private WebElement editAddress;

    public WebElement getBackUserProfile() {
        return backUserProfile;
    }

    public void setBackUserProfile(WebElement backUserProfile) {
        this.backUserProfile = backUserProfile;
    }

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private WebElement backUserProfile;

    public WebElement getRecentPage() {
        return recentPage;
    }

    public void setRecentPage(WebElement recentPage) {
        this.recentPage = recentPage;
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Recent']")
    private WebElement recentPage;

    public WebElement getLedScroll() {
        return ledScroll;
    }

    public void setLedScroll(WebElement ledScroll) {
        this.ledScroll = ledScroll;
    }

    @FindBy(xpath = "//android.widget.TextView[@text='LED TV 43 Inch Smart TV TCL 43E3 UHD 4K Dolby Sound']")
    private WebElement ledScroll;

    public WebElement getWatch() {
        return watch;
    }

    public void setWatch(WebElement watch) {
        this.watch = watch;
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Apple watch series 3 GPS 42mm Black']")
    private WebElement watch;

    public WebElement getMoneyCounter() {
        return moneyCounter;
    }

    public void setMoneyCounter(WebElement moneyCounter) {
        this.moneyCounter = moneyCounter;
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Money Counter Kozure MC-101']")
    private WebElement moneyCounter;

    public WebElement getMiniPanda() {
        return miniPanda;
    }

    public void setMiniPanda(WebElement miniPanda) {
        this.miniPanda = miniPanda;
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Mini Panda Backpack - Pink']")
    private WebElement miniPanda;
    @FindBy(id = "com.solodroid.solomerce:id/btn_add_cart")
    private WebElement addToCart;

    public WebElement getAddToCart() {
        return addToCart;
    }

    public void setAddToCart(WebElement addToCart) {
        this.addToCart = addToCart;
    }

    public WebElement getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(WebElement numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public void setAddButton(WebElement addButton) {
        this.addButton = addButton;
    }

    @FindBy(id = "com.solodroid.solomerce:id/userInputDialog")
    private WebElement numberOfOrder;
    @FindBy(id = "android:id/button1")
    private WebElement addButton;

    public WebElement getCategory() {
        return category;
    }

    public void setCategory(WebElement category) {
        this.category = category;
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Category']/android.widget.ImageView")
    private WebElement category;
    @FindBy(xpath = "//android.widget.TextView[@text='Electronics & Gadgets']")
    private WebElement electronicsGadgets;

    public WebElement getElectronicsGadgets() {
        return electronicsGadgets;
    }

    public void setElectronicsGadgets(WebElement electronicsGadgets) {
        this.electronicsGadgets = electronicsGadgets;
    }

    public WebElement getSearchBar() {
        return searchBar;
    }

    public void setSearchBar(WebElement searchBar) {
        this.searchBar = searchBar;
    }

    @FindBy(id = "com.solodroid.solomerce:id/search")
    private WebElement searchBar;

    public WebElement getSearchInput() {
        return searchInput;
    }

    public void setSearchInput(WebElement searchInput) {
        this.searchInput = searchInput;
    }

    @FindBy(id = "com.solodroid.solomerce:id/search_src_text")
    private WebElement searchInput;

    public WebElement getBackAfterSearch() {
        return backAfterSearch;
    }

    public void setBackAfterSearch(WebElement backAfterSearch) {
        this.backAfterSearch = backAfterSearch;
    }

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Collapse']")
    private WebElement backAfterSearch;

    public WebElement getNavigateBack() {
        return navigateBack;
    }

    public void setNavigateBack(WebElement navigateBack) {
        this.navigateBack = navigateBack;
    }

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private WebElement navigateBack;

//    @FindBy(xpath = "")
//    private WebElement edit;
//    @FindBy(xpath = "")
//    private WebElement edit;
//    @FindBy(xpath = "")
//    private WebElement edit;
//    @FindBy(xpath = "")
//    private WebElement edit;
//    void  @FindBy(xpath = "")
//    private WebElement edit;


    public void clickOnProfile() throws InterruptedException {
        getProfile().click();
        Thread.sleep(2000);
        getEdit().click();
        Thread.sleep(2000);
        getName().click();
        getYourName().clear();
        getEditName().sendKeys("Harjinder Singh");
        getOkButton().click();
    }

    public void clickOnEmail() throws InterruptedException {
        getEmail().click();
        getEditEmail().clear();
        getEditEmail().sendKeys("harjinder002@gmail.com");
        getEmailOkButton().click();
    }

    public void clickOnPhoneNum() throws InterruptedException {
        getPhoneNum().click();
        getEditPhnNum().clear();
        getEditPhnNum().sendKeys("9915098765");
        getEditPhnOkButton().click();
    }

    public void clickOnAddress() throws InterruptedException {
        getAddress().click();
        getEditAddress().clear();
        getEditAddress().sendKeys("HN 507");
        getOkButton().click();
        getBackUserProfile().click();
    }

    public void recentPageWorking() throws InterruptedException {
        getRecentPage().click();
    }

    public void verticalScroll(WebElement element) throws InterruptedException {
        Thread.sleep(5000);
        int centerx = element.getRect().x + (element.getSize().width / 2);
        double starty = element.getRect().y + (element.getSize().height * 0.3);
        double endy = element.getRect().y + (element.getSize().height * 0.7);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerx, (int) starty));
        swipe.addAction(finger.createPointerDown(0));

        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),
                PointerInput.Origin.viewport(), centerx, (int) endy));
        swipe.addAction(finger.createPointerUp(0));
        driver.perform(Arrays.asList(swipe));
    }

    public void scrollElement(WebElement element) throws InterruptedException {
        try {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true). instance(0)).scrollIntoView( new UiSelector()" + ".textMatches(\"" + "%s" + "\").instance(0)), element"));

        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(3000);
        element.click();
    }

    public void clickOnProduct(String order) throws InterruptedException {
        getWatch().click();
        Thread.sleep(2000);
        getAddToCart().click();
        //getNumberOfOrder().click();
        getNumberOfOrder().sendKeys(order);
        getAddButton().click();
        Thread.sleep(8000);
        driver.navigate().back();
    }

    public void categorySectionWorking() throws InterruptedException {
        getCategory().click();
        Thread.sleep(3000);
        getElectronicsGadgets().click();
        getSearchBar().click();
        Thread.sleep(3000);
        getSearchInput().sendKeys("Apple watch");
        Thread.sleep(2000);
        getBackAfterSearch().click();
        getNavigateBack().click();
    }

    public void enterAllTheValues() throws InterruptedException {

    }

}
