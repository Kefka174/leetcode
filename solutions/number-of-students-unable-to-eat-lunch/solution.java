import java.util.Queue;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
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
}