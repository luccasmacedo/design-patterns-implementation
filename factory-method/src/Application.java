public class Application {
    private Dialog dialog;

    public Application(Dialog dialog) {
        this.dialog = dialog;
    }

    public void run() {
        Button button = dialog.createButton();
        button.render();
        button.onClick();
    }

    public static void main(String[] args) {
        // Example usage
        Dialog dialog = new WindowsDialog(); // or new WindowsDialog();
        Application app = new Application(dialog);
        app.run();
    }
}
