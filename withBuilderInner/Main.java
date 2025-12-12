package withBuilderInner;

public class Main {
    public static void main(String[] args){
        PC normalPc=new PC.PCBuilder("i7",8,512).build();
        PC gamingPc=new PC.PCBuilder("i7",16,1024).enableGPU("RTX 4090").enableOS("Windows 11").build();
        System.out.println(normalPc.toString());
        System.out.println(gamingPc.toString());
    }
}
