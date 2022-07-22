package apache.dbutils;

import apache.dbutils.dao.CustomerDaoImpl;

public class Main {
    public static void main(String[] args) {
        CustomerDaoImpl customerDao = new CustomerDaoImpl();

        System.out.println(customerDao.getByID(1));
        System.out.println();
        System.out.println(customerDao.getByIDs(customerDao.getRandomIds(2)));

    }
}
