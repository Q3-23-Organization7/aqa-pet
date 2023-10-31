package homework8.part1;

public class Model extends MobilePhone implements Mobile {

    private String modelname;

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getModelname() {
        return modelname;
    }

    @Override
    protected void printos() {
        System.out.println("os: " + os);
    }

    @Override
    public void printmemory() {
        System.out.println("memory " + modelname + ": " + memory);
    }
}
