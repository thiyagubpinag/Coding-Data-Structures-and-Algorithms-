package com.testing;

import java.util.LinkedList;
import java.util.Queue;

import com.testing.BinaryMaze.Point;

public class Maze {

	static int ROW = 9;
	static int COL = 10;

	static class Point {
		int x;
		int y;

		Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

	}

	static class QueueNode {
		Point p;
		int dist;

		QueueNode(Point p, int dist) {
			super();
			this.p = p;
			this.dist = dist;
		}

	}

	static int rows[] = { -1, 0, 0, 1 };
	static int cols[] = { 0, -1, 1, 0 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][] = { { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
				{ 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
				{ 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 } };

		Point source = new Point(0, 0);
		Point dest = new Point(3, 4);

		int dist = BFS(mat, source, dest);

		System.out.println(dist);
	}

	private static int BFS(int[][] mat, Point source, Point dest) {
		// TODO Auto-generated method stub

		if (mat[dest.x][dest.y] != 1) {
			return -1;
		}

		Queue<QueueNode> queue = new LinkedList();

		queue.add(new QueueNode(source, 0));

		boolean[][] visited = new boolean[ROW][COL];

		visited[source.x][source.y] = true;

		while (!queue.isEmpty()) {
			QueueNode curr = queue.peek();

			Point currPoint = curr.p;

			if (currPoint.x == dest.x && currPoint.y == dest.y) {
				return curr.dist;
			}

			int distance = curr.dist;

			queue.remove();

			for (int i = 0; i < 4; i++) {
				int row = rows[i] + currPoint.x;
				int col = cols[i] + currPoint.y;

				if (isValid(row, col) && mat[row][col] == 1 && !visited[row][col]) {
					visited[source.x][source.y] = true;
					queue.add(new QueueNode(new Point(row, col), distance + 1));

				}

			}

		}

		return -1;
	}

	private static boolean isValid(int row2, int col2) {
		// TODO Auto-generated method stub
		return (row2 >= 0 && row2 < ROW && col2 >= 0 && col2 < COL);
	}

}
