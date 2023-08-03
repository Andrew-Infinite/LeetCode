class Solution:
    def temp(self, digits: List[int], index: int):
        if(digits[index]<10):
            return digits[index]
        elif index>=len(digits)-1:
            digits.append(1)
        else:
            digits[index+1] = digits[index+1] + 1
        return digits[index]-10
    def plusOne(self, digits: List[int]) -> List[int]:
        digits.reverse()
        digits[0] = digits[0]+1
        digits = [self.temp(digits,i) for i, num in enumerate(digits)]
        digits.reverse()
        return digits