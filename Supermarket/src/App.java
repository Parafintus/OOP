import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PensionerClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {

        Market market = new Market();
        iActorBehaviour item1 = new OrdinaryClient("Boris" + " -");
        iActorBehaviour item2 = new SpecialClient("prezident" + " - Vip", 1111);
        iActorBehaviour item3 = new OrdinaryClient("Babay" + " -");
        iActorBehaviour item4 = new OrdinaryClient("Yashka" + " -");
        iActorBehaviour item5 = new SpecialClient("Pyatachok" + " - Vip", 1221);
        iActorBehaviour item6 = new OrdinaryClient("Ivanushka" + " -");
        iActorBehaviour item7 = new PromoClient("Alyonushka" + " - Promo", 1333);
        iActorBehaviour item8 = new PensionerClient("Sergey Nikolay");
        iActorBehaviour item9 = new TaxService("Stagor");

        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);
        market.acceptToMarket(item4);
        market.acceptToMarket(item5);
        market.acceptToMarket(item6);
        market.acceptToMarket(item7);
        market.acceptToMarket(item8);
        market.acceptToMarket(item9);
        market.update();
    }
}