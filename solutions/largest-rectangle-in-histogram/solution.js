/**
 * @param {number[]} heights
 * @return {number}
 */
var largestRectangleArea = function(heights) {
    const rectStarts = [{height: heights[0], startIndex: 0}];
    let maxArea = 0;
    for (let i = 0; i < heights.length; i++) {
        let nextIndex = i + 1;
        let nextHeight = (i + 1 === heights.length) ? 0 : heights[i + 1];

        while (rectStarts.length && rectStarts[rectStarts.length - 1].height >= nextHeight) {
            let {height, startIndex} = rectStarts.pop();
            maxArea = Math.max(maxArea, height * (i - startIndex + 1));
            nextIndex = startIndex;
        }
        rectStarts.push({height: nextHeight, startIndex: nextIndex});
    }
    return maxArea;
};