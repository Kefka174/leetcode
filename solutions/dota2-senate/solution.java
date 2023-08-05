import java.util.Deque;

class Solution {
    public String predictPartyVictory(String senate) {
        int rSenators = 0, dSenators = 0;
        Deque<Character> senateOrder = new ArrayDeque<>(senate.length());
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') rSenators++;
            else dSenators++;
            senateOrder.add(senate.charAt(i));
        }

        int rVotesPending = 0, dVotesPending = 0;
        while (rSenators > 0 && dSenators > 0) {
            char currentSenator = senateOrder.poll();
            if (currentSenator == 'R' && dVotesPending > 0) {
                rSenators--;
                dVotesPending--;
            }
            else if (currentSenator == 'D' && rVotesPending > 0) {
                dSenators--;
                rVotesPending--;
            }
            else {
                if (currentSenator == 'R') rVotesPending++;
                else dVotesPending++;
                senateOrder.add(currentSenator);
            }
        }

        if (dSenators == 0) return "Radiant";
        else return "Dire";
    }
}