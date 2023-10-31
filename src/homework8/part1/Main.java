package homework8.part1;

public class Main {
    public static void main(String[] args){
        Model model = new Model();
        model.os = "android";
        model.memory = 256;
        model.setModelname("S21");
        model.printos();
        model.printmemory();
    }
}
