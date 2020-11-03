package statements;

public class Time {
        int hour;
        int min;
        int sec;
             Time(int hour, int min, int sec ) {
             this.hour = hour;
             this.min = min;
             this.sec = sec;
         }
         int getInMinutes() {
                 int hourMinutes = 60;
                 return hour * hourMinutes +min;

         }
         int  getInSeconds() {
                 int minuteSecs = 60;
                 return getInMinutes() * minuteSecs + sec;
         }

         boolean earlierThan(Time other) {                                //// ez kimásoltam ezt nem értettem
             int thisTimeInSeconds = this.getInSeconds();
             int otherTimeInSeconds = other.getInSeconds();
             return thisTimeInSeconds < otherTimeInSeconds;
         }
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}