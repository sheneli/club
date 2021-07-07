package FromCSV;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.OptionalInt;
	import java.util.stream.Collectors;

	public class Badmintion03 {

	    public static void main(String[] args) {
	        readAndWrite();
	    }

	    public static void readAndWrite() {
	        List<Badmintionclub> table = new ArrayList<>();
	        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sheneli\\Desktop\\aviva1.csv")))  {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] values = line.split(",");
	                table.add(new Badmintionclub(Integer.parseInt(values[0]),values[1],Integer.parseInt(values[2]),Integer.parseInt(values[3]),Integer.parseInt(values[4]),Integer.parseInt(values[5]),Double.parseDouble(values[6])));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        OptionalInt min = table.stream().mapToInt(Badmintionclub::getPoints).min();
	        if (min.isPresent()) {
	          System.out.printf("\nLowest number of points is %d\n", min.getAsInt());
	        } else {
	          System.out.println("min failed");
	        }

	        System.out.print("Number of matches won: ");
	        Integer result = table.stream().map(Badmintionclub::getWon).reduce(0, (a, b) -> a + b);
	        System.out.println(result);
	        List<String> s = table.stream()
	                .filter(p -> p.getWon() < 5)
	                .map(Badmintionclub::getTeam)
	                .collect(Collectors.toList());
	                               
	            System.out.println("Team with less than 5 wins: " +
	                s.toString());
	            try {
	              FileWriter writer = new FileWriter("C:\\Users\\Sheneli\\Desktop\\Badmintion03.txt");
	              writer.write("Lowest number of points is " + min.getAsInt() + "\n");
	              writer.write("Number of matches won: " + result + "\n");
	              writer.write("Team with less than 5 wins: " + s + "\n");
	              writer.close();
	              System.out.println("Created : " + writer +  " and updated it.");
	            } catch (IOException e) {
	              System.out.println("An exception occurred.");
	              e.printStackTrace();
	            }
	    }
	    
	}

