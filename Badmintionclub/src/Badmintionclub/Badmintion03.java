package Badmintionclub;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;


	public class Badmintion03 {
	  public static void main(String[] args) {
	    List<Badmintionclub> table = Arrays.asList(
	    		 new Badmintionclub(1, " Force ", 22, 11, 15, 5, 61, 300, 421, 375, 441,
	    		            48, 32, 176),
	    		        new Badmintionclub(2, "Heatwave", 322, 116, 10, 26, 825, 14, 411, 572, 443, 89, 52, 105),
	    		        new Badmintionclub(3, " Hustle", 2, 150, 15, 66, 853, 221, 132, 7, 89, 24,
	    		            52, 28),
	    		        new Badmintionclub(4, "Justice League", 10, 24, 51, 87, 64, 18, 546, 20, 10, 25, 35, 268),
	    		        new Badmintionclub(5, "Lightning", 10, 124, 0, 38, 63, 47, 56, 80, 16, 25, 75,
	    		            18),
	    		        new Badmintionclub(6, "Maniacs", 55, 1, 52, 39, 6, 7, 5, 7, 4, 59, 24, 81),
	    		        new Badmintionclub(7, "Ninjas", 22, 115, 50, 1551, 97, 882, 105, 2, 4, 26, 24,
	    		            4),
	    		        new Badmintionclub(8, "Rebels", 2252, 150, 100, 1222, 44, 14, -50, 5, 450, 400, 550,
	    		            49),
	    		        new Badmintionclub(9, "Ringmasters", 22, 900, 155, 120, 53, 55, -50, 553, 461, 94, 75,
	    		            88),
	    		        new Badmintionclub(10, "Tribe", 50, 750, 100, 104, 442, 78, -36, 546, 257, 44, 66,
	    		            40));


	    OptionalInt min = table.stream().mapToInt(Badmintionclub::getPoints).min();
	    if (min.isPresent()) {
	      System.out.printf("Lowest number of points is %d\n", min.getAsInt());
	    } else {
	      System.out.println("min failed");
	    }
	  }

	}



