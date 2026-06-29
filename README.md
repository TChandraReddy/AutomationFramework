## Project Structure
AutomationFramework/
├── pom.xml
└── src/
    ├── main/java/com/automation/utils/   ← ConfigReader
    └── test/
        ├── java/com/automation/
        │   ├── base/                     ← BaseTest
        │   ├── pages/                    ← Page Objects (coming Day 11)
        │   ├── tests/                    ← Test Classes
        │   └── utils/                    ← Test Utilities
        └── resources/
            └── config.properties
