package withBuilderAndDirector;

public interface PCBuilder {
    PCBuilder enableGPU(String gpu);
    PCBuilder enableOS(String os);
    PC build();
}
