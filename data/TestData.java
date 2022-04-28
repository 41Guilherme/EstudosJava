package data;

public class TestData {
    
    public static void Test(){
        Data d1 = new Data(22,10,2000);
        Data d2 = new Data(18,11,2004);

        System.out.println("DATA 1: " + d1);
        System.out.println("DATA 2: " + d2);

        d1.trocartCon(d2);
        System.out.println("Após a troca");
        System.out.println("DATA 1: " + d1);
        System.out.println("DATA 2: " + d2);
    }
}
