package registration.tutorial.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// @Repository: This tells Spring that this is the interface to use for our database management functions.

@Repository
//This links the interface to our database table. We tell it to look at our User table, and we tell it that the value of our id field is Long.
public interface UserRepository extends JpaRepository<User, Long> {
}