import java.util.*;
public class Series
{
	private String title;
	private String prodCompany;
	private int releaseYear;
	private String episodeList[];

	public String getTitle()
	{
		return title;
	}

	public String getProdCompany()
	{
		return prodCompany;
	}

	public int getReleaseYear()
	{
		return releaseYear;
	}

	public String[] getEpisodeList()
	{
		return episodeList;
	}

	public void setTitle(String pTitle)
	{
		title = pTitle;
	}

	public void setProdCompany(String pProdCompany)
	{
		prodCompany = pProdCompany;
	}

	public void setReleaseYear(int pReleaseYear)
	{
		releaseYear = pReleaseYear;
	}

	public void setEpisodeList(String[] pEpisodeList)
	{
		episodeList = pEpisodeList;
	}

	public Series(String pTitle, String pProdCompany, int pReleaseYear, String[] pEpisodeList)
	{
		title = pTitle;
		prodCompany = pProdCompany;
		releaseYear = pReleaseYear;
		episodeList = pEpisodeList;
	}

	public Series(Series pSeries)
	{
		title = pSeries.getTitle();
		prodCompany = pSeries.getProdCompany();
                releaseYear = pSeries.getReleaseYear();
                episodeList = pSeries.getEpisodeList();
	}

	public Series()
	{
		title = "Breaking Bad";
		prodCompany = "AMC";
		releaseYear = 2008;
		Episode episode1[] = new Episode("Pilot", 3000, 1.1);
		episodeList = {episode1}
	}

	public String toString()
	{
		String seriesString;
		seriesString = "Title name is " + title + "production company is " + prodCompany + "Release year is " + releaseYear + "episode list are " + episodeList;
			return seriesString;
	}

	public boolean equals(Object inObject)
	{
		boolean isEqual = false;
		Series inSeries = null;
		if (inObject instanceof Series)
		{
			inSeries = (Series)inObject;
			if (title.equals(inSeries.getTitle()))
				if (prodCompany.equals(inSeries.getProdCompany()))
					if (releaseYear == inSeries.getReleaseYear())
						if (episodeList.equals(inSeries.getEpisodeList()))
							isEqual = true;

		}
		return isEqual;

	}

	public static void main(String[] args)
	{
				
	}
}
class Episode
{
	private String nameOfEp;
	private int time;
	private double order;

	public String getNameOfEp()
	{
		return nameOfEp;
	}

	public int getTime()
	{
		return time;
	}

	public double getOrder()
	{
		return order;
	}

	public void setNameOfEp(String pNameOfEp)
	{
		nameOfEp = pNameOfEp;
	}

	public void setTime(int pTime)
	{
		time = pTime;
	}

	public void setOrder(double pOrder)
	{
		order = pOrder;
	}

	public Episode(String pNameOfEp, int pTime, double pOrder)
	{
		nameOfEp = pNameOfEp;
                time = pTime;
                order = pOrder;
	}

	public Episode(Episode pEpisode)
	{
		nameOfEp = pEpisode.getNameOfEp();
		time = pEpisode.getTime();
		order = pEpisode.getOrder();
	}

	public Episode()
	{
		nameOfEp = "Pilot";
		time = 3000;
		order = 1.1;
	}

	public String toString()
	{
		String episodeString;
		episodeString = "Name of episode is " + nameOfEp + "duration of series in seconds is " + time + "order of episodes in series is " + order;
		return episodeString;
	}

	public boolean equals(Object inObject)
	{
		boolean isEqual = false;
                Episode inEpisode = null;
                if (inObject instanceof Episode)
                {
                        inEpisode = (Episode)inObject;
                        if (nameOfEp.equals(inEpisode.getNameOfEp()))
                                if (time == inEpisode.getTime())
                                        if (order == inEpisode.getOrder())
						isEqual = true;

                }
                return isEqual;
	}

}
