
class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            int oldX = x, oldY = y;
            char ch = path.charAt(i);
            if (ch == 'N') y++;
            else if (ch == 'S') y--;
            else if (ch == 'E') x++;
            else if (ch == 'W') x--;
            if (x == 0 && y == 0) {
                return true;
            }
            int a = 0, b = 0;
            for (int j = 0; j < i; j++) {
                char c = path.charAt(j);
                if (c == 'N') b++;
                else if (c == 'S') b--;
                else if (c == 'E') a++;
                else if (c == 'W') a--;
                if (a == x && b == y) {
                    return true;
                }
            }
        }
        return false;
    }
}
