package database;

import com.Labs.TwitterLabs.models.Like;
import com.Labs.TwitterLabs.models.Post;
import com.Labs.TwitterLabs.models.User;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Database {
    private List<User> userList = Arrays.asList(
            new User("ini_mini", "Ana", "Padureanu", "ana.padu@gmail.com", "mysuperpassword"),
            new User("slayer123", "Dinu", "Menle", "dinu.menle@gmail.com", "mysuperpassword"),
            new User("colorfulCapricorn", "Diana", "Kovacs", "diana.kovacks@gmail.com", "mysuperpassword"),
            new User("moduleMood", "George", "Barlad", "george.barlad@gmail.com", "mysuperpassword")
    );

    public List<User> getUserList(String userName, String firstName, String lastName) {
        return userList.stream()
                .filter(u -> u.getUsername().compareToIgnoreCase(userName) == 0 || u.getFirstname().compareToIgnoreCase(firstName) == 0 || u.getLastname().compareToIgnoreCase(lastName) == 0)
                .collect(Collectors.toList());
    }

    public boolean addUser(User user) {
        int previousLength = userList.size();
        userList.add(user);

        if (previousLength == userList.size() - 1)
            return true;
        else return false;
    }

    public boolean follow(User follower, User followed) {
        followed.addFollowing(followed);
        followed.addFollower(follower);

        return true;
    }

    public boolean addPost(String username, Post post) {
        for (User u : userList) {
            if (u.getUsername().compareToIgnoreCase(username) == 0) {
                u.addPost(post);
                return true;
            }
        }
        return false;
    }

    public List<Post> getPosts(String username, LocalDateTime timestamp) {
        if (timestamp != null) {
            return userList.stream()
                    .filter(u -> u.getUsername().compareToIgnoreCase(username) == 0)
                    .flatMap(u -> u.getPosts().stream())
                    .filter(p -> p.getTimestamp().compareTo(timestamp) == 0)
                    .collect(Collectors.toList());
        }
        else
            return userList.stream()
                    .filter(u -> u.getUsername().compareToIgnoreCase(username) == 0)
                    .flatMap(u -> u.getPosts().stream())
                    .collect(Collectors.toList());
    }

    public List<Post> getFeed(String username)
    {
        userList.stream()
                .filter(u->u.getUsername().compareToIgnoreCase(username)==0)
                .flatMap(u->u.getFollowing().stream())
                .flatMap(u->u.getPosts().stream())
                .filter(p->p.getTimestamp().compareTo(LocalDateTime.now().minusDays(10))==0)
                .collect(Collectors.toList());
        return null;
    }

    public void likePost(Like like, String username, int postId) {
        userList.stream()
                .filter(u->u.getUsername().compareToIgnoreCase(username)==0)
                .flatMap(u->u.getPosts().stream())
                .filter(p->p.getPostId()==postId)
                .forEach(p->p.addLike(like));
    }
}
