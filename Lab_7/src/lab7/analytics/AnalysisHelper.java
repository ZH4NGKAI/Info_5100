/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;
import static javafx.scene.input.KeyCode.K;
import static javafx.scene.input.KeyCode.V;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    
    // find user with Most Likes
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users= DataStore.getInstance().getUsers();
    
        for (User user: users.values()) {
            for (Comment c: user.getComments()) {
                int likes= 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put((user.getId()), likes);
            }
        }
        int max= 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("\nUser with most likes: " + max + "\n" + users.get(maxId));
    }
    
    // find 5 comments which have the most likes
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("\n5 most Likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }
    
    public void getAverageLikes() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        int sum = 0;
        for (Comment c: commentList) 
            sum += c.getLikes();
        System.out.println("\nAverage number of like per comment: " + 
                sum/commentList.size());
    }
   
    public void postWithMostLikes() {
        int mostLikes = 0;
        int mostPost = 0;
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        List<Post> postList = new ArrayList<>(posts.values());
        for (Post p: postList) {
            int tempLikes = 0;
            for (Comment c: p.getComments()) {
                tempLikes += c.getLikes();
            }
            if (tempLikes > mostLikes) {
                mostLikes = tempLikes;
                mostPost = p.getPostId();
            }
        }
        System.out.println("\nPost with most liked comments: " + "\n" 
                + posts.get(mostPost)); 
    }
    
    public void postWithMostComments() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        int mostComments = 0;
        int mostPost = 0;
        for (Post p: posts.values()) {
            if (p.getComments().size() > mostComments) {
                mostComments = p.getComments().size();
                mostPost = p.getPostId();
            }
        }
        System.out.println("\nPost with most comments: " + "\n" 
                + posts.get(mostPost));
    }
    
    public void commentInacitveUser() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> userList = new ArrayList<>(users.values());
        
        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getComments().size() - o2.getComments().size();
            }
        });
        
        System.out.println("\n5 most inactive users based on comments: ");
        for (int i = 0; i < userList.size() && i < 5; i++) {
            System.out.println(userList.get(i));
        }
    }
    
    public Map<Integer, Integer> postInacitveUser() {
        Map<Integer, Integer> userPosts = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        for (Post p: posts.values()) {
            int post = 0;
            if(userPosts.containsKey(p.getUserId())) {
                post = userPosts.get(p.getUserId());
            }
            post += 1;
            userPosts.put(p.getUserId(), post);
        }
        List<Entry<Integer, Integer>> list = new ArrayList<>(userPosts.entrySet());
        list.sort(Entry.comparingByValue());
        System.out.println("\n5 most inactive users based on posts: ");
        int i = 0;
        for (Entry<Integer, Integer> entry: list) {
            if(i > 4)
                break;
            System.out.println(DataStore.getInstance().getUsers().get(entry.getKey()));
            i++;
        }
        return userPosts;
    }
    
    public void userOverall() {
        Map<Integer, Integer> userCount = postInacitveUser();
        Map<Integer, User> users= DataStore.getInstance().getUsers();
    
        for (User user: users.values()) {
            int sum = user.getComments().size();
            if(userCount.containsKey(user.getId())){
                sum += userCount.get(user.getId());
            }
//            userCount.put(user.getId(), sum);
            
            for (Comment c: user.getComments()) {
                sum += c.getLikes();
                userCount.put((user.getId()), sum);
            }
        }
        List<Entry<Integer, Integer>> list = new ArrayList<>(userCount.entrySet());
        list.sort(Entry.comparingByValue());
        System.out.println("\n5 most inactive users overally: ");
        int i = 0;
        for (Entry<Integer, Integer> entry: list) {
            if(i > 4)
                break;
            System.out.println(users.get(entry.getKey()));
            System.out.println(entry.getValue());
            i++;
        }
        
        System.out.println("\n5 most proactive users overally: ");
        for(int j = list.size() - 1; j >=0 && i > 0; j--) {
            System.out.println(users.get(list.get(j).getKey()));
            System.out.println(list.get(j).getValue());
            i--;
        }
    }
}
