package cn.rayest.annotation;

import java.lang.annotation.Annotation;

/**
 * Created by Rayest on 2016/7/9 0009.
 *
 * 使用反射读取注解的信息，模拟处理注解信息的流程
 */
public class demoAnnotation {
    public static void main(String[] args) throws NoSuchFieldException {
        try {
            Class clazz = Class.forName("cn.rayest.annotation.Student");

//            获得类的所有有效注解
            Annotation[] annotations = clazz.getAnnotations();
            for (Annotation a: annotations){
                System.out.println(a);
            }

//            获得类指定的注解
            Table table = (Table) clazz.getAnnotation(Table.class);
            System.out.println(table.value());

//            获得类的属性的注解
            java.lang.reflect.Field field = clazz.getDeclaredField("name");
            Field field1 = field.getAnnotation(Field.class);
            System.out.println(field1.columnName() + "--" + field1.type() + "--" + field1.length());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
