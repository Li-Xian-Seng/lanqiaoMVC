package service.userservice;

import entity.UserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserQuaryServiceInterface {
   List<UserRole> userService();
}
