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

        System.out.println("average of likes per comments: " + likeNumber / commentNumber);

    }

    public void getMostLikedComments() {

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

//        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
//        List<Comment> commentList = new ArrayList<>();
//        for (Comment c : comments.values()) {
//            commentList.add(c);
//        }
//        Comparator<Comment> likesPerCmt = new Comparator<Comment>() {
//            @Override
//            public int compare(Comment c1, Comment c2) {
//                return Double.compare(c1.getLikes(), c2.getLikes());
//            }
//        };
//        Collections.sort(commentList, likesPerCmt);
//        Collections.reverse(commentList);
//
//        System.out.println("Post with most liked comments. : " + commentList.get(0).getPostId());
    }

    public void getPostWithMostComments() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        HashMap<Integer, Integer> commentCount = new HashMap<>();
        List<Integer> maxPosts = new ArrayList<>();
        int maxComments = -1;
        for (Comment c : comments.values()) {

            if (commentCount.containsKey(c.getPostId())) {
                commentCount.put(c.getPostId(), commentCount.get(c.getPostId()) + 1);
            } else {
                commentCount.put(c.getPostId(), 1);
            }
        }

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

    public void getInactiveUserByPost() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        HashMap<Integer, Integer> inactiveUserCount = new HashMap<>();

        for (Comment c : comments.values()) {
            if (inactiveUserCount.containsKey(c.getUserId())) {
                inactiveUserCount.put(c.getUserId(), inactiveUserCount.get(c.getUserId()) + 1);
            } else {
                inactiveUserCount.put(c.getUserId(), 1);
            }
        }

        System.out.println("Top 5 Inactive Users By Post: ");

        Map<Integer, Integer> hm1 = sortByValue(inactiveUserCount);
        int count = 1;
        // print the sorted hashmap 
        for (Map.Entry<Integer, Integer> en : hm1.entrySet()) {
            if (count > 5) {
                break;
            }
            System.out.println(count + ". UserID = " + en.getKey()
                    + ", Post No = " + en.getValue());
            count++;
        }

    }

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
