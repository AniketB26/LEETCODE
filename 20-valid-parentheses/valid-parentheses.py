class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        bracket = {")" : "(" , "}" : "{" , "]" : "["} 

        for ch in s:
            if ch in bracket:
                if not stack or stack[-1] != bracket[ch]:
                    return False
                stack.pop()
            else:
                stack.append(ch)
        
        return stack == []