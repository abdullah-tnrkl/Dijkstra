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
public class main {

    public static void main(String[] args) {

        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        Vertex vertexF = new Vertex("F");

        vertexA.addNeighbour(new Kenar(2, vertexA, vertexB));
        vertexA.addNeighbour(new Kenar(6, vertexA, vertexD));
        vertexB.addNeighbour(new Kenar(3, vertexB, vertexE));
        vertexB.addNeighbour(new Kenar(9, vertexB, vertexC));
        vertexC.addNeighbour(new Kenar(7, vertexC, vertexD));
        vertexC.addNeighbour(new Kenar(4, vertexC, vertexE));
        vertexC.addNeighbour(new Kenar(2, vertexC, vertexF));
        vertexD.addNeighbour(new Kenar(1, vertexD, vertexE));
        vertexD.addNeighbour(new Kenar(8, vertexD, vertexF));
        vertexB.addNeighbour(new Kenar(2, vertexB, vertexA));
        vertexD.addNeighbour(new Kenar(6, vertexD, vertexA));
        vertexE.addNeighbour(new Kenar(3, vertexE, vertexB));
        vertexC.addNeighbour(new Kenar(9, vertexC, vertexB));
        vertexD.addNeighbour(new Kenar(7, vertexD, vertexC));
        vertexE.addNeighbour(new Kenar(4, vertexE, vertexC));
        vertexF.addNeighbour(new Kenar(2, vertexF, vertexC));
        vertexE.addNeighbour(new Kenar(1, vertexE, vertexD));
        vertexF.addNeighbour(new Kenar(8, vertexF, vertexD));

        EnKisaYol shortestPath = new EnKisaYol();
        shortestPath.BilYol(vertexA);

      
        System.out.println("A ve B En kısa Yol : " + vertexB.getDistance());
        System.out.println("A ve D En kısa Yol: " + vertexD.getDistance());
        System.out.println("A ve C En kısa Yol: " + vertexC.getDistance());
        System.out.println("A ve E En kısa Yol : " + vertexE.getDistance());
        System.out.println("A ve D En kısa Yol: " + vertexD.getDistance());
        System.out.println("A ve F En kısa Yol: " + vertexF.getDistance());
        System.out.println("A ve E En kısa Yol: " + vertexE.getDistance());
        System.out.println("A ve F En kısa Yol: " + vertexF.getDistance());

        System.out.println("=====================	=================");
        System.out.println("Gidiş yolları");
        System.out.println("======================================");

        System.out.println(" A ve B: " + shortestPath.EnKisaYol(vertexB));
        System.out.println(" A ve D: " + shortestPath.EnKisaYol(vertexD));
        System.out.println(" A ve C: " + shortestPath.EnKisaYol(vertexC));
        System.out.println(" A ve E: " + shortestPath.EnKisaYol(vertexE));
        System.out.println(" A ve D: " + shortestPath.EnKisaYol(vertexD));
        System.out.println(" A ve F: " + shortestPath.EnKisaYol(vertexF));
        System.out.println(" A ve E: " + shortestPath.EnKisaYol(vertexE));
        System.out.println(" A ve F: " + shortestPath.EnKisaYol(vertexF));

    }
}
