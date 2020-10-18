package Q3;

public class Etacolla {
    private final UniversityService mUniService;
    public Etacolla(UniversityService servive) {
        this.UniversityService = new servive();
    }
    public void generateTimetable(Student student) {
        List<String> subjectNames = UniversityService.getEnrolledSubjectCodes(student);
        List<Subject> subjects = new ArrayList<>();
        for (String subjectName : subjectNames) {
            Subject subject = UniversityService.getSubject(subjectName);
            subjects.add(subject);
        }
        // allocate activities to student ...
        List<Activity> allocated = allocatePreferences(student.getPreferences(), subjects);
        for (Activity activity : allocated) {
            UniversityService.registerStudentInActivity(student, activity);
        }
    }
}