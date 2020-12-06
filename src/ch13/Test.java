package ch13;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lucy
 */
public class Test {
    public static void main(String[] args) throws IOException {
        List<Student> students = Arrays.asList(new Student[]{
                new Student("lucy", 18, 80.9d), new Student("李四", 17, 67.5d)
        });
        writeStudents(students);
        for (Student s : students) {
            System.out.println(s.getAge());
            System.out.println(s.getName());
            System.out.println(s.getScore());
        }
    }

    public static void writeStudents(List<Student> students) throws IOException {
        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("students.dat"));
        try {
            outputStream.writeInt(students.size());
            for (Student s : students) {
                outputStream.writeUTF(s.getName());
                outputStream.writeInt(s.getAge());
                outputStream.writeDouble(s.getScore());
            }
        } finally {
            outputStream.close();
        }

    }

    public static List<Student> readStudents() throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream("students.dat"));
        try {
            int size = inputStream.readInt();
            List<Student> students = new ArrayList<>(size);
            for (int i = 0; i < size; ++i) {
                Student s = new Student();
                s.setName(inputStream.readUTF());
                s.setAge(inputStream.readInt());
                s.setScore(inputStream.readDouble());
            }

            return students;
        } finally {
            inputStream.close();
        }
    }
}
