package Factory.FactoryMethodGUIElement;

public class HtmlDialog extends Dialog{

    @Override
    public IButton createButton() {
        return new HtmlButton();
    }
}
