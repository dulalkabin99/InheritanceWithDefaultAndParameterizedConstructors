public class Test {
  public static void main(String args[]) {
    Student1 s1 = new Student1();
    Student2 s2= new Student2(1, "pasha");
    s1.display();
    s1.printType();
    s2.display();
    s2.printType();
  }
}

class Students {
  int id;
  String name;

  void display() {
    System.out.println(id + " " + name);
  }

}

class Student1 extends Students {
  public Student1() {
    this.id=id;
    this.name=name;
  }

  void printType() {
    System.out.println("This is using Default Constructor");
  }
}

class Student2 extends Students {
  void printType() {
    System.out.println("This is using Parameterized Constructor");
  }

  Student2(int id, String name) {
    this.id=id;
    this.name=name;
  }

}

