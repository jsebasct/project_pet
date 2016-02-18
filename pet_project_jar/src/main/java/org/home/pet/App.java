package org.home.pet;

import java.util.List;

import org.home.dao.BreedDAO;
import org.home.dao.PetDAO;
import org.home.dao.UserDAO;
import org.home.entities.Pet;
import org.home.entities.PetBreed;
import org.home.entities.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        UserDAO userDAO = new UserDAO();
//        List<User> all = userDAO.getAll();
//        System.out.println("After query iterate");
//        for(User user : all) {
//        	System.out.println(user);
//        }
       
        System.out.println("End Reading users");
        
        BreedDAO breedDao = new BreedDAO();
        
//        PetBreed newBreed = new PetBreed();
//        newBreed.setId(1L);
//        newBreed.setCode("Bulldog");
//        breedDao.save(newBreed);
        
        
        PetBreed pastorBreed = new PetBreed();
        pastorBreed.setId(2L);
        pastorBreed.setDescription("Pastor Aleman");
        //breedDao.save(pastorBreed);
        
        Pet dogWisky = new Pet();
        dogWisky.setId(2L);
        dogWisky.setName("Wiskty");
        dogWisky.setBreed(pastorBreed);
        
        PetDAO daoPet = new PetDAO();
        daoPet.save(dogWisky);
        
//        PetBreed dobermanBreed = new PetBreed();
//        dobermanBreed.setId(3L);
//        dobermanBreed.setDescription("Doberman");
//        breedDao.save(dobermanBreed);
//        
//        PetBreed chowBreed = new PetBreed();
//        chowBreed.setId(4L);
//        chowBreed.setDescription("Chow Chow");
//        breedDao.save(chowBreed);
        
        System.out.println("End");
    }
}
