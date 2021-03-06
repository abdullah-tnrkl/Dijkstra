/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vertex;

/**
 *
 * @author abdul
 */

 
import java.util.ArrayList;
import java.util.List;
 
public class Vertex implements Comparable<Vertex> {
 
	private String name;
	private List<Kenar> adjacenciesList;
	private boolean visited;
	private Vertex predecessor;
	private double distance = Double.MAX_VALUE;
 
	public Vertex(String name) {
		this.name = name;
		this.adjacenciesList = new ArrayList<>();
	}
 
	public void addNeighbour(Kenar edge) {
		this.adjacenciesList.add(edge);
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public List<Kenar> getAdjacenciesList() {
		return adjacenciesList;
	}
 
	public void setAdjacenciesList(List<Kenar> adjacenciesList) {
		this.adjacenciesList = adjacenciesList;
	}
 
	public boolean isVisited() {
		return visited;
	}
 
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
 
	public Vertex getPredecessor() {
		return predecessor;
	}
 
	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}
 
	public double getDistance() {
		return distance;
	}
 
	public void setDistance(double distance) {
		this.distance = distance;
	}
 
	@Override
	public String toString() {
		return this.name;
	}
 
	@Override
	public int compareTo(Vertex otherVertex) {
		return Double.compare(this.distance, otherVertex.getDistance());
	}
}
