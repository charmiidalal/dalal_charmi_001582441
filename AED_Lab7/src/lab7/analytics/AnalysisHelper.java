/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

/**
 *
 * @author harshalneelkamal
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

public class AnalysisHelper {

    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerCommets() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }

        System.out.println("Average of likes per comments: " + likeNumber / commentNumber);

    }
    
    // Find the post with most liked comments.
    public void getPostWithMostLikedComments() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        HashMap<Integer, Integer> commentLikeCount = new HashMap<>();
        List<Integer> maxPosts = new ArrayList<>();
        int maxComments = -1;
        for (Comment c : comments.values()) {
            if (commentLikeCount.containsKey(c.getPostId())) {
                if (commentLikeCount.get(c.getPostId()) < c.getLikes()) {
                    commentLikeCount.put(c.getPostId(), c.getLikes());
                }
            } else {
                commentLikeCount.put(c.getPostId(), c.getLikes());
            }
        }
        System.out.println("/*****************************************/");
        System.out.println("All Posts with liked comments : " + commentLikeCount);
        Iterator it = commentLikeCount.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if ((Integer) pair.getValue() > maxComments) {
                maxPosts.clear();
                maxPosts.add((Integer) pair.getKey());
                maxComments = (Integer) pair.getValue();
            } else if ((Integer) pair.getValue() == maxComments) {
                maxPosts.add((Integer) pair.getKey());
            }
        }
        for (int i : maxPosts) {
            System.out.println("Post with most liked comments. : " + i);
        }
    }
    // Find the post with most comments
    public void getPostWithMostComments() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        HashMap<Integer, Integer> commentCount = new HashMap<>();

        List<Integer> maxPosts = new ArrayList<>();
        int maxComments = -1;
        for (Post c : posts.values()) {
            commentCount.put(c.getPostId(), c.getComments().size());
        }
        System.out.println("/*****************************************/");
        System.out.println("All Posts with comments count: " + commentCount);
        Iterator it = commentCount.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if ((Integer) pair.getValue() > maxComments) {
                maxPosts.clear();
                maxPosts.add((Integer) pair.getKey());
                maxComments = (Integer) pair.getValue();
            } else if ((Integer) pair.getValue() == maxComments) {
                maxPosts.add((Integer) pair.getKey());
            }
        }
        for (int i : maxPosts) {
            System.out.println("Post with most comments. : " + i);
        }
    }
    //Top 5 inactive users based on total posts number.
    public void getInactiveUserByPost() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        HashMap<Integer, Integer> inactiveUserCount = new HashMap<>();

        for (Post c : posts.values()) {
            if (inactiveUserCount.containsKey(c.getUserId())) {
                inactiveUserCount.put(c.getUserId(), inactiveUserCount.get(c.getUserId()) + 1);
            } else {
                inactiveUserCount.put(c.getUserId(), 1);
            }
        }
        
        System.out.println("/*****************************************/");
        System.out.println("All Users with Posts count: " + inactiveUserCount);
        System.out.println("Top 5 Inactive Users By Post: ");

        Map<Integer, Integer> hm1 = sortByValue(inactiveUserCount);
        int count = 1;
        // print the sorted hashmap 
        for (Map.Entry<Integer, Integer> en : hm1.entrySet()) {
            if (count > 5) {
                break;
            }
            System.out.println(count + ". UserID = " + en.getKey()
                    + ", Post Count = " + en.getValue());
            count++;
        }

    }
    
    // Top 5 inactive users based on total comments they created
    public void getInactiveUserByCommentCreated() { 
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        HashMap<Integer, Integer> inactiveUserCount = new HashMap<>();

        for (Comment c : comments.values()) {
            if (inactiveUserCount.containsKey(c.getUserId())) {
                inactiveUserCount.put(c.getUserId(), inactiveUserCount.get(c.getUserId()) + 1);
            } else {
                inactiveUserCount.put(c.getUserId(), 1);
            }
        }
        
        System.out.println("/*****************************************/");
        System.out.println("All Users with Created Comment Count: " + inactiveUserCount);
        System.out.println("Top 5 Inactive Users By Created Comments : ");

        Map<Integer, Integer> hm1 = sortByValue(inactiveUserCount);
        int count = 1;
        // print the sorted hashmap 
        for (Map.Entry<Integer, Integer> en : hm1.entrySet()) {
            if (count > 5) {
                break;
            }
            System.out.println(count + ". UserID = " + en.getKey()
                    + ", Comment Count = " + en.getValue());
            count++;
        }

    }
    // Top 5 inactive users overall (sum of comments, posts and likes)
    public void getOverAllInactiveUsers() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        HashMap<Integer, Integer> postPerUserCount = new HashMap<>();
        for (Post c : posts.values()) {
            if (postPerUserCount.containsKey(c.getUserId())) {
                postPerUserCount.put(c.getUserId(), postPerUserCount.get(c.getUserId()) + 1);
            } else {
                postPerUserCount.put(c.getUserId(), 1);
            }
        }
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        HashMap<Integer, Integer> inactiveUserCount = new HashMap<>();
        int totalLikes,totalComments,totalCount,totalPosts;
        for (User c : users.values()) {
            totalCount =  0;
            totalLikes = 0;
            totalComments = 0;
            totalPosts = postPerUserCount.getOrDefault(c.getId(), 0);
            totalComments  = c.getComments().size();
            for (Comment d : c.getComments()) {
                totalLikes =  totalLikes + d.getLikes();
            }
            totalCount = totalComments + totalLikes + totalPosts;
            inactiveUserCount.put(c.getId(),totalCount);
        }
        
        System.out.println("/*****************************************/");
        System.out.println("All Users with Created Comments + Posts + Likes Count: " + inactiveUserCount);
        System.out.println("Top 5 Inactive Users OverAll : ");
        
        Map<Integer, Integer> hm1 = sortByValue(inactiveUserCount);
        int count = 1;
        // print the sorted hashmap 
        for (Map.Entry<Integer, Integer> en : hm1.entrySet()) {
            if (count > 5) {
                break;
            }
            System.out.println(count + ". UserID = " + en.getKey()
                    + ", All Count = " + en.getValue());
            count++;
        }

    }
    //Top 5 proactive users overall (sum of comments, posts and likes)
    public void getOverAllProactiveUsers() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        HashMap<Integer, Integer> postPerUserCount = new HashMap<>();
        for (Post c : posts.values()) {
            if (postPerUserCount.containsKey(c.getUserId())) {
                postPerUserCount.put(c.getUserId(), postPerUserCount.get(c.getUserId()) + 1);
            } else {
                postPerUserCount.put(c.getUserId(), 1);
            }
        }
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        HashMap<Integer, Integer> inactiveUserCount = new HashMap<>();
        int totalLikes,totalComments,totalCount,totalPosts;
        for (User c : users.values()) {
            totalCount =  0;
            totalLikes = 0;
            totalComments = 0;
            totalPosts = postPerUserCount.getOrDefault(c.getId(), 0);
            totalComments  = c.getComments().size();
            for (Comment d : c.getComments()) {
                totalLikes =  totalLikes + d.getLikes();
            }
            totalCount = totalComments + totalLikes + totalPosts;
            inactiveUserCount.put(c.getId(),totalCount);
        }
        
        System.out.println("/*****************************************/");
        System.out.println("All Users with Created Comments + Posts + Likes Count: " + inactiveUserCount);
        System.out.println("Top 5 Proactive Users OverAll : ");
        
        Map<Integer, Integer> hm1 = sortByDescValue(inactiveUserCount);
        int count = 1;
        // print the sorted hashmap 
        for (Map.Entry<Integer, Integer> en : hm1.entrySet()) {
            if (count > 5) {
                break;
            }
            System.out.println(count + ". UserID = " + en.getKey()
                    + ", All Count = " + en.getValue());
            count++;
        }

    }
    /* Sort Hashmap desc ordern */
    public static HashMap<Integer, Integer> sortByDescValue(HashMap<Integer, Integer> hm) {
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer>> list
                = new LinkedList<Map.Entry<Integer, Integer>>(hm.entrySet());

        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        //Collections.sort(list, Collections.reverseOrder());
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    /* Sort Hashmap Aesc order */
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) {
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer>> list
                = new LinkedList<Map.Entry<Integer, Integer>>(hm.entrySet());

        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        //Collections.sort(list, Collections.reverseOrder());
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

}
