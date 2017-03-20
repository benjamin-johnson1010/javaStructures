package com;
import java.util.Arrays;
import com.team.Treat;
import com.team.Treats;
import java.util.Date;
public class Example {

	public static void main(String[] args) {
//		Treat treat = new Treat("Ben","Hello, this is a test", new Date(1489206187L));
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
		Treat[] reloadedTreats = Treats.load();
		for(Treat reloaded : reloadedTreats){
			System.out.println(reloaded);
		}
	}
}
