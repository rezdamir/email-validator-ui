package A3.email_validator_ui;

import java.util.regex.*;

public class emailValidator {
	/**
	 * This method returns true if the input string has a single '@' character.
	 * @param email string to test
	 * @return 1 if the string has a single '@' character and 0 otherwise
	 */
	public int validateAtSign(String email) {
		if ( Pattern.matches("^[^@]*@[^@]*", email) )
			return 1;
		else return 0;
	}
	/**
	 * This method returns true if the string input string has at least one '.' character.
	 * @param email string to test
	 * @return 1 if the string has at least one '.' character and 0 otherwise
	 */
	public int validateDotSign(String email) {
		
		if ( Pattern.matches(".*\\.+.*", email) )
			return 1;
		else return 0;
	}
	/**
	 * This method returns true if the string input string has at least one '.' character.
	 * @param email string to test
	 * @return the number of tests passed
	 */
	public int validateStage1(String email) {
		int count = 0;
		count += validateAtSign(email);
		count += validateDotSign(email);
		return count;
	}
	/**
	 * This method returns true if the string input has the specified 5 domain names followed by an @ symbol
	 * @param email
	 * @return 1 if valid domain name exists in input string
	 */
	public int validateDomainName(String email) {
		if ( Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@(google|facebook|yahoo|microsoft|hotmail|dal)+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", email) )
				return 1;
		return 0;
	}
	/**
	 * This method returns 1 if input abides by actual email address rules
	 * @param email
	 * @return 1 if actual email address rules followed
	 */
	public int validateEmailAddress(String email) {
	
		if ( Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", email))
			return 1;
		return 0;
	}
	/**
	 * This method validates the stage 1 and the additional methods required by stage 2
	 * @param email
	 * @return returns the number of passed tests
	 */
	public int validateStage2(String email) {
		int count = 0;
		count += validateStage1(email);
		count += validateDomainName(email);
		count += validateEmailAddress(email);
		return count;		
	}
		
}