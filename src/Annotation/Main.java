package Annotation;

import java.lang.reflect.Field;

public class Main {
    public static void main (String[] args) throws IllegalAccessException {
        Profile anna = new Profile(1,"A&nna!!", "Good", 1990);
        specialCharCheckerHandler(anna);
        
    }
    public static void specialCharCheckerHandler(Profile profile) throws IllegalAccessException {
        Class<? extends Profile> aClass = profile.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(SpecialCharacterChecker.class)) {
                String o = (String) field.get(profile);
                if (o.matches("[A-Za-z\\p{Punct}]{1,}")) {
                    String msg = field.getAnnotation(SpecialCharacterChecker.class).msg();
                    System.out.println(msg);
                } else {
                    System.out.println("Good to go!!");
                }
            }
        }

    }
}
