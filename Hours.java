public class Hours {
    Day[] hoursArray = new Day[7];
    Day monday = new Day("Monday", 10, "11:00AM - 9:00PM");
    Day tuesday = new Day("Tuesday", 10, "11:00AM - 9:00PM");
    Day wednesday = new Day("Wednesday", 0, "closed");
    Day thursday = new Day("Thursday", 10, "11:00AM - 9:00PM");
    Day friday = new Day("Friday", 12, "10:00AM - 10:00PM");
    Day saturday = new Day("Saturday", 14, "8:00AM - 10:00PM");
    Day sunday = new Day("Sunday", 13, "9:00AM - 10:00PM");

    Hours() {
        hoursArray[0] = monday;
        hoursArray[1] = tuesday;
        hoursArray[2] = wednesday;
        hoursArray[3] = thursday;
        hoursArray[4] = friday;
        hoursArray[5] = saturday;
        hoursArray[6] = sunday;
    }

    public class Day {
        int hours;
        String hoursOpen;
        String day;

        Day(String day, int hours, String hoursOpen) {
            this.day = day;
            this.hours = hours;
            this.hoursOpen = hoursOpen;
        }

        public String getDay() {
            return day;
        }

        public int getHours() {
            return hours;
        }

        public String getHoursOpen() {
            return hoursOpen;
        }

        public String toString() {
            String str = "";
            str += "\nDay: " + getDay() + "\nTime: " + getHoursOpen() + "\nHours Open: " + getHoursOpen();
            return str;
        }
    }

    public String toString() {
        String str = "Hours: ";
        for (int i = 0; i < hoursArray.length; i++) {
            str += "\n" + hoursArray[i].toString();
        }
        return str;
    }
}
