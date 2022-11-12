package day46_JavaRecap.ShapeTask;

public class Shape {

    public String name;

    public Shape(String name) {
        this.name = name;

        if (name.isEmpty()){
            throw new RuntimeException("Shape name cannot be empty");
        }

        for (int i=0; i<name.length(); i++){
            char eachCh = name.charAt(i);
            if (!Character.isLetter(eachCh) ){
                throw new RuntimeException("No Such a Shape");
            }
        }

    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +", "+
                "Area= " + area() + ", "+
                "Perimeter= " + perimeter();
    }
}
