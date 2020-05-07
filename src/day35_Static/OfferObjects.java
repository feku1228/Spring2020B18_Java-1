package day35_Static;

public class OfferObjects {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA", "BOA", 100000, true);

        System.out.println( offer1 );

        Offer offer2 = new Offer();
        offer2.setInfo("KY", "CapitalOne", 120000, false);

        System.out.println( offer2 );


    }

}
