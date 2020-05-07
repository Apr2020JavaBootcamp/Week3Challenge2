#### Week 3 Challenge 
This program will do the following:  
1. Prompt the user for information regarding a patient (name, address, symptoms, last known contacts, places visited)
2. Organize the information into a Contact Trace Report  
##### Process  
1. This program utilizes several classes
- Person: an abstract class that stores the basic information used by it's subclasses (name, email, phone number, address)
- Symptom: Stores the name and description of the symptom, as well as the number of days the patient has had the symptom
- LocationVisited: Stores the name, city, state, and date of a location the patient has visited in the past 14 days
- Contact: Extension of the Person class, that stores the location and date the patient has come in contact with another person
- Patient: Extension of the Person class, stores ArrayLists of Symptom, LocationVisited, and Contact
2. The main method will run a static method called traceForm, which takes a Scanner as a parameter, and returns a Patient object
3. Inside the traceForm method, a Patient object is created and the user is prompted for information regarding the patient
- The user is prompted for the patient's name, email, phone number, and address. 
- A for loop is used to cycle through an array of predetermined symptoms. The user is asked if the patient has each symptom. If yes, then the program will ask for additional details and the length of time the patient has had the symptoms. This information is used to create a Symptom object which is then added to the ArrayList of symptoms inside the Patient object
- A do-while loop is used to prompt the user if the patient has been in contact with other people. If yes, then the user is prompted for the name, email, phone number, address, and the date and location where the patient and contact met. This information is used to create a Contact object which is stored in the ArrayList of contacts inside the Patient object.
  - At the end of the loop, the user will be asked if they want to enter another contact. If yes, the loop continues. Otherwise, the loop will break
- A do-while loop is used to prompt the user if the patient has visited any other locations in the past 14 days. If yes, then the user is prompted for the name, city, state, and date of the location visited. 
  - The loop will break if the user does not say yes to the initial prompt
- The traceForm method will return the Patient object
4. The main method will use the toString method to print out the patient's information to the console.
