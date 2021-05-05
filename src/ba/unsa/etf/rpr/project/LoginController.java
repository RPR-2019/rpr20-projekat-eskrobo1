package ba.unsa.etf.rpr.project;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    public TextField fieldUsername;
    public PasswordField fieldPassword;
    public Bookstore bookstore;

    public LoginController() throws IllegalAccount {
        bookstore=new Bookstore();
    }

    public void loginButtonClick(ActionEvent actionEvent) {
        Boolean canContinue=false;
        canContinue=bookstore.getEmployees()
                .stream()
                .filter((employee -> employee.getAccount().getUsername().equals(fieldUsername.getText())&&employee.getAccount().getPassword().equals(fieldPassword.getText()) ))
                .findFirst()
                .isPresent();
        if (canContinue) {
            System.out.println("a");
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning Dialog");
            alert.setHeaderText("Look, a Warning Dialog");
            alert.setContentText("Careful with the next step!");

            alert.showAndWait();
        }
    }
}
