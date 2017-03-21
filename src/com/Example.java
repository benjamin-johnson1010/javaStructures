package com;
import java.util.ArrayList;
import java.util.Arrays;
import com.team.Treat;
import com.team.Treats;
import java.util.Map;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.List;
public class Example {

	public static void main(String[] args) {
//	Treat treat = new Treat("Ben","Hello, this is a @test, #DUKELOST #COACHKWHINING", new Date(1489206187L));
//		Treat secondTreat = new Treat(
//			      "journeytocode",
//			      "@treehouse makes learning Java sooooo fun! #treet",
//			      new Date(1421878767000L)
//			    );
//		System.out.printf("This is a treat: %s \n", treat);
//		System.out.println("the words are: ");
//		for(String word: treat.getWords()){
//			System.out.println(word);
//		}
//		Treat[] treats = {secondTreat, treat};
//		Arrays.sort(treats);
//		for(Treat exampleTreat: treats){
//			System.out.println(exampleTreat);
//		}
//		Treats.save(treats);
		Treat[] treats = Treats.load();
		System.out.printf("There are %d treets. \n", treats.length);
		Set<String> allHashTags = new HashSet<String>();
		Set<String> allMentions = new TreeSet<String>();
		for (Treat treat : treats){
			allHashTags.addAll(treat.getHashTags());
			allMentions.addAll(treat.getMentions());
		}
		System.out.printf("Hash tags: %s \n", allHashTags);
		System.out.printf("Mentions: %s \n", allMentions);
		Map<String, Integer> hashTagCounts = new HashMap<String, Integer>();
		for(Treat treat : treats){
			for (String hashTag : treat.getHashTags()){
				Integer count = hashTagCounts.get(hashTag);
				if(count == null){
					count = 0;
				}
				count++;
				hashTagCounts.put(hashTag, count);
			}
		}
		System.out.printf("Hash tag counts: %s \n", hashTagCounts);
		
		Map<String, List<Treat>> treatsByAuthor = new HashMap<String, List<Treat>>();
		for(Treat treat: treats){
			List<Treat> authoredTreats = treatsByAuthor.get(treat.getAuthor());
			if(authoredTreats == null){
				authoredTreats = new ArrayList<Treat>();
				treatsByAuthor.put(treat.getAuthor(), authoredTreats);
			}
			authoredTreats.add(treat);
		}
		System.out.printf("Treats by author: %s \n ",  treatsByAuthor);
		System.out.printf("Treats by Ben: %s |n", treatsByAuthor.get("Ben"));
 		}
	
}
