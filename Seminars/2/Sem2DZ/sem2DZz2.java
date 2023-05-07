// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.FileReader;


public class sem2DZz2 {
    public static void main(String[] args) throws Exception {
        String path = "journal.txt";
        String[] data = parse(path);
        System.out.println(strBuild(data));
    }

    public static String[] parse(String path) throws Exception {
        BufferedReader reader1 = new BufferedReader(new FileReader(path));
        int count = 0;
        while (reader1.readLine() != null) {
            count++;
        }
        reader1.close();
        String[] student = new String[count];
        int index = 0;
        BufferedReader reader2 = new BufferedReader(new FileReader(path));
        while (index < student.length) {
            student[index] = reader2.readLine().replace(":", ",").replace("\"", "");
            index++;
        }
        reader2.close();
        return student;
    }

    public static StringBuilder strBuild(String[] students) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < students.length; i++) {
            String[] data = students[i].split(",");
            str.append("Студент " + data[1] + " получил " + data[3] + " по " + "предмету " + data[5] + "\n");
        }
        return str;
    }
}