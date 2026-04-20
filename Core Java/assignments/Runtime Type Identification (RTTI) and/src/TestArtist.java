//• Artist
//• Painter (extends Artist)
//• Musician (extends Artist)
//• Actor (extends Artist)

abstract class Artist
{
	String artistName;
	
	String getArtistName() {
		return artistName;
	}

	void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	Artist(String artistName)
	{
		this.artistName = artistName;
	}
	
	void checkMusicEventEligibility(Artist a1)
	{
		if( a1 instanceof Musician)
		{
	
			Musician c1 = (Musician)a1;
			System.out.println("Musician "+c1.getArtistName()+" is allowed for the Music Event and is playing "+c1.getInstrument());
		}
		else
		{
			System.out.println("not allow");
		}
	}
}
class Painter extends Artist
{

	Painter(String artistName) {
		super(artistName);
	}
	
}
class Musician extends Artist
{

	Musician(String artistName) {
		super(artistName);
	}

	String getInstrument()
	{
		return "Basuri";
	}
}
class Actor extends Artist
{

	Actor(String artistName) {
		super(artistName);
	}
}


public class TestArtist {

	public static void main(String[] args) {
		Artist a1 = new Actor("Yash");
		a1.checkMusicEventEligibility(a1);

	}

}
