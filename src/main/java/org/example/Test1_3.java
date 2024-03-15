package org.example;

public class Test1_3 {
    public static void main(String[] args){

        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.fly();
        흰오리 a흰오리 = new 흰오리();
        a흰오리.fly();
        붉은오리 a붉은오리 = new 붉은오리();
        a붉은오리.fly();
    }

}

class 날개
{
    String name;
    String skill;
    public String GetWing() { return name; }
    public String GetSkill() { return skill; }
    날개(String wing, String skill)
    {
        this.name = wing;
        this.skill = skill;
    }
}

abstract class 오리
{
    날개 wing;
    String name;
    오리(String name)
    {
        this.name = name;
        System.out.println(name + "가 만들어집니다.");
    }

    public void fly()
    {
        System.out.println(name + "가 " + wing.GetWing() + "로 " + wing.GetSkill() +  " 날아갑니다.");
    }
}

class 청둥오리 extends 오리
{
    청둥오리()
    {
        super("청둥오리");
        wing = new 날개("날개", "천천히");
    }

}

class 흰오리 extends 오리
{
    흰오리()
    {
        super("흰오리");
        wing = new 날개("불사조 날개", "불타오르며");
    }
    

}

class 붉은오리 extends 오리
{
    붉은오리()
    {
        super("붉은오리");
        wing = new 날개("로켓날개", "놀라운 속도로 굉음을 내며");
    }
}

