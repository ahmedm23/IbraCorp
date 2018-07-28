import java.util.*;


public class AssassinManager {
	LinkedList <String> killRing = new LinkedList <String>();
	LinkedList <String> graveyard = new LinkedList <String>();

	public AssassinManager(List<String> names) {
		if (names.isEmpty() == true) {
			throw new IllegalArgumentException();
		}
		AssassinNode sad = new AssassinNode(names.get(0));
		for(int i =0; i < names.size(); i++) {
			sad.next = new AssassinNode(names.get(i));
			
		}
		
	}
	
	public void printKillRing() {
		
	}
	
	
	public void printGraveyard() {
		
	}
	
	
	public boolean killRingCOntains(String name) {
		return true;
	}
	
	public boolean graveyardContains(String name) {
		return true;
	}
	
	public String winner() {
		return "";
	}
	
	public void kill(String name) {
		
	}
	
	
}
