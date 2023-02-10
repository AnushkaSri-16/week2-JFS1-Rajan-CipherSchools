public class prog1 {
    int arg=5;
    void myTest(int arg) { //default constructor
        this.arg=arg;
    }
    public static void main(String[] args) {
        int arg=10;
        prog1 obj=new prog1();
        obj.myTest(arg);
        System.out.println(obj.arg);
    }
}