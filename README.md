# JDBC: POJOs and DAOs to save, update and delete entries

### Description
This project combines
* "Project setup", "POJOs with Lombok and generating test data with JavaFaker"
* "POJOs and DAOs"
* "Mapping-DB-data-to-POJOs-using-ResultSet"
* "Mapping DB data to POJOs using ResultSetMapper and class annotations"


#### Theory:
* JDBC ResultSetMapper with Annotations
* Basic Java Reflection

#### Practical tasks:
**Task 1**
**Extend Customer DAO to load customer data in an object with ResultSetMapper**
Description: implement getByID() and getByIDs() methods in Customer DAO using ResultSetMapper to map the data into the class object.
This approach is great for testing database migrations.
 
### Instruction
#### Prerequisites
1. SQL: Local database environment setup.
2. customers table with example data
##### Useful links:
1. https://www.baeldung.com/jdbc-resultset
2. https://docs.oracle.com/javase/tutorial/jdbc/basics/retrieving.html
3. https://www.codeproject.com/Tips/372152/Mapping-JDBC-ResultSet-to-Object-using-Annotations