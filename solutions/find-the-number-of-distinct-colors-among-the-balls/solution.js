/**
 * @param {number} limit
 * @param {number[][]} queries
 * @return {number[]}
 */
var queryResults = function(limit, queries) {
    const colorFrequency = new Map();
    const ballColors = new Array(limit + 1);
    const results = new Array(queries.length);

    for (let i = 0; i < queries.length; i++) {
        const [ball, color] = queries[i];

        const prevColor = ballColors[ball];
        if (prevColor) {
            colorFrequency.set(prevColor, colorFrequency.get(prevColor) - 1);
            if (colorFrequency.get(prevColor) === 0) {
                colorFrequency.delete(prevColor);
            }
        }

        ballColors[ball] = color;
        colorFrequency.set(color, (colorFrequency.get(color) ?? 0) + 1);

        results[i] = colorFrequency.size;
    }
    return results;
};