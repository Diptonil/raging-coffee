package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Important {
    boolean value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface ScaleOfUsefulness {
    int value();
    int scaleBound() default 5;
    String comment() default "No comments";
}

@Important(true)
@ScaleOfUsefulness(5)
final class RunningClass {
    void aVeryUsefulMethod() {
        System.out.print("...that literally does nothing.");
    }
}

public final class SingleMemberAnnotation {
    
    public static void main(String[] args) {
        RunningClass runningClass = new RunningClass();
        Class<?> classToQuery = runningClass.getClass();

        Annotation[] annotations = classToQuery.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.toString());
        }
    }
}
