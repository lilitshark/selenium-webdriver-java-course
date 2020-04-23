package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickContextMenu();
        assertEquals(contextMenuPage.getAlertText(), "You selected a context menu", "Message doesn't match!");
        contextMenuPage.acceptAlert();
    }
}
