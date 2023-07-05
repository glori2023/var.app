package by.itstep.oop.casting;

public class ShapesTester {

    public static void shapeTest(Shape shape){
        shape.calculateP();
        shape.calculateS();
        shape.print();
        shape.showInfo();
    }




    public static void main(String[] args) {
        Triangle t1 = new Triangle(11,9,6);
        t1.setColor("red");
                t1.calculateP();
        t1.calculateS();
        t1.print();
        t1.showInfo();


       Rectangle r1 = new Rectangle(2,5);
        Rectangle r2 = new Rectangle(5);
        r1.setColor("green");
        r1.calculateP();
        r1.calculateS();
        r1.print();
        r1.showInfo();

        r2.setColor("orange");
        r2.calculateP();
        r2.calculateS();
        r2.print();
        r2.showInfo();


   //casting  приведение типов
   // приведение типов не меняет поля, функционал - ничего не делает с объектом

   // upcasting вид кастинга, когда конкретный объект рассматриваем обобщенной ссылкой родительского класса
   Shape sh1 = new Triangle(3,7,6);
   // upcasting (<super type>) instance
   Shape sh2 = (Shape) new Rectangle(54);

// позволяет расссматривать конкретные экземпляры под видом общих ссылок, тем самым функционал конкретного класса становится недоступным






        Shape sh3 = new Triangle(5,7,11);
      // sh3.setC(200000); не работает

        //downСasting   из общего экземпляра получаем более конкретный .всегда в явной форме
        Triangle tr2 = (Triangle) sh3 ; //всегда явная форма
        tr2.setC(9);

        Rectangle rectangle = new Rectangle(7);
        Triangle triangle = new Triangle(3,4,5);


        shapeTest((Shape) rectangle);
        shapeTest(triangle);

    }





}
