/**
 * 
 */
package shortestPath;

import java.util.Arrays;

/**
 * @author Owner
 *
 */
class DijkstraAlg {
	int currentVertex;
	int MAXV;
	int start = 226;
	int MAXINT = 9999;
	int w;
	int currentOptimalWeight;
	int dist;
	Boolean[] inTree = new Boolean[MAXV + 1];
	Integer[] distance = new Integer[MAXV + 1];
	Integer[] parent = new Integer[MAXV + 1];

	/**
		 * 
		 */
	public DijkstraAlg() {
		Arrays.fill(inTree, Boolean.FALSE);
		Arrays.fill(distance, MAXINT);
		Arrays.fill(parent, -1);
		distance[start]= 0;
	currentVertex = start;
	while(!inTree[currentVertex]){
	inTree[currentVertex] = Boolean.TRUE;
	}

}
}