package JAVA.OOP;

public class Rectangle implements InterFace, Const, Def{
    
    public void Start(){
        System.out.println("НАЧАЛО РАБОТЫ КОНСТАНТЫ");
        System.out.println();
    }
    public void Start1(){
        System.out.println("НАЧАЛО РАБОТЫ ПРОГРАММЫ");
        System.out.println();
    }
    public void End(){
        System.out.println();
        System.out.println("КОНЕЦ РАБОТЫ ПРОГРАММЫ");
    }

    private int width;
    private int height;

       // Конструктор без параметров, который создает прямоугольник 2 на 1.
    public Rectangle() {    
        width = W; 
        height = H;
    }
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }

    public void result() {
        System.out.println("Ширина: " + getWidth()+Cm());
        System.out.println("Высота: " + getHeight()+Cm());
        System.out.println("Площадь: " + calculateArea()+Cm2());
        System.out.println("Периметр: " + calculatePerimeter()+Cm());
    }
    
}