class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hashSet = set()
        for num in nums:
            hashSet.add(num)
        
        maxCount=0
        for num in nums:
            now = num
            Count = 0
            while now in hashSet:
                hashSet.remove(now)
                Count=Count+1
                now=now-1
            now = num+1
            while now in hashSet:
                hashSet.remove(now)
                Count=Count+1
                now=now+1
            maxCount=max(Count,maxCount)
        return maxCount