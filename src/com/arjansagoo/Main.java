package com.arjansagoo;
import com.arjansagoo.Controller.ActivityLevelCalculator;
import com.arjansagoo.Controller.BMRCalculator;
import com.arjansagoo.Controller.CalorieCalculator;
import com.arjansagoo.Model.Person;
import com.arjansagoo.View.UserForm;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //User Input Form for personal data
        // Create userForm class to separate user input

        System.out.println("Welcome to My Fitness Goal");
        System.out.println("Please enter your personal details below:");
        System.out.println(" ");

        //Create input instance of form to import user input
        var userForm = new UserForm();
        String nameCheck = userForm.NameInput();
        String genderCheck = userForm.GenderInput();

        int ageCheck = userForm.AgeInput();
        int weightCheck = userForm.WeightInput();
        int heightCheck = userForm.HeightInput();
        int activityCheck = userForm.ActivityInput();
        int bodyGoalCheck = userForm.BodyGoalInput();

        //Create an instance of Activity Level
        ActivityLevelCalculator activityLevel = new ActivityLevelCalculator(activityCheck);

        double userActivityLevel = activityLevel.getUserSelection();

        //Create instance of Person
        var person = new Person(nameCheck, genderCheck, ageCheck, weightCheck, heightCheck);

        //Run BMRCalculation class from BMRCalculation.java
        var bmrCalculator = new BMRCalculator(person);
        int userBMR = bmrCalculator.calculateBMR();

        String userName = nameCheck;

        System.out.println(userName + ", your total BMR is " + userBMR);

        //Create instance of Calorie Calculator
        var calorieCalculator = new CalorieCalculator(userBMR, userActivityLevel, bodyGoalCheck);

        calorieCalculator.CalculateTDEE();
        calorieCalculator.CalculateCalories();



    }
}

