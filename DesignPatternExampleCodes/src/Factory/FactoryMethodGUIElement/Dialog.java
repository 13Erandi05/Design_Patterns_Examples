package Factory.FactoryMethodGUIElement;

import Factory.FactoryMethodGUIElement.IButton;
public abstract class Dialog {
    public void renderWindow() {
        // ... other code ...
        IButton okButton = createButton();
        okButton.render();
    }

    public abstract IButton createButton();
}
