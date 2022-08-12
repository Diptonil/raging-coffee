package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MethodAnnotation {
    String information() default "Default value of information field.";
    int degree() default 420;
}

@MethodAnnotation(information = "This is not a method.", degree = -1)
final class RunningClass {

    @MethodAnnotation(information = "Information about the first method.")
    public void methodOne() {
        System.out.print("The first method.");
    }

    @MethodAnnotation()
    public void methodTwo() {
        System.out.print("The second method.");
    }

    @MethodAnnotation(degree = 1)
    public void methodThree() {
        System.out.print("The third method.");
    }
}

public final class DefaultAnnotation {
    
    public static void main(String[] args) {
        RunningClass runningClass = new RunningClass();
        Class<?> classToQuery = runningClass.getClass();

        try {
            Method firstMethod = classToQuery.getMethod("methodOne");
            Method secondMethod = classToQuery.getMethod("methodtwo");
            Method thirdMethod = classToQuery.getMethod("methodThree");
            Annotation annotationOne = firstMethod.getAnnotation(MethodAnnotation.class);
            Annotation annotationTwo = secondMethod.getAnnotation(MethodAnnotation.class);
            Annotation annotationThree = thirdMethod.getAnnotation(MethodAnnotation.class);
            System.out.println("Annotations of first method: " + annotationOne.toString());
            System.out.println("Annotations of second method: " + annotationTwo.toString());
            System.out.println("Annotations of third method: " + annotationThree.toString());
        } catch (NoSuchMethodException exception) {
            System.out.print("At least one method mentioned in the parameter is not found.");
        }
    }
}
