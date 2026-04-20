//Player
//• name
//• age
//• country
//• matchesPlayed
//• jerseyNumber
class Player
{
	String name;
	int age;
	String country;
	int matchesPlayed;
	int jerseynumber;
	
	
	
	Player() {
		this.name="Not giveb";
		this.country="not given";
		this.age = 0;
		this.matchesPlayed=0;
		this.jerseynumber=0;
	}
	
	Player(String name, int age, String country, int matchesPlayed, int jerseynumber) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.matchesPlayed = matchesPlayed;
		this.jerseynumber = jerseynumber;
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

	String getCountry() {
		return country;
	}

	void setCountry(String country) {
		this.country = country;
	}

	int getMatchesPlayed() {
		return matchesPlayed;
	}

	void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	int getJerseynumber() {
		return jerseynumber;
	}

	void setJerseynumber(int jerseynumber) {
		this.jerseynumber = jerseynumber;
	}
	void display()
	{
		System.out.println("name:"+this.name);
		System.out.println("country:"+this.country);
		System.out.println("age:"+this.age);
		System.out.println("jersey number:"+this.jerseynumber);
		System.out.println("matches played:"+this.matchesPlayed);
	}  
}


//CricketPlayer is-a Player
//• totalRuns
//• totalWickets
//• battingStyle
//• bowlingStyle

class CricketPlayer extends Player
{
	int totalruns;
	int totalWickets;
	String battingStyle;
	String bowlingStyle;
	
	CricketPlayer() {
		super();
		this.totalruns=0;
		this.totalWickets=0;
		this.battingStyle="not given";
		this.bowlingStyle="not given";
	}

	CricketPlayer(String name, int age, String country, int matchesPlayed, int jerseynumber,int totalruns, int totalWickets, String battingStyle, String bowlingStyle) {
		super(name,age,country,matchesPlayed,jerseynumber);
		this.totalruns = totalruns;
		this.totalWickets = totalWickets;
		this.battingStyle = battingStyle;
		this.bowlingStyle = bowlingStyle;
	}

	int getTotalruns() {
		return totalruns;
	}

	void setTotalruns(int totalruns) {
		this.totalruns = totalruns;
	}

	int getTotalWickets() {
		return totalWickets;
	}

	void setTotalWickets(int totalWickets) {
		this.totalWickets = totalWickets;
	}

	String getBattingStyle() {
		return battingStyle;
	}

	void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	String getBowlingStyle() {
		return bowlingStyle;
	}

	void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
	void display()
	{
		super.display();
		System.out.println("totalruns:"+this.totalruns);
		System.out.println("totalwickets:"+this.totalWickets);
		System.out.println("BattingStyle:"+this.battingStyle);
		System.out.println("Bow;ing style:"+this.bowlingStyle);
	}
	
}

//FootballPlayer is-a Player
//• totalGoals
//• playingPosition

class FootballPlayer extends Player
{
	int totalgoals;
	String playing_position;
	
	
	FootballPlayer() {
		super();
		this.totalgoals=0;
		this.playing_position="not given";
	}

	FootballPlayer(String name, int age, String country, int matchesPlayed, int jerseynumber,int totalgoals, String playing_position) {
		super(name,age,country,matchesPlayed,jerseynumber);
		this.totalgoals = totalgoals;
		this.playing_position = playing_position;
	}

	int getTotalgoals() {
		return totalgoals;
	}

	void setTotalgoals(int totalgoals) {
		this.totalgoals = totalgoals;
	}

	String getPlaying_position() {
		return playing_position;
	}

	void setPlaying_position(String playing_position) {
		this.playing_position = playing_position;
	}
	void display()
	{
		super.display();
		System.out.println("Playing position:"+this.playing_position);
		System.out.println("Total goals:"+this.totalgoals);
	}
}

 class TestPlayer {

	public static void main(String[] args) {
		
		CricketPlayer c1 = new CricketPlayer();
		FootballPlayer f1 = new FootballPlayer();
		c1.display();
		System.out.println();
		f1.display();
	}

}
