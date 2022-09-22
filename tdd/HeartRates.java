package tdd;

public class HeartRates {
    private String firstName;
        private String lastName;
        private int monthOfBirth;
        private int dateOfBirth;
        private int yearOfBirth;
        private int ageOfPerson;
        private int maximumHeartRate;
        private double minTargetHeartRate;
        private double maxTargetHeartRate;

        public HeartRates(String firstName, String lastName, int monthOfBirth, int dateOfBirth, int yearOfBirth){

            this.firstName = firstName;
            this.lastName = lastName;
            this.monthOfBirth = monthOfBirth;
            this.dateOfBirth = dateOfBirth;
            this.yearOfBirth = yearOfBirth;
        }
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public String getFirstName(){
            return firstName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public String getLastName(){
            return lastName;
        }

        public void setMonthOfBirth(int monthOfBirth) {
            this.monthOfBirth = monthOfBirth;
        }
        public int getMonthOfBirth(){
            return monthOfBirth;
        }

        public void setDateOfBirth(int dateOfBirth) {
            this.dateOfBirth =  dateOfBirth;
        }

        public int getDateOfBirth(){
            return dateOfBirth;
        }

        public void setDateOfYear(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
        }

        public int getYearOfBirth(){
            return yearOfBirth;
        }
        public void calculateAgeOfPerson(){

            ageOfPerson = 2022 - yearOfBirth;
        }

        public int getAgeOfPerson(){
            return ageOfPerson;
        }

        public void calculateMaximumHeartRate(){
            maximumHeartRate = 220 - ageOfPerson;
        }

        public double getMaximumHeartRate(){
            return maximumHeartRate;
        }

        public void calculateMiniTargetHeartRate(){
            minTargetHeartRate = 0.5 * maximumHeartRate;

        }
        public double getMinTargetHeartRate(){
            return minTargetHeartRate;
        }

        public void calculateMaxTargetHeartRate(){
            maxTargetHeartRate = 0.85 * maximumHeartRate;
        }

        public double getMaxTargetHeartRate(){
            return maxTargetHeartRate;
        }



    }


