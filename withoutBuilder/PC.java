package withoutBuilder;

public class PC {
    private String cpu;
    private String gpu;
    private int ram;
    private int storage;
    private String os;

    public PC(String cpu, String gpu, int ram, int storage, String os) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
    }
    public PC(String cpu, int ram, int storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "PC{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                '}';
    }
}
