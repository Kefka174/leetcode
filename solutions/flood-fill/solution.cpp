#include <vector>
#include <queue>
using namespace std;

void cardinalAddToQueue(vector<vector<int>> image, pair<int, int> pixel, int originalColor, queue<pair<int, int>> &q) {
    // check rows
    if (pixel.first > 0 && image[pixel.first - 1][pixel.second] == originalColor) { // check above
        q.push(pair(pixel.first - 1, pixel.second));
    }
    if (pixel.first < image.size() - 1 && image[pixel.first + 1][pixel.second] == originalColor) { // check below
        q.push(pair(pixel.first + 1, pixel.second));
    }
    // check columns
    if (pixel.second > 0 && image[pixel.first][pixel.second - 1] == originalColor) { // check left
        q.push(pair(pixel.first, pixel.second - 1));
    }
    if (pixel.second < image[pixel.first].size() - 1 && image[pixel.first][pixel.second + 1] == originalColor) { // check right
        q.push(pair(pixel.first, pixel.second + 1));
    }
}

vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) {
    int originalColor = image[sr][sc];
    if (originalColor == color) return image;

    queue<pair<int, int>> pixelsToRecolor;
    pixelsToRecolor.push(pair(sr,sc));
    while (!pixelsToRecolor.empty()) {
        pair<int, int> pixel = pixelsToRecolor.front();
        pixelsToRecolor.pop();
        // recolor
        image[pixel.first][pixel.second] = color;
        // check cardinally and add to queue
        cardinalAddToQueue(image, pixel, originalColor, pixelsToRecolor);
    }
    return image;
}