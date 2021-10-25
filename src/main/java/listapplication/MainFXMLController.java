/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Randall Roberts
 */

package listapplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MainFXMLController {

    @FXML
    private Button addButton;

    @FXML
    private MenuItem closeButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button editButton;

    @FXML
    private MenuItem loadButton;

    @FXML
    private ListView<?> mainList;

    @FXML
    private MenuBar menuBar;

    @FXML
    private MenuItem newListButton;

    @FXML
    private MenuItem saveButton;

    @FXML
    void addListItem(ActionEvent event) {
        /*
        This will first check to see if the current list is full and if not,
        this will create a popup window allowing the user to enter in their data into
        fields that will be appended into the array
        */
    }

    @FXML
    void attemptCloseApp(ActionEvent event) {
        /*
        This will check to see if the current list is saved, and will ask the user if they would like to save
        if the list is not currently saved.
        If the list is already saved, it will simply close the application.
        */
    }

    @FXML
    void createNewList(ActionEvent event) {
        /*
        This will check to see if the user has altered any objects first, and if this is not the case then the
        program will create a new empty list of objects for the user to
         */
    }

    @FXML
    void deleteListItem(ActionEvent event) {
        /*
        This method will delete an item in the list at the associated index.
        */
    }

    @FXML
    void editListItem(ActionEvent event) {
        /*
        This method will alter the properties of a single list object and return the new object to the list at the same
        index. (There will be conditionals to check for proper input)
        */
    }

    @FXML
    void loadList(ActionEvent event) {
        /*
        This method will create an object using a parsed .txt file, and will print the result to the list.
        */
    }

    @FXML
    void saveCurrentList(ActionEvent event) {
        /*
        This will check to see if the current instance of the application is already associated with a file,
        and if it is not it will prompt the user for a name and location for the file. If it does already
        have an association, it will save the new set of objects as a parsed .txt file and will ask for a file location.
        */
    }

}
