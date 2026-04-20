//Artist
//• name
//• age

class Artist
{
	String name;
	int age;
	Artist()
	{
		this.name="not given";
		this.age=0;
	}
	Artist(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	void display()
	{
		System.out.println("name:"+this.name);
		System.out.println("age:"+this.age);
	}
}

//Painter is-a Artist
//• paintingStyle
//• mediumUsed
//• numberOfPaintings

class Painter extends Artist
{
	String paintingStyle;
	String mediumUsed;
	int numberOfPaintings;
	
	Painter() {
		super();
		this.paintingStyle="not given";
		this.mediumUsed = "not given";
		this.numberOfPaintings=0;
	}

	Painter(String name,int age,String paintingStyle, String mediumUsed, int numberOfPaintings) {
		super(name,age);
		this.paintingStyle = paintingStyle;
		this.mediumUsed = mediumUsed;
		this.numberOfPaintings = numberOfPaintings;
	}

	String getPaintingStyle() {
		return paintingStyle;
	}

	void setPaintingStyle(String paintingStyle) {
		this.paintingStyle = paintingStyle;
	}

	String getMediumUsed() {
		return mediumUsed;
	}

	void setMediumUsed(String mediumUsed) {
		this.mediumUsed = mediumUsed;
	}

	int getNumberOfPaintings() {
		return numberOfPaintings;
	}

	void setNumberOfPaintings(int numberOfPaintings) {
		this.numberOfPaintings = numberOfPaintings;
	}
	void display()
	{
		super.display();
		System.out.println("Painting Style:"+this.paintingStyle);
		System.out.println("Medium Used:"+this.mediumUsed);
		System.out.println("Number od Paintings:"+this.numberOfPaintings);
	}
	
}
//Musician is-a Artist
//• instrument
//• musicGenre
//• numberOfAlbums
class Musician extends Artist
{
	String instrument;
	String musicGenere;
	int numberOfAlbums;
	
	Musician() {
		super();
		this.instrument="not given";
		this.musicGenere="not given";
		this.numberOfAlbums = 0;
	}

	Musician(String name,int age,String instrument, String musicGenere, int numberOfAlbums) {
		super(name,age);
		this.instrument = instrument;
		this.musicGenere = musicGenere;
		this.numberOfAlbums = numberOfAlbums;
	}

	String getInstrument() {
		return instrument;
	}

	void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	String getMusicGenere() {
		return musicGenere;
	}

	void setMusicGenere(String musicGenere) {
		this.musicGenere = musicGenere;
	}

	int getNumberOfAlbums() {
		return numberOfAlbums;
	}

	void setNumberOfAlbums(int numberOfAlbums) {
		this.numberOfAlbums = numberOfAlbums;
	}
	void display()
	{
		super.display();
		System.out.println("Instruments:"+this.instrument);
		System.out.println("musicGener"+this.musicGenere);
		System.out.println("numberOFAlbum:"+this.numberOfAlbums);
	}
}

//Actor is-a Artist
//• filmIndustry
//• numberOfMovies

class Actor extends Artist
{
	String filmIndustry;
	int numberOFMovies;
	
	Actor() {
		super();
		this.numberOFMovies=0;
		this.filmIndustry = "notgiven";
	}

	Actor(String name,int age,String filmIndustry, int numberOFMovies) {
		super(name,age);
		this.filmIndustry = filmIndustry;
		this.numberOFMovies = numberOFMovies;
	}

	String getFilmIndustry() {
		return filmIndustry;
	}

	void setFilmIndustry(String filmIndustry) {
		this.filmIndustry = filmIndustry;
	}

	int getNumberOFMovies() {
		return numberOFMovies;
	}

	void setNumberOFMovies(int numberOFMovies) {
		this.numberOFMovies = numberOFMovies;
	}
	void display()
	{
		super.display();
		System.out.println("FilmIndustry:"+this.filmIndustry);
		System.out.println("numberOFMovies:"+this.numberOFMovies);
	}
}

class TestArtist {

	public static void main(String[] args) {
		Actor a1 = new Actor();
		a1.display();

	}

}
