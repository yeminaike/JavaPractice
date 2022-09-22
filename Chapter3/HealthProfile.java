package Chapter3;

import java.time.LocalDate;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private double height;
    private double weight;

    private double bodyMassIndex;

    public int maximumHeartRate;
    private int age;
    public double minTargetHeartRate;
    public double maxTargetHeartRate;


    public HealthProfile(String firstName, String lastName, String gender, int monthOfBirth, int dayOfBirth, int yearOfBirth,
                         double height, double weight) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;

    }

    public String getGender() {
        return gender;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearOfBirth;
    }

    public double getMaximumHeartRate() {
        return 220 - (LocalDate.now().getYear()-yearOfBirth);
    }

    public double getTargetHeartRate1() {
        return (double) (0.5 * getMaximumHeartRate());
    }

    public double getTargetHeartRate2() {
        return(double) 0.8 * getMaximumHeartRate();
    }

    public double getBodyMassIndex(){
        return(double) ((weight * 703)/(height * height));


    }






}
