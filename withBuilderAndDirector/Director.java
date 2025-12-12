package withBuilderAndDirector;

public class Director {
    private PCBuilder builder;
    public Director(PCBuilder builder){
        this.builder=builder;
    }
    public PC constructHighEnd(){
        return builder.enableGPU("RTX 4050").enableOS("Windows 11").build();
    }
    public PC constructLowEnd(){
        return builder.build();
    }
}
