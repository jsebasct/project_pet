package org.home.pet;


import org.home.dao.BreedDAO;
import org.home.dao.ColorDAO;
import org.home.dao.PetDAO;
import org.home.entities.Colour;
import org.home.entities.Pet;
import org.home.entities.PetBreed;

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
        
//        BreedDAO breedDao = new BreedDAO();
        
//        PetBreed newBreed = new PetBreed();
////        newBreed.setId(1L);
//        newBreed.setCode("Bulldog");
////        breedDao.save(newBreed);
        
        
        
        PetBreed pastorBreed = new PetBreed();
        pastorBreed.setCode("pastor");
        pastorBreed.setDescription("Pastor Aleman");
        
//        breedDao.save(pastorBreed);
        
        Pet dogWisky = new Pet();
        dogWisky.setName("Wisky");
        dogWisky.setBreedPet(pastorBreed);
        
        PetDAO daoPet = new PetDAO();
        
        
        Colour colorBrown = new Colour();
        colorBrown.setDesc("Color Café");
        
        dogWisky.addColor(colorBrown);
        
        daoPet.save(dogWisky);
        
//        ColorDAO colorDAO = new ColorDAO();
//        colorDAO.save(colorBrown);
        
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
