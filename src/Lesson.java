public class Lesson {
    private String lessonType;
    private int exam1;
    private int exam2;

    public Lesson(String lessonType, int sinav1, int sinav2){
        this.lessonType =lessonType;
        this.exam1 =sinav1;
        this.exam2 =sinav2;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public int getExam1() {
        return exam1;
    }

    public void setExam1(int exam1) {
        this.exam1 = exam1;
    }

    public int getExam2() {
        return exam2;
    }

    public void setExam2(int exam2) {
        this.exam2 = exam2;
    }
}
