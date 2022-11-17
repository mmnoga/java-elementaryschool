package school.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public class SampleData {
    public enum Subject {
        biology,
        english,
        polish,
        history,
        mathematics,
        music,
        physics,
        geography,
        science,
        chemistry,
    }

    public List<Subject> subjects = Arrays.asList(Subject.values());

    public void getSubjects() {
        System.out.println(subjects);
    }
}
