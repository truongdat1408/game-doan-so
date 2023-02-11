package service;

import model.Users;
import repository.UsersRepository;

import java.util.List;

public class UsersService {
    public int addUsers(Users user) {
        UsersRepository usersRepository = new UsersRepository();
        return usersRepository.addUsers(user);
    }

    public void updatePointAndChart(int userId) {
        UsersRepository usersRepository = new UsersRepository();
        usersRepository.updatePointAndChart(userId);
    }

    public List<Users> getUsers() {
        UsersRepository usersRepository = new UsersRepository();
        return usersRepository.getUsers();
    }
}
