package University;

public class Campuser {
    public String name;
    private String Course;
    protected String RegNo;
    int CourseUnits;


    public Campuser(String name, String course, String regNo, int courseUnits) {
        this.name = name;
        Course = course;
        RegNo = regNo;
        CourseUnits = courseUnits;

    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return Course;
    }

    protected String getRegNo() {
        return RegNo;
    }

    public int getCourseUnits() {
        return CourseUnits;
    }

}
