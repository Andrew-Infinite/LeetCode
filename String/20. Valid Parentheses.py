class Solution:
    def isValid(self, s: str) -> bool:
        lst=[]
        dic={'(':')','{':'}','[':']'}
        left="([{"
        for i in s:
            if i in left:
                lst.append(dic[i])
            elif lst and lst[-1]==i:
                lst.pop()
            else:return False
        return not lst