package main;

//MailApplication is one of the two ConcreteObservers that store current mail and keeps reference to post office to 
//check the current mail when notification is received

public class NewsApplication implements NewsObserver 
{
	private final String name;
	private final NewsStation station;
    private String currentNews;
	
	public NewsApplication (String name, NewsStation station)
	{
		this.name = name;
		this.station = station ;
		this.currentNews = station.getcurrentNews();
		
		
	}
	@Override
	public void update()
	{
		currentNews = station.getcurrentNews();
		
		System.out.println("News Station, "+ name + ", received a notification.");
		System.out.println("The current headline is "+ currentNews );
	}
	

}
