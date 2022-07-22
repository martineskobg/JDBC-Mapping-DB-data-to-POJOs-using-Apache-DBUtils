# JDBC: Mapping DB data to POJOs using Apache DBUtils

### Description
In this project I've updated the two methods getByID and getByIDs in CustomerDaoImpls by using org.apache.commons.dbutils

#### Theory:
* JDBC Apache DBUtils

#### Practical tasks:
**Task 1**

**Extend Customer DAO to load customer data in an object with Apache DBUtils**

Description: implement getByID() and getByIDs() methods in Customer DAO using ResultSetHandler 
to map the data into the class object.
 
### Instruction
#### Prerequisites
1. SQL: Local database environment setup.
2. customers table with example data
##### Useful links:
1. https://commons.apache.org/proper/commons-dbutils/examples.html