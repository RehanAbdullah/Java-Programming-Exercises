import java.util.ArrayList;

public class AdTest {
	
	public static void main(String[] arg) {
		
		//Advert test1 = new Advert(100); //this won't compile
		Advert test2 = new NewspaperAd(100,10,10); // this is OK
		
		
		ArrayList<Advert> campaign = new ArrayList<Advert>();
		//campaign.add(new Advert(1000)); causes error - cannot instantiate Advert
		campaign.add(new Billboard(500, 7, 200));
		campaign.add(new NewspaperAd(200, 10, 10));
		campaign.add(new Billboard(500, 6, 50));
		
          
		for (Advert ad : campaign) {
				System.out.println(ad.toString());
				System.out.println("Cost of advert: " + ad.cost() + "\n");
		}
		
	}
}