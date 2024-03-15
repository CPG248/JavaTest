package org.example;

public class Test1_1 {
    public static void main(String[] args){
        int num1 = 15;
        int num2 = 4;
        System.out.printf("num1을  num2로 나눈 몫은 %f 입니다.\n", (double)num1/num2);
        System.out.println();

        int a1 = 10;
        int a2 = a1;
        System.out.printf("a2는 a1과 같은 값 %d 입니다.\n", a2);
        System.out.println();

        for(int num = 5; num > 0; num--)
        {
            System.out.println(num);
        }
        System.out.println();

        String str1 = "hello";
        String str2 = "world";
        System.out.println(str1 + ", " + str2);
        System.out.println();

        int num = 10;
        if(num < 10) {
            System.out.println("10보다 작다");
        }else {
            System.out.println("10보다 크거나 같다.");
        }
        System.out.println();

        float[] arr = new float[10];
        System.out.println(arr.length);
        System.out.println();

        Dog dog1 = new Dog(5, "Max");
        System.out.printf("%d살 강아지 %s\n", dog1.age, dog1.name);
        System.out.println();

        Dog.classInfo();

        dog1.bark();
    }
}

class Dog {
    public int age;
    public String name;

    Dog(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    static void classInfo()
    {
        System.out.println("이름과 나이를 이용해 Dog를 만드는 Dogclass입니다.");
        System.out.println();
    }

    void bark()
    {
        System.out.printf("%s가 멍멍하고 짖습니다.\n", this.name);
        System.out.println();
    }


}
