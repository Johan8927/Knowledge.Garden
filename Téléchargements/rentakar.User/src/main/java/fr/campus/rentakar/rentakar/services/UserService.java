package fr.campus.rentakar.rentakar.services;


import fr.campus.rentakar.rentakar.models.User;
import fr.campus.rentakar.rentakar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Méthode pour enregistrer un utilisateur
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Méthode pour obtenir un utilisateur par son nom d'utilisateur
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Méthode pour obtenir un utilisateur par son ID
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
