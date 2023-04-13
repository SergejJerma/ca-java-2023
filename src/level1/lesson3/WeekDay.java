package level1.lesson3;

public enum WeekDay {
    MONDAY("pirmadienis"),
    TUESDAY("antradienis"),
    WEDNESDAY("treciadienis"),
    THURSDAY("ketvirtadienis"),
    FRIDAY("penktadienis"),
    SATURDAY("sestadienis"),
    SUNDAY("sekmadienis");

    private String weekDay;

    WeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public String getWeekDay() {
        return weekDay;
    }
}
