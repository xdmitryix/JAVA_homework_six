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
    }
}