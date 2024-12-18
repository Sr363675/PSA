package PSA_;

public class PlatinumAccount extends GoldAccount{
    public void rateOfInterest(){
        System.out.println("6%");
    }
    public static void main(String[] args) {
        GoldAccount g = new GoldAccount();
        g.OnlineBanking();
        g.rateOfInterest();

        PlatinumAccount p = new PlatinumAccount();
        p.OnlineBanking();
        p.rateOfInterest();
    }
    
}
