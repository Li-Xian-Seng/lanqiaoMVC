package service.userservice;

import entity.UserRole;

import java.util.HashMap;
import java.util.List;

public interface SerchUserInterface {
    List<UserRole> searchDao(HashMap hashMap);
}
