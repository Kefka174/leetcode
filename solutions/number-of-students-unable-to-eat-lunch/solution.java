import java.util.Queue;

class Solution {
    public int countStudentsSimulation(int[] students, int[] sandwiches) { // O(n^2)
        Queue<Integer> studentQueue = new ArrayDeque<>(students.length);
        for (int student : students) studentQueue.add(student);
        int numStudentsNotEating = 0, sandwichIndex = 0;
        while (numStudentsNotEating < studentQueue.size()) {
            if (studentQueue.peek() == sandwiches[sandwichIndex]) {
                studentQueue.poll();
                numStudentsNotEating = 0;
                sandwichIndex++;
            }
            else {
                studentQueue.add(studentQueue.poll());
                numStudentsNotEating++;
            }
        }
        return numStudentsNotEating;
    }

    ///////////////////////////////////////////////////////////////////////////
    public int countStudents(int[] students, int[] sandwiches) { // O(n)
        int circularStudents = 0, squareStudents = 0;
        for (int student : students) {
            if (student == 0) circularStudents++;
            else squareStudents++;
        }
        for (int sandwich : sandwiches) {
            if (sandwich == 0 && circularStudents > 0) circularStudents--;
            else if (sandwich == 1 && squareStudents > 0) squareStudents--;
            else return circularStudents + squareStudents;
        }
        return 0;
    }
}