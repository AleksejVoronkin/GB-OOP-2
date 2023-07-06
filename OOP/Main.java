package JAVA.OOP;

// Добавить пять интерфейсов к классам из ДЗ 1, включающих все концепции, упомянутые на семинаре. включающих:
// - интерфейсы,
// - константы,
// - default методы,
// - перегрузки и переопределения методов.Вы можете выбрать любой класс из ДЗ 1 и добавить к нему интерфейсы. 
//Вам также предоставляется возможность добавить новые методы или использовать уже существующие методы в классе.

////ТУТ ВСЕ КРОМЕ ПЕРЕГРУЗОК И ПЕРЕОПРЕДЕЛЕНИЯ, ИБО Я ПРОСТО НЕ МОГУ НАЙТИ ИМ ПРЕМЕНЕНИЕ В УСЛОВИЯХ ДАННОЙ ПРОГРАММЫ. ОНИ В ФАЙЛАХ ПРО КОТОВ
public class Main {

 public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(10,5);
      
        
        System.out.println("///////////");
                rectangle1.Start();
                rectangle1.result();
                rectangle1.End();

        System.out.println("///////////");
                rectangle2.Start1();
                rectangle2.result();
                rectangle2.End();

        }       
}
