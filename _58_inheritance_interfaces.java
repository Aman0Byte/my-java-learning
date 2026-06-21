interface sampleInterfaces{
     void meth1();
     void meth2();
}
interface  childSampleInterface extends sampleInterfaces{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    public void meth1() {
        System.out.println("meth1");
    }
    public void meth2() {
        System.out.println("meth2");
    }


    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }
}


public class _58_inheritance_interfaces {
    public static void main(String[] args) {
MySampleClass msc = new MySampleClass();
msc.meth1();
msc.meth2();
msc.meth3();
    }
}
