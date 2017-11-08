public class ClassTest
{
    public static void main(String[] args)
    {
        People p1 = new People();
        p1.total++;
        p1.name = "alex";
        p1.age = 19;
        p1.addCat(p1.cat,"c1");
        System.out.println(p1.cat.name + "\n" + p1.cat.num + "\n" + p1.cat.allNum + "\n" + p1.cat.total + "\n");
    }
}

class People
{
    String name;
    int age;
    static int total = 0;
    Cat cat;

    void addCat(Cat cat,String name)
    {
        this.cat = new Cat(name);
        System.out.println("add a cat\n");
    }




}

class Cat
{
    String name;
    int age;
    int num;
    static int total = 0;
    static int allNum = 1;

    public Cat(String name)
    {
        this.name = name;
        this.num = this.allNum;
        this.allNum = this.allNum++;
        this.total ++;
    }
}
