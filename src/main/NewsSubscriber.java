package main;

public class NewsSubscriber implements NewsObserver 
{
	private final String name;
	private final NewsStation station;
	String currentNews;
	
	public NewsSubscriber (String name, NewsStation station)
	{
		this.name = name;
		this.station = station;
		this.currentNews = station.getcurrentNews();

	}
	
	@Override
	public void update()
	{
		currentNews = station.getcurrentNews();
		
		System.out.println("News Subscriber," + name + ", received a notification.");
		System.out.println("The current headline is "+ currentNews );
	}

}
