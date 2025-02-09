package entities;

import java.time.LocalDate;

public class Client {
	public String name;
	public String email;
	public LocalDate birthDate;

	public Client() {
	}

	public Client(String name, String email, LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}	
}
