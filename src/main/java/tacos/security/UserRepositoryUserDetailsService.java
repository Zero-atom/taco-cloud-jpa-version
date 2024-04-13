package tacos.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tacos.AppUser;
import tacos.data.jpa.UserRepository;

//дополнительно
//import org.springframework.data.jpa.repository.query.Modifying;
//import org.springframework.data.jpa.repository.query.Query;

@Service
public class UserRepositoryUserDetailsService implements UserDetailsService {

    private final UserRepository userRepo;

    @Autowired
    public UserRepositoryUserDetailsService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser user = userRepo.findByUsername(username);
        if (user != null) {
            return user;
        }
        throw new UsernameNotFoundException("User '" + username + "' not found");
    }

//    @Modifying
//    @Query(value = "insert into users_roles values (?,1)", nativeQuery = true)
//    void saveUserRole(String username);//, String roleName


}
