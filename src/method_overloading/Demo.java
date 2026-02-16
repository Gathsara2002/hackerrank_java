package method_overloading;

/**
 * @author : Gathsara
 * created : 2/16/2026 -- 5:28 PM
 **/

public class Demo {
    public static void main(String []args){
        MotorCycle M=new MotorCycle();
    }
}

class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp=super.define_me();

        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
