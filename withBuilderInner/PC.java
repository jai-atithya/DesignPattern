package withBuilderInner;

public class PC {
    private String cpu;
    private String gpu;
    private int ram;
    private int storage;
    private String os;

    private PC(PCBuilder builder){
        this.cpu=builder.cpu;
        this.gpu=builder.gpu;
        this.ram=builder.ram;
        this.storage=builder.storage;
        this.os=builder.os;
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

    public static class PCBuilder{
        private String cpu;
        private String gpu;
        private int ram;
        private int storage;
        private String os;

        public PCBuilder(String cpu, int ram, int storage){
            this.cpu=cpu;
            this.ram=ram;
            this.storage=storage;
        }
        public PCBuilder enableGPU(String gpu){
            this.gpu=gpu;
            return this;
        }
        public PCBuilder enableOS(String os){
            this.os=os;
            return this;
        }
        public PC build(){
//            return new PC(cpu,gpu,ram,storage,os);
            return new PC(this);
        }

    }

}
