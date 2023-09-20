package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class HashMapper {

	public static void main(String[] args) {
		FileReader filename = new FileReader(); //FileReader to read file
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>(); //creating and defining structure of hashmap
		try {
			String filepath = filename.readToString("main/java/resources/words.txt"); //obtaining file path to read
			System.out.println(filepath);
			
			String[] separated = filepath.toLowerCase().split(" "); // separating file
			for (int x = 0; x < separated.length; x++) { // iterating over separated
				if (separated[x].length() > 3) { //length of word less than 3
					if (hashmap.get(separated[x]) == null) {
						hashmap.put(separated[x],1); } // occurrence = 1
					
					else {
						hashmap.put(separated[x],  hashmap.get(separated[x]) + 1); // ++1
						}
					}
				}
			for (String i : hashmap.keySet()) {
				System.out.println(i + " " + hashmap.get(i)); // printing hash map key
				}
			}
		catch (FileNotFoundException e) { //error catching
			System.out.println("File not found in directory");
		}
		}
	}
