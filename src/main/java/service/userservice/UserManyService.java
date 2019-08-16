package service.userservice;

import entity.UserRole;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public interface UserManyService {
    UserRole userManyService(HashMap h);
}
