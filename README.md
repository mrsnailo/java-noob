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

### Option 1: Use the Provided Scripts (Recommended)

**Windows (PowerShell):**
```powershell
.\run.ps1
```

**Windows (Command Prompt):**
```cmd
run.bat
```

### Option 2: Manual Compilation and Execution

**Compile the Source Files:**
```bash
javac src/*.java -d bin
```

**Run the Main Application:**
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
═══════════════════════════════════════════════════════════════
           [*] Human Citizenship Simulator [*]
           Explore Different Cultures and Lifestyles
═══════════════════════════════════════════════════════════════

═══════════════════════════════════════════════════════════════
                    [HOME] MAIN MENU [HOME]
═══════════════════════════════════════════════════════════════

  [+] a) Create a citizen
  [X] b) Exit application

[INPUT] Enter your choice: a

═══════════════════════════════════════════════════════════════
                 [WORLD] SELECT NATIONALITY [WORLD]
═══════════════════════════════════════════════════════════════

  [BD] 1) Bangladeshi Citizen
  [NG] 2) Nigerian Citizen

[INPUT] Select nationality (1 or 2): 1

[BD] Creating Bangladeshi Citizen...
─────────────────────────────────────
[INPUT] [USER] Enter citizen's name: Rahim
[INPUT] [AGE] Enter citizen's age: 25

[OK] [BD] Bangladeshi citizen created successfully!

[EXPLORE] EXPLORE CHARACTERISTICS [EXPLORE]
═══════════════════════════════════════════════════════════════

  [MOVE] 1) How do they move?
  [SLEEP] 2) What are their sleeping habits?
  [LANG] 3) What language do they speak?
  [FOOD] 4) What do they eat?
  [BACK] 5) Back to main menu

[INPUT] What would you like to know? (1-5): 3

═══════════════════════════════════════════════════════════════
              [INFO] CITIZEN CHARACTERISTICS [INFO]
═══════════════════════════════════════════════════════════════

[LANG] LANGUAGE SKILLS:
──────────────────
[SPEAK] Rahim speaks Bengali fluently
   'Apni kemon achen?' - How are you?
```

## Future Enhancements

- Add more nationalities with unique characteristics
- Include more human behaviors and properties
- Implement a graphical user interface

## License

This project is open source and available for educational purposes.

## Author

Shahid Parvez

