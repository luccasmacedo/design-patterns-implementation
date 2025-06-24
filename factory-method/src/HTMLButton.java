public class HTMLButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering HTML button");
    }

    @Override
    public void onClick() {
        System.out.println("HTML button clicked");
    }

}
