class Baathus{
    private Baat[] baater;

    Baathus(int antallPlasser){
        baater = new Baat[antallPlasser];
    }
    void settInn(Baat baat){
       for (int i = 0; i < baater.length; i ++){
        if (baater[i]== null){
            baater[i] = baat;
            return;
        }
       }System.out.println("Det er ingen ledig plass i Baaten");
    }
    void skrivBaater(){
        for (int i = 0; i < baater.length; i ++){
            if(baater[i] != null){
               System.out.println(baater[i].hentInfo());

            }
        }
    } 
}