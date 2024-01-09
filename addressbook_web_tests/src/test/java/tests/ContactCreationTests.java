package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void CanCreateContact() {
       app.contacts().createContact(new ContactData("first", "middle", "last"));
    }
    @Test
    public void CanCreateContactWithEmptyName() {
        app.contacts().createContact(new ContactData());
    }
    @Test
    public void CanCreateContactWithNameOnly() {
        app.contacts().createContact(new ContactData().withfirstN("some name"));
    }
}
