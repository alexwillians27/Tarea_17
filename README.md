# Cinema Booking Project - Tarea 17
**Student Project:** Clean Code and Automation Cycle

## 1. PROJECT OBJECTIVE
The goal of this project is to fix a "messy" code (código sucio) for a cinema booking system[cite: 1, 3]. 
I identified 10 problems called "Code Smells" and fixed them using professional refactoring tools in IntelliJ IDEA[cite: 3]. 
I also added automated tests with Selenium to ensure the system works perfectly and remains stable[cite: 1, 3].

## 2. IDENTIFIED CODE SMELLS (THE 10 FIXES)
I have implemented and corrected at least 10 different smells across the required categories[cite: 1, 3]:

*   **Long Method (Bloater):** One method was too long and did everything. I split it into smaller, modular parts[cite: 1, 3].
*   **Switch Statements (OO Abuser):** I removed a complex "switch" block and replaced it with a **Strategy Pattern** for better design[cite: 1, 3].
*   **Magic Numbers (Dispensable):** I replaced hardcoded numbers like `0.20` with clear constants like `KIDS_DISCOUNT`[cite: 1, 3].
*   **Dead Code (Dispensable):** I deleted classes and methods that were not being used by the application[cite: 1, 3].
*   **Duplicate Code (Dispensable):** I consolidated logic that was repeated in different parts of the system[cite: 1, 3].
*   **Inappropriate Intimacy (Coupler):** I made data private and used constructors to ensure proper encapsulation[cite: 1, 3].
*   **Large Class (Bloater):** I moved logging responsibilities to a new class called `LogService`[cite: 1, 3].
*   **Feature Envy (Coupler):** I moved methods to the classes where the data actually belongs[cite: 1, 3].
*   **Temporary Field (OO Abuser):** I removed global variables that were useless and stayed empty[cite: 1, 3].
*   **Divergent Change (Change Preventer):** I organized the code so changing one feature doesn't require breaking other parts[cite: 1, 3].

## 3. AUTOMATION SUITE (SELENIUM)
I created a robust automated test suite using Selenium and JUnit[cite: 1, 3]:
*   **Real Interaction:** The test opens a real-world website (SauceDemo)[cite: 3].
*   **Process:** It logs in automatically using standard credentials and verifies the inventory page loads[cite: 3].
*   **Result:** The test suite is stable and passes with a **"100% Green"** status[cite: 1, 3].

## 4. HOW TO RUN THE PROJECT
1.  **Open** the project in IntelliJ IDEA[cite: 3].
2.  **Sync** Maven dependencies to download Selenium and JUnit[cite: 3].
3.  **Navigate** to `src/test/java/tests/`[cite: 3].
4.  **Right-click** `CinemaTest.java` and select **"Run"**[cite: 3].

## 5. TOOLS USED
*   **Java 17**[cite: 3]
*   **Maven** (Dependency Management)[cite: 3]
*   **IntelliJ Refactoring Tools**[cite: 3]
*   **Git** (Atomic Commit History)[cite: 1, 3]