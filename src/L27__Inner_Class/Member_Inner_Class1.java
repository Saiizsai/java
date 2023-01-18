package L27__Inner_Class;
public class Member_Inner_Class1 {

    int a = 10 ;
    String name = "member inner class"; //Data Member

    //member inner class
    public class MemberInnerClass{
        void show(){
            System.out.println("this is "+ name);
        }
    }

    static class SecondMemberInnerClass{
        static void met(){
            System.out.println("this is second member inner class");
        }
    }

    void method(){
        class A{
            void a(){
                System.out.println(name);
            }
        }
        A objA = new A();
        objA.a();
    }

    public static void main(String[] args) {
        Member_Inner_Class1 obj = new Member_Inner_Class1();
        System.out.println(obj.a);

        Member_Inner_Class1.MemberInnerClass mobj = obj.new MemberInnerClass();
        mobj.show();

        SecondMemberInnerClass.met();

        obj.method();

    }
}

//Nested Class

//Instance Class
//member inner class
//anonymous inner class
//local inner class

//Static class

