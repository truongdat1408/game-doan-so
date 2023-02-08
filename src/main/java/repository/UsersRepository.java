package repository;

import model.Users;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsersRepository {
    private static List<Users> users = null;

    public UsersRepository() {
        checkUsersIsNull();
    }

    public void resetUsers() {
        users = new ArrayList<>();
    }

    private void checkUsersIsNull() {
        if (users == null) {
            resetUsers();
        }
    }

    private void sortUsersByPoint() {
        Collections.sort(users, new Comparator<Users>() {
            @Override
            public int compare(Users user1, Users user2) {
                return (user1.getPoint() < user2.getPoint() ? -1 : (user1 == user2 ? 0 : 1));
            }
        });
    }

    public void updatePointAndChart(int userId) {
        addOnePoint(userId);
        sortUsersByPoint();
    }

    public int addUsers(Users user) {
        checkUsersIsNull();
        int id = users.size();
        user.setId(id);
        users.add(user);
        return id;
    }

    public void addOnePoint(int userId) {
        for(Users user : users) {
            if (user.getId() == userId) {
                int point = user.getPoint();
                user.setPoint(point + 1);
                break;
            }
        }
    }
}
