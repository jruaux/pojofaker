package org.ruaux.pojofaker;

import java.util.Locale;
import java.util.Random;

import com.github.javafaker.service.RandomService;

public class Faker {
	private final Ancient ancient;
	private final App app;
	private final Artist artist;
	private final Avatar avatar;
	private final Lorem lorem;
	private final Music music;
	private final Name name;
	private final Number number;
	private final Internet internet;
	private final PhoneNumber phoneNumber;
	private final Pokemon pokemon;
	private final Address address;
	private final Business business;
	private final Book book;
	private final ChuckNorris chuckNorris;
	private final Color color;
	private final Commerce commerce;
	private final Currency currency;
	private final Company company;
	private final Crypto crypto;
	private final IdNumber idNumber;
	private final Hacker hacker;
	private final Options options;
	private final Code code;
	private final Finance finance;
	private final Food food;
	private final GameOfThrones gameOfThrones;
	private final DateAndTime dateAndTime;
	private final Demographic demographic;
	private final Educator educator;
	private final Shakespeare shakespeare;
	private final SlackEmoji slackEmoji;
	private final Space space;
	private final Superhero superhero;
	private final Bool bool;
	private final Team team;
	private final Beer beer;
	private final University university;
	private final Cat cat;
	private final File file;
	private final Stock stock;
	private final LordOfTheRings lordOfTheRings;
	private final Zelda zelda;
	private final HarryPotter harryPotter;
	private final RockBand rockBand;
	private final Esports esports;
	private final Friends friends;
	private final Hipster hipster;
	private final Job job;
	private final TwinPeaks twinPeaks;
	private final RickAndMorty rickAndMorty;
	private final Yoda yoda;
	private final Matz matz;
	private final Witcher witcher;
	private final Weather weather;
	private final Lebowski lebowski;
	private com.github.javafaker.Faker faker;

	public Faker() {
		this(Locale.ENGLISH);
	}

	public Faker(Locale locale) {
		this(locale, null);
	}

	public Faker(Random random) {
		this(Locale.ENGLISH, random);
	}

	public Faker(Locale locale, Random random) {
		this.faker = new com.github.javafaker.Faker(locale, random);
		this.ancient = new Ancient(faker);
		this.app = new App(faker);
		this.artist = new Artist(faker);
		this.avatar = new Avatar(faker);
		this.lorem = new Lorem(faker);
		this.music = new Music(faker);
		this.name = new Name(faker);
		this.number = new Number(faker);
		this.internet = new Internet(faker);
		this.phoneNumber = new PhoneNumber(faker);
		this.pokemon = new Pokemon(faker);
		this.address = new Address(faker);
		this.book = new Book(faker);
		this.business = new Business(faker);
		this.chuckNorris = new ChuckNorris(faker);
		this.color = new Color(faker);
		this.idNumber = new IdNumber(faker);
		this.hacker = new Hacker(faker);
		this.company = new Company(faker);
		this.crypto = new Crypto(faker);
		this.commerce = new Commerce(faker);
		this.currency = new Currency(faker);
		this.options = new Options(faker);
		this.code = new Code(faker);
		this.file = new File(faker);
		this.finance = new Finance(faker);
		this.food = new Food(faker);
		this.gameOfThrones = new GameOfThrones(faker);
		this.dateAndTime = new DateAndTime(faker);
		this.demographic = new Demographic(faker);
		this.educator = new Educator(faker);
		this.shakespeare = new Shakespeare(faker);
		this.slackEmoji = new SlackEmoji(faker);
		this.space = new Space(faker);
		this.superhero = new Superhero(faker);
		this.team = new Team(faker);
		this.bool = new Bool(faker);
		this.beer = new Beer(faker);
		this.university = new University(faker);
		this.cat = new Cat(faker);
		this.stock = new Stock(faker);
		this.lordOfTheRings = new LordOfTheRings(faker);
		this.zelda = new Zelda(faker);
		this.harryPotter = new HarryPotter(faker);
		this.rockBand = new RockBand(faker);
		this.esports = new Esports(faker);
		this.friends = new Friends(faker);
		this.hipster = new Hipster(faker);
		this.job = new Job(faker);
		this.twinPeaks = new TwinPeaks(faker);
		this.rickAndMorty = new RickAndMorty(faker);
		this.yoda = new Yoda(faker);
		this.matz = new Matz(faker);
		this.witcher = new Witcher(faker);
		this.weather = new Weather(faker);
		this.lebowski = new Lebowski(faker);
	}

	/**
	 * Constructs Faker instance with default argument.
	 *
	 * @return {@link Faker#Faker()}
	 */
	public static Faker instance() {
		return new Faker();
	}

	/**
	 * Constructs Faker instance with provided {@link Locale}.
	 *
	 * @param locale - {@link Locale}
	 * @return {@link Faker#Faker(Locale)}
	 */
	public static Faker instance(Locale locale) {
		return new Faker(locale);
	}

	/**
	 * Constructs Faker instance with provided {@link Random}.
	 *
	 * @param random - {@link Random}
	 * @return {@link Faker#Faker(Random)}
	 */
	public static Faker instance(Random random) {
		return new Faker(random);
	}

