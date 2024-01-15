package manager;

import model.ContactData;
import org.openqa.selenium.By;
public class ContactHelper extends HelperBase{
    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void openHomePage() {
        if (!manager.isElementPresent(By.name("new"))) {
            click(By.linkText("home"));
        }
    }
    public void createContact(ContactData contact){
    openHomePage();
    initContactCreation();
    fillContactForm(contact);
    submitContactCreation();
    returnToHomePage();
    }
    private void returnToHomePage() {
        click(By.linkText("home"));
    }
    private void submitContactCreation() {
        click(By.name("submit"));
    }

    private void fillContactForm(ContactData contact) {
            type(By.name("firstname"), contact.firstN());
            type(By.name("middlename"), contact.middleN());
            type(By.name("lastname"), contact.lastN());
        }

    private void initContactCreation() {
        click(By.linkText("add new"));
    }

    public boolean isContactPresent() {
        openHomePage();
        return manager.isElementPresent(By.name("selected[]"));
    }

    public void removeContact() {
        openHomePage();
        selectContact();
        removeSelectedContact();
        returnToHomePage();
    }

    private void removeSelectedContact() {
        click(By.xpath("//*[@value='Delete']"));
    }

    private void selectContact() {
        click(By.name("selected[]"));
    }

    public int getCount() {
        openHomePage();;
        return manager.driver.findElements(By.name("selected[]")).size();
    }


    public void removeAllContact() {
        openHomePage();
        selectAllContact();
        removeSelectedContact();
        returnToHomePage();
    }

    private void selectAllContact() {
        var checkboxes = manager.driver.findElements(By.name("selected[]"));
        for (var checkbox : checkboxes) {
            checkbox.click();
        }
    }
}