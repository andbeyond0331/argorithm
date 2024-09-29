import java.util.*;

class Genre implements Comparable<Genre>{
    String genre;
    int plays;
    Genre(String genre, int plays) {
        this.genre = genre;
        this.plays = plays;
    }
    @Override
    public int compareTo(Genre other) {
        return other.plays - this.plays;
    }
}

class Song implements Comparable<Song>{
    int id;
    int plays;
    Song(int id, int plays) {
        this.id = id;
        this.plays = plays;
    }
    @Override
    public int compareTo(Song other) {
        return other.plays - this.plays;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, List<Integer>> map = new HashMap<>();
        List<Genre> genreList = new ArrayList();
        
        for(int i = 0; i < genres.length; i++) {
            if(map.containsKey(genres[i])) {
                map.get(genres[i]).add(i);
            }else{
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(genres[i], temp);
            }
        }
        for(String s: map.keySet()) {
            int temp = 0;
            for(int i = 0; i< map.get(s).size();i++) {
                temp += plays[map.get(s).get(i)];
            }
            genreList.add(new Genre(s, temp));
        }
        // for(Genre g:genreList) {
        //     System.out.println("aa: "+ g.plays);
        // }
        Collections.sort(genreList);
        //   for(Genre g:genreList) {
        //     System.out.println("bb: "+ g.plays);
        // }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i < genreList.size(); i++) {
            List<Song> tempSongs = new ArrayList<>();
            for(int num: map.get(genreList.get(i).genre)) {
                tempSongs.add(new Song(num, plays[num]));
            }
            // for(Song s:tempSongs) {
            //     System.out.println("ss: "+ s.plays);
            // }
            Collections.sort(tempSongs);
            if(tempSongs.size()==1) {
                ans.add(tempSongs.get(0).id);
            }else if(tempSongs.size()>1) {
                ans.add(tempSongs.get(0).id);
                ans.add(tempSongs.get(1).id);
            }
        }
        answer = new int[ans.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = ans.get(i);
        }
        
        return answer;
    }
}