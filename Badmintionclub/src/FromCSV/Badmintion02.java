package FromCSV;

	import java.util.List;
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;


public class Badmintion02 {
	    
	    public static void main(String[] args) {
	        readAndWrite();
	    }

	    public static void readAndWrite() {
	        List<Badmintionclub> table = new ArrayList<>();
	        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sheneli\\Desktop\\aviva1.csv"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] values = line.split(",");
	                table.add(new Badmintionclub(Integer.parseInt(values[0]),values[1],Integer.parseInt(values[2]),Integer.parseInt(values[3]),Integer.parseInt(values[4]),Integer.parseInt(values[5]),Integer.parseInt(values[6])));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        

	        table.stream().forEach(x -> System.out.println(x));
	        System.out.println();
	        table.parallelStream().forEach(System.out::println);
	        

	        try {
	              FileWriter writer = new FileWriter("C:\\Users\\Sheneli\\Desktop\\Badmintion02.txt");
	              table.stream()
	                .forEach(x -> {
	                    try {
	                        writer.write(x.toString() + "\n");
	                    } catch (IOException e) {
	                        e.printStackTrace();
	                    }
	                });
	              
	              writer.write("\nParallel Stream\n");
	              table.parallelStream()
	              .forEach(x -> {
	                    try {
	                        writer.write(x.toString() + "\n");
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
