package withBuilderAndDirector;

public class Main {
    public static void main(String[] args){
        PCBuilder gamingBuilder = new GamingPCBuilder("i9",16,1024);
        Director gamingDirector = new Director(gamingBuilder);
        PC highEndGamingPC = gamingDirector.constructHighEnd();
        System.out.println(highEndGamingPC.toString());

        PCBuilder officeBuilder = new OfficePCBuilder("i5",8,512);
        Director officeDirector = new Director(officeBuilder);
        PC lowEndOfficePC=officeDirector.constructLowEnd();
        System.out.println(lowEndOfficePC);
    }
}
