# Java Human Citizenship Simulator

A simple Java project that demonstrates Object-Oriented Programming concepts including inheritance, interfaces, and polymorphism. The application simulates different human citizens (Bangladeshi and Nigerian) with unique characteristics and behaviors.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 21.0.8 or later installed on your machine
- A terminal or command prompt to compile and run the application

### Project Structure

The workspace contains the following structure:

- `src/`: Contains all the source code files
  - `Human.java`: Interface defining basic human behaviors
  - `HumanProp.java`: Base class with common human properties
  - `Bangladeshi.java`: Implementation for Bangladeshi citizens
  - `Nigerian.java`: Implementation for Nigerian citizens
  - `App.java`: Main application with interactive console interface
  - `test.java`: Simple test application for development purposes
- `bin/`: Contains compiled class files

## Class Hierarchy

```
Human (Interface)
   |
HumanProp (Base Class)
   |
   ├── Bangladeshi
   └── Nigerian
```

## Features

- Create citizens of different nationalities
- Each citizen has unique behaviors for:
  - Movement speed
  - Sleeping habits
  - Language spoken
  - Food preferences
- Interactive console menu to explore citizen characteristics

## Running the Application

### Compile the Source Files

```bash
javac src/*.java -d bin
```

### Run the Main Application

```bash
java -cp bin App
```

## Usage

Once running, the application will present a menu that allows you to:

1. Create a citizen (Bangladeshi or Nigerian)
2. Specify name and age for the citizen
3. Explore their characteristics (movement, sleep, language, food)
4. Create more citizens or quit the application

## Example Interaction

```
a) Create a Citizen 
b) Quit
> a

What type of Citizen You Want TO create, 
1) Bangladeshi 
2) Nigerian
> 1

Name Of Bangladeshi Citizen
> Rahim

Age OF Bd Citizen
> 25

What Do You want to know about the user you created: 
1) How He/she Moves? 
2) How Much he/she Sleeps? 
3) What Language He/She Speaks? 
4) What Does He/she Eats? 
> 3

Rahim Speaks Bengali
```

## Future Enhancements

- Add more nationalities with unique characteristics
- Include more human behaviors and properties
- Implement a graphical user interface

## License

This project is open source and available for educational purposes.

## Author

Shahid Parvez

