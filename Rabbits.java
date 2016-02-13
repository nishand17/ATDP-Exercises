/*
Write a Java class called Rabbits from scratch.
You may use this file. It is conveniently named Rabbits.java

Write whatever methods and variables you may need. 
Take any approach you wish to complete this assignment.

The Objective:

Rabbits in the town of Rabbitton breed like wildfire. 
Each year, for every pair of rabbits, one new rabbit is born. 

Like man, rabbits were made mortal creatures. 
Just as they recieved the gift of life, 
so did they recieve the gift of death. 
As such, in every fifth year, a quarter of the population 
embarks upon the Last Journey to Rabbit Heaven. 
Verily, the Rabbit God doth reap what he hath sown.

Chronicle the population of Rabbitton starting from year 1 and a population of 72 
and print out the total population at the end of year 76 in this format:

	In the year seventy-six, Rabbitton was home to YOUR_ANSWER_HERE rabbity souls.

Replace YOU_ANSWER_HERE with your answer.

You may assume this means any births and deaths in the fiftieth year are included in your chronicle.

Go forth and do this. The Rabbit God has decreed such.
*/
public class Rabbits {

public static float population = 72;

public static float years = 76;

public static float life(float yearStart) {
	population = population + (population/2);
	if ((yearStart - 1) % 5 == 0) {
		population = population - (population/4);
	}
	if (yearStart == years) {
		return population;
	}
	

	
	return life(yearStart + 1);


}


public static void main(String args[]) {

System.out.println("In the year seventy-six, Rabbitton was home to " + life(1) + " rabbity souls.");

}




}