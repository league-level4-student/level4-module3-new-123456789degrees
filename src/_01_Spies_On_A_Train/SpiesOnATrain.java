package _01_Spies_On_A_Train;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

    /*
     * A spy has made off with important intel from your intelligence agency!
     * You know the spy is somewhere on this train(LinkedList). Your job is to
     * find the suspect that matches the description given to you by the list of
     * clues(the array).
     * 
     * Walk through the train, questioning each of the passengers about what
     * they have seen and return the name of the most likely suspect.
     * 
     * The results are randomly generated each time so you should have a general
     * case solution that carefully compares the clues to each passenger's
     * testimony. Remember to use String methods to break up the passengers'
     * statements.
     */
    String findIntel(LinkedList<TrainCar> train, String[] clues) {
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
    	for (int i = 0; i < clues.length; i++) {
    		System.out.println(clues[i]);
    	}
    	Node<TrainCar> node = train.getHead();
    	while (node != null) {
    		String value = node.getValue().questionPassenger();
    		String arr[] = value.split(" ");
    		if (value.contains(clues[0]) || value.contains(clues[1]) || value.contains(clues[2])) {
    			Integer temp = 0;
        		temp = map.get(arr[13]);	
    			temp = temp == null ? 0:temp;
    			map.put(arr[13], temp + 1);
    		}
        	System.out.println(value);
        	node = node.getNext();
    	}
    	System.out.println();
    	String suspect = "";
    	int value = 0;
    	for (Entry<String, Integer> entry : map.entrySet()) {
    		if (entry.getValue() > value) {
    			value = entry.getValue();
    			suspect = entry.getKey();
    		}
    	}
    	System.out.println(suspect);
        return suspect;
    }

}
