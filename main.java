import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

public class main {

    public static void main(String[] args) {
        noteBook noteBook1 = new noteBook(16, 500, "windows", "black");
        noteBook noteBook2 = new noteBook(32, 500, "macos", "gray");
        noteBook noteBook3 = new noteBook(8, 500, "windows", "white");
        noteBook noteBook4 = new noteBook(16, 500, "windows", "white");
        noteBook noteBook5 = new noteBook(64, 500, "linux", "black");
        noteBook noteBook6 = new noteBook(8, 500, "windows", "black");
        noteBook noteBook7 = new noteBook(16, 500, "macos", "gray");
        ArrayList<noteBook> list = new ArrayList<>(Arrays.asList(noteBook1, noteBook2, noteBook3, noteBook4, noteBook5, noteBook6, noteBook7));
        System.out.println(list.toString());
        System.out.println("Выберете параметр для поиска: 1-ОЗУ, 2-Жесткий диск, 3-Операционная система, 4-цвет.");
        Scanner iScanner = new Scanner(System.in, "Cp866");
        String command = iScanner.nextLine();
        if (command.equals("ОЗУ")) {
            
        }else{
            if (command.equals("1")) {

            }else{
                if (command.equals("2")) {
            }else{
                if (command.equals("3")){

                }else{
                    if (command.equals("4")){

                }else{
                    System.out.println("Некорректная команда!");
                }
            }
        }


    }
}
    }
}