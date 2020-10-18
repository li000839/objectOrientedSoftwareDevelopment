package Q3;

public interface UniversityService {
    List<String> getEnrolledSubjectCodes(Student student);
    Subject getSubject(String name);
    void registerStudentInActivity(Student student, Activity activity);
}
