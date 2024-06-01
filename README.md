# CS-320-SoftwareTestQA
*CS-320: Software Testing, Automation, and QA* @ SNHU, May-June 2024 w/ Professor Jonathan Norman

This course teaches how to apply software engineering test strategies into the SDLC, including requirements analysis, verification, and quality management. We go through the process of creating unit tests and analyzing various testing approaches

**Skills learned & utilized:** JUnit 5; Eclipse IDE; Java

### Project Milestone One (3-2): Contact Service
  This is the first milestone required to be completed to prepare for our main project. Here we were required to develop a mobile application for a customer that provides us with the requirements.  We are also required to provide unit tests to verify that the application meets those requirements.

  This milestone specifically focuses on delivering the contact services, giving the ability to add, update, and delete contact objects within the application.

  The contact service uses in-memory data structures to support storing contacts (no database required). In addition, there is no user interface for this milestone. We are required to verify the contact service through JUnit tests. The contact service contains a contact object along with the contact service
  

 #### Contact Class Requirements

The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.

The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.

The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.


The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.

The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.


#### Contact Service Requirements

The contact service shall be able to add contacts with a unique ID.

The contact service shall be able to delete contacts per contact ID.

The contact service shall be able to update contact fields per contact ID. The following fields are updatable:

firstName

lastName

Number

Address
