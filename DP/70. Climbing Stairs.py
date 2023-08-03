class Solution:
    def climbStairs(self, n: int) -> int:
        if n==1:
            return 1
        p1 = 1
        p2 = 2
        for cnt in range(2,n):
            tmp = p1
            p1 = p2
            p2 = tmp + p1
        return p2