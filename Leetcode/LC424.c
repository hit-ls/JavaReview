int characterReplacement(char * s, int k){
    int res = 0;
    int slow = 0;
    int fast;
    int map[26] = {0};
    int len = strlen(s);
    int idx;
    for (fast = 0; fast < len; fast++) {
        idx = s[fast] - 'A'; // 0-25分别存储字符个数
        map[idx]++;
        res = res < map[idx] ? map[idx] : res;
        if (fast - slow + 1 - res > k) {
            idx = s[slow] - 'A';
            map[idx]--;
            slow++;
        }
    }
    return len - slow;
}
