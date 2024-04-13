package tacos.data.jpa;

import org.springframework.data.repository.CrudRepository;
import tacos.AppUser;

public interface UserRepository extends CrudRepository<AppUser, Long> {

    AppUser findByUsername(String username);
}