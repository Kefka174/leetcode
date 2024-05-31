/**
 * @param {string} s
 * @return {number}
 */
var countAsterisks = function(s) {
    let asteriskCount = 0;
    let insidePair = false;
    for (let i = 0; i < s.length; i++) {
        if (s[i] === '*' && !insidePair) {
            asteriskCount++;
        }
        else if (s[i] === '|') {
            insidePair = !insidePair;
        }
    }
    return asteriskCount;
};