package main;

public class maindisplay 
{
	public static void main (String[] args)
	{
		System.out.println("***Creating a new News Station Daily Herald with current" +"headline of \"Cheap Dates for summer flights\"****");
		NewsStation newsStation = new NewsStation ("Daily herald", "\"Cheap Dates for summer flights\"" );
		
		NewsSubscriber sub1 = new NewsSubscriber ("Kate", newsStation);
		NewsSubscriber sub2 = new NewsSubscriber ("Jake", newsStation);
		System.out.println("****** New Subscribers, Kate and Jake, have just subscribed " +
                "to News Station Daily Herald. ******");
        newsStation.addObserver(sub1);
        newsStation.addObserver(sub2);

        newsStation.setNews("\"Millennium Park Summer Film Series Announces 2017 Screening List\"" );

        System.out.println("\n****** Daily Herald subscriber Kate, have just unsubcribed  " +
                "from the News station. ******");
        newsStation.removeObserver(sub1);

        newsStation.setNews("\"TCS expands summer programs for students\"");

        NewsApplication newsApp = new NewsApplication("RSS", newsStation);
        System.out.println("\n****** The RSS News Application has just subscribed " +
                "to News Station Daily Herald ******");
        newsStation.addObserver(newsApp);

        newsStation.setNews("\"Ten ways to diminish travel stress\"");


		
	}

}
