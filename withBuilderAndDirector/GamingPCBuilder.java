package withBuilderAndDirector;

public class GamingPCBuilder implements PCBuilder{
    private String cpu;
    private String gpu;
    private int ram;
    private int storage;
    private String os;

    public GamingPCBuilder(String cpu, int ram, int storage){
        this.cpu=cpu;
        this.ram=ram;
        this.storage=storage;
    }

    @Override
    public PCBuilder enableGPU(String gpu) {
        this.gpu=gpu;
        return this;
    }

    @Override
    public PCBuilder enableOS(String os) {
        this.os=os;
        return this;
    }

    @Override
    public PC build() {
        return new PC(cpu, gpu, ram, storage, os);
    }
}
