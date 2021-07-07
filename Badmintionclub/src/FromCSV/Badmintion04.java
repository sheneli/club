package FromCSV;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;

	public class Badmintion04 {

	    public static void main(String[] args) {
	        readAndWrite();
	    }

	    public static void readAndWrite() {
	        List<Badmintionclub> table = new ArrayList<>();
	        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sheneli\\Desktop\\aviva1.csv"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] values = line.split(",");
	                table.add(new Badmintionclub(Integer.parseInt(values[0]),values[1],Integer.parseInt(values[2]),Integer.parseInt(values[3]),Integer.parseInt(values[4]),Integer.parseInt(values[5]),Double.parseDouble(values[6])));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        System.out.println("\nSeveral teams have 18 points");
	        table.stream().filter(team -> team.getPoints() == 18)
	            .forEach(System.out::println);

	        System.out.println();
	        System.out.println("Teams with 28 points");
	        table.stream().filter(team -> team.getPoints() == 28)
	            .forEach(System.out::println);
	        
	        try {
	              FileWriter writer = new FileWriter("C:\\Users\\Sheneli\\Desktop\\Badmintion04.txt");
	              writer.write("Several teams have 18 points\n");
	              table.stream().filter(team -> team.getPoints() == 18)
	                .forEach(str -> {
	                    try {
	                        writer.write(str.toString() + "\n");
	                    } catch (IOException e) {
	                        e.printStackTrace();
	                    }
	                });
	              
	              writer.write("\nTeams with 28 points\n");
	              table.stream().filter(team -> team.getPoints() == 28)
	                .forEach(str -> {
	                    try {
	                        writer.write(str.toString() + "\n");
	                    } catch (IOException e) {
	                        e.printStackTrace();
	                    }
	                });
	              writer.close();
	              System.out.println("Created : " + writer +  " and updated it.");
	            } catch (IOException e) {
	              System.out.println("An exception occurred.");
	              e.printStackTrace();
	            }
	    }
	    
	}

