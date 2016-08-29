package cn.rayest.annotation;

import java.lang.annotation.Annotation;

/**
 * Created by Rayest on 2016/7/9 0009.
 *
 * ʹ�÷����ȡע�����Ϣ��ģ�⴦��ע����Ϣ������
 */
public class demoAnnotation {
    public static void main(String[] args) throws NoSuchFieldException {
        try {
            Class clazz = Class.forName("cn.rayest.annotation.Student");

//            ������������Чע��
            Annotation[] annotations = clazz.getAnnotations();
            for (Annotation a: annotations){
                System.out.println(a);
            }

//            �����ָ����ע��
            Table table = (Table) clazz.getAnnotation(Table.class);
            System.out.println(table.value());

//            ���������Ե�ע��
            java.lang.reflect.Field field = clazz.getDeclaredField("name");
            Field field1 = field.getAnnotation(Field.class);
            System.out.println(field1.columnName() + "--" + field1.type() + "--" + field1.length());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