	/**
	 * Constructs Faker instance with provided {@link Locale} and {@link Random}.
	 *
	 * @param locale - {@link Locale}
	 * @param random - {@link Random}
	 * @return {@link Faker#Faker(Locale, Random)}
	 */
	public static Faker instance(Locale locale, Random random) {
		return new Faker(locale, random);
	}

	/**
	 * Returns a string with the '#' characters in the parameter replaced with
	 * random digits between 0-9 inclusive.
	 * <p>
	 * For example, the string "ABC##EFG" could be replaced with a string like
	 * "ABC99EFG".
	 *
	 * @param numberString
	 * @return
	 */
	public String numerify(String numberString) {
		return faker.numerify(numberString);
	}

	/**
	 * Returns a string with the '?' characters in the parameter replaced with
	 * random alphabetic characters.
	 * <p>
	 * For example, the string "12??34" could be replaced with a string like
	 * "12AB34".
	 *
	 * @param letterString
	 * @return
	 */
	public String letterify(String letterString) {
		return faker.letterify(letterString);
	}

	/**
	 * Returns a string with the '?' characters in the parameter replaced with
	 * random alphabetic characters.
	 * <p>
	 * For example, the string "12??34" could be replaced with a string like
	 * "12AB34".
	 *
	 * @param letterString
	 * @param isUpper
	 * @return
	 */
	public String letterify(String letterString, boolean isUpper) {
		return faker.letterify(letterString, isUpper);
	}

	/**
	 * Applies both a {@link #numerify(String)} and a {@link #letterify(String)}
	 * over the incoming string.
	 *
	 * @param string
	 * @return
	 */
	public String bothify(String string) {
		return faker.bothify(string);
	}

	/**
	 * Applies both a {@link #numerify(String)} and a {@link #letterify(String)}
	 * over the incoming string.
	 *
	 * @param string
	 * @param isUpper
	 * @return
	 */
	public String bothify(String string, boolean isUpper) {
		return faker.bothify(string, isUpper);
	}

	/**
	 * Generates a String that matches the given regular expression.
	 */
	public String regexify(String regex) {
		return faker.regexify(regex);
	}

	public RandomService random() {
		return this.faker.random();
	}

	public Currency currency() {
		return currency;

	}

	public Ancient ancient() {
		return ancient;
	}

	public App app() {
		return app;
	}

	public Artist artist() {
		return artist;
	}

	public Avatar avatar() {
		return avatar;
	}

	public Music music() {
		return music;
	}

	public Name name() {
		return name;
	}

	public Number number() {
		return number;
	}

	public Internet internet() {
		return internet;
	}

	public PhoneNumber phoneNumber() {
		return phoneNumber;
	}

	public Pokemon pokemon() {
		return pokemon;
	}

	public Lorem lorem() {
		return lorem;
	}

	public Address address() {
		return address;
	}

	public Book book() {
		return book;
	}

	public Business business() {
		return business;
	}

	public ChuckNorris chuckNorris() {
		return chuckNorris;
	}

	public Color color() {
		return color;
	}

	public Commerce commerce() {
		return commerce;
	}

	public Company company() {
		return company;
	}

	public Crypto crypto() {
		return crypto;
	}

	public Hacker hacker() {
		return hacker;
	}

	public IdNumber idNumber() {
		return idNumber;
	}

	public Options options() {
		return options;
	}

	public Code code() {
		return code;
	}

	public File file() {
		return file;
	}

	public Finance finance() {
		return finance;
	}

	public Food food() {
		return food;
	}

	public GameOfThrones gameOfThrones() {
		return gameOfThrones;
	}

	public DateAndTime date() {
		return dateAndTime;
	}

	public Demographic demographic() {
		return demographic;
	}

	public Educator educator() {
		return educator;
	}

	public SlackEmoji slackEmoji() {
		return slackEmoji;
	}

	public Shakespeare shakespeare() {
		return shakespeare;
	}

	public Space space() {
		return space;
	}

	public Superhero superhero() {
		return superhero;
	}

	public Bool bool() {
		return bool;
	}

	public Team team() {
		return team;
	}

	public Beer beer() {
		return beer;
	}

	public University university() {
		return university;
	}

	public Cat cat() {
		return cat;
	}

	public Stock stock() {
		return stock;
	}

	public LordOfTheRings lordOfTheRings() {
		return lordOfTheRings;
	}

	public Zelda zelda() {
		return zelda;
	}

	public HarryPotter harryPotter() {
		return harryPotter;
	}

	public RockBand rockBand() {
		return rockBand;
	}

	public Esports esports() {
		return esports;
	}

	public Friends friends() {
		return friends;
	}

	public Hipster hipster() {
		return hipster;
	}

	public Job job() {
		return job;
	}

	public TwinPeaks twinPeaks() {
		return twinPeaks;
	}

	public RickAndMorty rickAndMorty() {
		return rickAndMorty;
	}

	public Yoda yoda() {
		return yoda;
	}

	public Matz matz() {
		return matz;
	}

	public Witcher witcher() {
		return witcher;
	}

	public Weather weather() {
		return weather;
	}

	public Lebowski lebowski() {
		return lebowski;
	}

	public String resolve(String key) {
		return faker.resolve(key);
	}

	public String expression(String expression) {
		return faker.expression(expression);
	}
}
