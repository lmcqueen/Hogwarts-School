/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import hogwartsschool.HogwartsSchool;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author lmcqueen and Johnson
 */
public abstract class View implements ViewInterface {

    private String promptMessage;

    protected final BufferedReader keyboard = HogwartsSchool.getInFile();
    protected final PrintWriter console = HogwartsSchool.getOutFile();

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void display() {

        String value = "";
        boolean done = false;

        do {
            this.console.println(this.promptMessage);
            value = this.getInput();
            done = this.doAction(value);

        } while (!done);

    }

    @Override
    public String getInput() {

        boolean valid = false;

        String value = null;
        try {
            while (!valid) {

                value = keyboard.readLine();
                value = value.trim();

                if (value.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "\n *** Invalid Selection. Please enter a selection. ***\n");
                    continue;
                }

                break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
            return null;
        }

        return value;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

}
