package org.home.pet;

import java.util.List;

import org.home.dao.UserDAO;
import org.home.entities.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        UserDAO userDAO = new UserDAO();
        List<User> all = userDAO.getAll();
        System.out.println("After query iterate");
        for(User user : all) {
        	System.out.println(user);
        }
        System.out.println("End");
    }
}
