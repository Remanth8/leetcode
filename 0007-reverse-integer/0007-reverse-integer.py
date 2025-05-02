class Solution:
    def reverse(self, x: int) -> int:
        min_val= -(2**31)
        max_val= (2**31)-1
        sign= -1 if x<0 else 1
        reverse_x = sign * int(str(abs(x))[::-1])
        return 0 if reverse_x <= min_val or reverse_x >= max_val else reverse_x
        