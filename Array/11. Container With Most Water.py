class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        lo=0
        hi = len(height)-1
        maxArea = 0
        while lo<hi:
            h = height[lo] if height[lo]<height[hi] else height[hi]
            Area = h*(hi-lo)
            maxArea = Area if Area>maxArea else maxArea
            if height[lo]<height[hi]:
                lo += 1
            else:
                hi -= 1
        return maxArea