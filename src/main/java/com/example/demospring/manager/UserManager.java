package com.example.demospring.manager;

import com.example.demospring.entity.User;
import com.example.demospring.service.UserService;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserManager implements UserService {

    private static List<User> lists = new ArrayList<>();

    static{
        lists.add(new User(1,"Vezife Quliyeva", LocalDate.now().minusYears(20)));
        lists.add(new User(2,"Aytac Memmedli", LocalDate.now().minusYears(25)));
        lists.add(new User(3,"Sefiqe Xanmemmedova", LocalDate.now().minusYears(26)));
    }

    @Override
    public List<User> getAll() {
        return lists;
    }

    @Override
    public User getById(int id) {
        return lists.get(id-1);
    }

    @Override
    public User saveUser(User user) {
        lists.add(user);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        lists.remove(id-1);
    }
}
