/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.HouseControl;
import byui.cit260.hogwartsschool.exceptions.HouseControlException;
import byui.cit260.hogwartsschool.model.GreatHall;
import byui.cit260.hogwartsschool.model.House;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author lmcqueen
 */
public class FinishGameView extends View {

    public FinishGameView() {
        super("---------------------------------------------------------------\n"
                + "Are you sure you want to take the exam? The game will end after the exam."
                + "\nY - Yes"
                + "\nN - No");
    }

    @Override
    public void display() {

        String value = "";
        boolean done = false;

        do {
            if (HogwartsSchool.getCurrentGame().isFinished() == false) {
                this.console.println(getPromptMessage());
                value = this.getInput();
                done = this.doAction(value);
            } else {
                done = true;
            }
        } while (!done);
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        value = value.toUpperCase();
        if (value.length() > 1) {
            ErrorView.display(this.getClass().getName(), "\n *** Invalid Selection. Enter only a single character. ***\n");
            return false;
        }

        char selection = value.charAt(0);

        switch (selection) {
            case 'Y':
                this.finishGame();
                break;
            case 'N':
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. Try again. ***");
                break;
        }

        return false;
    }

    public void finishGame() {

        String[] answers = new String[10];

        try {
            GreatHall greatHall = (GreatHall) HogwartsSchool.getCurrentGame().getMap().getLocations()[2][2].getScene();
            String[] questions = greatHall.getTestQuestions();
            String input;
            boolean valid;
            this.console.println("Final Exam: You can access your notes at any time by entering 'N'");
            for (int i = 0; i < questions.length; i++) {
                this.console.println(questions[i]);
                valid = false;

                while (!valid) {
                    input = this.getInput();
                    if (isValidChoice(input)) {
                        valid = true;
                        answers[i] = input;
                    } else {
                        this.console.println("Please reenter your answer:");
                    }
                }
            }

            this.checkAnswers(answers);
            this.endGame();
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(), "You are not in the great hall");
        }

    }

    public boolean isValidChoice(String choice) {

        choice = choice.toUpperCase();

        if (choice.length() > 1) {
            ErrorView.display("GreatHallView", "Cannot enter more than one character as a option.");
            return false;
        } else if (choice.contains("N")) {
            NotesView noteView = new NotesView();
            noteView.display();
            return false;
        } else if (!(choice.contains("A") || choice.contains("B") || choice.contains("C") || choice.contains("D"))) {
            ErrorView.display("GreatHallView", "You did not enter a correct option");
            return false;
        }

        return true;
    }

    private void checkAnswers(String[] selections) {

        String[] testAnswers = {"C", "D", "C", "A", "B", "C", "B", "A", "B", "D"};
        int correct = 0;

        if (selections.length == testAnswers.length) {
            for (int i = 0; i < testAnswers.length; i++) {
                if (selections[i].toUpperCase().equals(testAnswers[i])) {
                    correct++;
                    try {
                        HouseControl.addPoints(5);
                    } catch (HouseControlException ex) {
                        ErrorView.display(this.getClass().getName(), ex.getMessage());
                    }
                } else {

                    try {
                        HouseControl.addOtherHousePoints();
                    } catch (HouseControlException ex) {
                        ErrorView.display(this.getClass().getName(), ex.getMessage());
                    }
                }
            }

            this.console.println("You got " + correct + " correct out of 10.");
        } else {
            ErrorView.display(this.getClass().getName(), "Something went wrong with entering your answers.");
        }

    }

    private void endGame() {
        HogwartsSchool.getCurrentGame().setFinished(true);

        this.console.println("The final points scores are:");
        House[] houses;
        try {
            houses = HouseControl.getSortedHouses();

            this.console.println("House\t\tPoints");

            for (House house : houses) {
                this.console.println(house.getName() + "\t" + house.getPoints());
            }

            String winner = null;

            winner = HouseControl.getHouseMostPoints();

            if (HogwartsSchool.getPlayer().getHouse().getName().equals(winner)) {
                this.console.println("Congratulations! Your house won the house cup!");
            } else {
                this.console.println(winner + " won the house cup. Maybe you'll get it next year");
            }
        } catch (HouseControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

}
