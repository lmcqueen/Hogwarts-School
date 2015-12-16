/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.GameControl;
import byui.cit260.hogwartsschool.control.GreatHallControl;
import byui.cit260.hogwartsschool.control.HouseControl;
import byui.cit260.hogwartsschool.exceptions.GameControlException;
import byui.cit260.hogwartsschool.exceptions.GreatHallException;
import byui.cit260.hogwartsschool.exceptions.HouseControlException;
import byui.cit260.hogwartsschool.model.House;
import hogwartsschool.HogwartsSchool;

/**
 *
 * @author User
 */
public class GreatHallView extends View {

    public GreatHallView() {
        super("\n\n-------------------------------------------------------------"
                + "\n| This is the Great Hall at Hogwarts. This is where you   |"
                + "\n| will be sorted into your house. There are four houses   |"
                + "\n| Hogwarts: Gryffindor, Ravenclaw, Hufflepuff, and        |"
                + "\n| Slytherin. Throughout the course of your studies here,  | "
                + "\n| you will be earning points for your house to try to win |"
                + "\n| the house cup at the end of the year. Your teachers     |"
                + "\n| will award points by completing your course work        |"
                + "\n| correctly.                                              |"
                + "\n|                                                         |"
                + "\n| Before you can begin your studies, you need to first be |"
                + "\n| sorted into a house. Every year, the sorting hat sings  | "
                + "\n| a song and then decides which house the new students    |"
                + "\n| will go to.                                             |"
                + "\n|                                                         |"
                + "\n| Read the sorting hat's song and then take the quiz to   |"
                + "\n| be sorted into your house.                              |"
                + "\n-------------------------------------------------------------");
    }

    @Override
    public void display() {
        this.console.println(this.getPromptMessage());
        this.console.println("The Sorting Hat Song: ");

        House[] houses = HogwartsSchool.getCurrentGame().getHouses();
        if (houses == null) {
            ErrorView.display(this.getClass().getName(), "Could not find houses");
        }

        for (House house : houses) {
            this.console.println(house.getDescription() + "\n");
        }

        this.console.println("Sorting Quiz: Answer the questions to be sorted into one of the four houses.");
        String[] answers = new String[5];

        this.doAction(answers);

        this.console.println("\n-------------------------------------------------"
                + "\nYou are now free to explore the castle. Some "
                + "\nclassrooms require objects before you enter them."
                + "\nYou can earn galleons (wizard money) by "
                + "\ncompleting challenges.Go to the store to get "
                + "\nthe items you need."
                + "\n-------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String[] answers = (String[]) obj;

        try {
            String[] questions = GameControl.getSortingQuestions();
            String input;
            boolean valid;

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

            String house;
            house = GreatHallControl.getHouse(answers);
            this.console.println("You have been sorted into " + house + "!");
            HouseControl.setHouse(house);
        } catch (GreatHallException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        } catch (HouseControlException | GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }

        return true;
    }

    public boolean isValidChoice(String choice) {

        choice = choice.toUpperCase();

        if (choice.length() > 1) {
            ErrorView.display("GreatHallView", "Cannot enter more than one character as a option.");
            return false;
        } else if (!(choice.contains("A") || choice.contains("B") || choice.contains("C") || choice.contains("D"))) {
            ErrorView.display("GreatHallView", "You did not enter a correct option");
            return false;
        }

        return true;
    }

}
