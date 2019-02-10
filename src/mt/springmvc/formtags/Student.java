package mt.springmvc.formtags;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;

	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguages;
	
	private String[] operatingSystems;
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public LinkedHashMap<String, String> getFavoriteLanguages() {
		return favoriteLanguages;
	}

	public void setFavoriteLanguages(LinkedHashMap<String, String> favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public Student() {

		// Populate the country select tag
		countryOptions = new LinkedHashMap<>();

		countryOptions.put("IR", "Iran");
		countryOptions.put("FR", "France");
		countryOptions.put("EN", "England");
		countryOptions.put("DE", "Germany");
		countryOptions.put("US", "USA");
		countryOptions.put("RU", "Russia");
		
		favoriteLanguages = new LinkedHashMap<>();
		
		favoriteLanguages.put("Java", "Java");
		favoriteLanguages.put("C#", "C#");
		favoriteLanguages.put("Python", "Python");
		favoriteLanguages.put("C++", "C++");
		favoriteLanguages.put("Groovy", "Groovy");

	}

}
