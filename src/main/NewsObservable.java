package main;

public interface NewsObservable 
{
	public void addObserver(NewsObserver m);
	public void removeObserver (NewsObserver m);
	public void notification();

}
