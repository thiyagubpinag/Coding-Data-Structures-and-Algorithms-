package com.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//1
		Stream<String> bands = Files.lines(Paths.get("C:/Users/tseran/study/Alcatel/src/com/streams/bands.txt"));
		bands.sorted().filter(x -> x.length() > 13).forEach(System.out::println);
		bands.close();
		
		//2
	
		Stream<String> data = Files.lines(Paths.get("C:/Users/tseran/study/Alcatel/src/com/streams/data.txt"));
	    long count=data.map(i->i.split(",")).filter(i->i.length==3).count();
	    System.out.println(count);
	    data.close();
	
	}

}
