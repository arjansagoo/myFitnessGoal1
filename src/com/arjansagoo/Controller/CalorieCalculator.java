package com.arjansagoo.Controller;
import com.arjansagoo.Model.Person;
import com.arjansagoo.Controller.ActivityLevelCalculator;
import java.text.DecimalFormat;
public class CalorieCalculator {

    //Create variables to determine calories, bmr and activity levels
    private int bmr;
    private double activityLevel;
    private double tdee;
    private int bodyWeightGoal;
    private String bodyGoal;
    private int goalCalories;
    private int totalCalories;
    private int cutCalories;
    private int maintainCalories;
    private int gainCalories;

    //Default constructor, passing parameters from the main class
    public CalorieCalculator(int bmrCalculate, double activityCalculate, int checkBodyGoal) {
          setBmr(bmrCalculate);
          setActivityLevel(activityCalculate);
          setBodyGoal(checkBodyGoal);
//        this.bmr = bmrCalculate;
//        this.activityLevel = activityCalculate;
//        this.bodyWeightGoal = checkBodyGoal;
    }

    // Make setters private for abstraction.
    private void setBmr(int bmr) {
        this.bmr = bmr;
    }

    private void setActivityLevel(double activityLevel) {
        this.activityLevel = activityLevel;
    }

    private void setBodyGoal(int bodyGoal) {
        this.bodyWeightGoal = bodyGoal;
    }

    public int CalculateTDEE() {
        tdee = bmr * activityLevel;

        return (int)tdee;
    }

    public int CalculateCalories() {

        totalCalories = (int)tdee;

        if(bodyWeightGoal == 1) {
            cutCalories = totalCalories - 500;
            goalCalories = cutCalories;
            bodyGoal = "lose weight(fat)";
        }
        else if(bodyWeightGoal == 2) {
            maintainCalories = totalCalories;
            goalCalories = maintainCalories;
            bodyGoal = "maintain weight";
            }
        else if(bodyWeightGoal == 3) {
            gainCalories = totalCalories + 500;
            goalCalories = gainCalories;
            bodyGoal = "gain weight(muscle)";
        }
        else {
            System.out.println("Error! Please check body goal");
        }
        //Create one Println and change based on body goal, instead of having duplicate data
        System.out.println("Your TDEE which is your bmr * activity level is " + (int)tdee);
        System.out.println("");
        System.out.println("To " +bodyGoal+ " you need to eat " + goalCalories + " calories");
        System.out.println("");
        System.out.println("Macro Split");
        System.out.println("Protein " + Math.round((goalCalories * 0.25) / 4) + "g");
        System.out.println("Carbohydrates " + Math.round((goalCalories * 0.45) / 4) + "g");
        System.out.println("Fats " + Math.round((goalCalories * 0.3) / 9) + "g");

        return goalCalories;
    }

}
