package Factory.FactoryMethodGUIElement;

//Concrete Product
public class HtmlButton implements IButton{
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onCLick();
    }

    @Override
    public void onCLick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
