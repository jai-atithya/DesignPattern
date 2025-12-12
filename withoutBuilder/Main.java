package withoutBuilder;

public class Main {
    public static void main(String[] args){
        PC pc1=new PC("i7","RTX 4050", 16, 1000, "windows");
        PC pc2=new PC("i5",null,8,500,null);
        PC pc3=new PC("i5",8,500);
        System.out.println(pc1.toString());
        System.out.println(pc2.toString());
        System.out.println(pc3.toString());
        System.out.println("hello");
    }
}
