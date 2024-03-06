public class TestBaathus{
    public static void main(String[] args) {
        Baathus baathus = new Baathus(3);
        Baat baat1 = new Baat("Honda");
        Baat baat2 = new Baat("Mitsubishi");
        Baat baat3 = new Baat("Toyota");
        Baat baat4 = new Baat("Mercury");
        baathus.settInn(baat3);
        baathus.settInn(baat1);
        baathus.settInn(baat2);
        baathus.settInn(baat4);
        
        baathus.skrivBaater();
                
    }
}