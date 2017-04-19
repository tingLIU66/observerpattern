package main;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NewsStation implements NewsObservable 
{
	
	private Set<NewsObserver> setofnewsObservers;
	String news;
	String name;
	
	public NewsStation (String name, String news)
	{
		setofnewsObservers = new HashSet<>();
		this.name = name;
		this.news = news;
	}
	
	public void addObserver(NewsObserver m)
	{
		setofnewsObservers.add(m);
		
	}
	public void removeObserver(NewsObserver m)
	{
		setofnewsObservers.remove(m);
		
	}
	
	public void notification()
	{
		//to notify all observers in the set
		for (NewsObserver observer : setofnewsObservers)
		{
			observer.update();
		}
	}
	public void setNews ( String newNews)
	{
		System.out.println("\n News Station " + name + " , is updating headline to " + newNews+ ".");
		news = newNews;
		notification();
		
	}
	public String getcurrentNews()
	{
		return news;
	}
	public Set<NewsObserver> getSetOfNewsObservers()
	{
		return setofnewsObservers;
	}

	

}
