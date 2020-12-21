import DiffiHellman.DiffiHellman;
import GenerationSimpleNumber.GeneratorSimpleNumber;

public class Main {
    public static void main(String[] args) {
        GeneratorSimpleNumber gs = new GeneratorSimpleNumber();
        DiffiHellman diffiHellman=new DiffiHellman();
        int a=gs.Proverka();
        int b=gs.Proverka();
        diffiHellman.DiffiH(a,b,860,1123);
    }
}
