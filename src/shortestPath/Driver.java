/**
 * 
 */
package shortestPath;

/**
 * @author Owner
 *
 */
class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		long startTime;
		long endTime;
		long elapsedTime;
		double seconds;
		startTime = System.nanoTime();
		// new LineMaker();
		// new GraphAdjHasher();
		// new AdjacencyChecker();
		new DijkstraAlg();
		endTime = System.nanoTime();
		elapsedTime = (endTime - startTime);
		seconds = (double) elapsedTime / 1000000000.0;
		System.out.println(" ");
		System.out.println("Took " + elapsedTime + " ns");
		System.out.println("Took " + seconds + "seconds");
	}

}
