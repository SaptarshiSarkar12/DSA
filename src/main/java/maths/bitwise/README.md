## BitWise Operators

Bitwise operators are used to perform operations on individual bits of data. They are commonly used in low-level programming, such as embedded systems and performance-critical applications. Here are some common bitwise operators:

- `&` (AND): Returns 1 if both bits are 1, otherwise returns 0.
- `|` (OR): Returns 1 if at least one of the bits is 1, otherwise returns 0.
- `^` (XOR): Returns 1 if the bits are different, otherwise returns 0.
- `~` (NOT): Inverts the bits (0 becomes 1 and 1 becomes 0).
- `<<` (Left Shift): Shifts the bits to the left by a specified number of positions, filling the rightmost bits with 0.
- `>>` (Right Shift): Shifts the bits to the right by a specified number of positions. The leftmost bits are filled with the sign bit (0 for positive numbers and 1 for negative numbers).

## Questions

1. [**Check if a number is odd or even**](./questions/OddOrEven.java) - Given an integer, determine if it is odd or even using bitwise operators.
2. [**Count the number of set bits in an integer**](./questions/CountSetBits.java) - Given an integer, count the number of bits that are set to 1.
3. [**Find the unique number in an array**](./questions/FindUniqueNumber.java) - Given an array of integers where every element appears twice except for one, find the unique element using bitwise operators.
4. [**Find the ith bit**](./questions/FindIthBit.java) - Given an integer and a position, find the value of the bit at that position.
5. [**Set the ith bit**](./questions/SetIthBit.java) - Given an integer and a position, set the bit at that position to 1.
6. [**Clear the ith bit**](./questions/ClearIthBit.java) - Given an integer and a position, clear the bit at that position (set it to 0).
7. [**Toggle the ith bit**](./questions/ToggleIthBit.java) - Given an integer and a position, toggle the bit at that position (if it's 0, set it to 1; if it's 1, set it to 0).
8. [**Find the position of the rightmost set bit**](./questions/RightmostSetBit.java) - Given an integer, find the position of the rightmost set bit (the first bit from the right, which is set to 1).
9. [**Find unique number in an array where every element appears thrice except for one**](./questions/FindUniqueNumberThrice.java) - Given an array of integers where every element appears three times except for one, find the unique element using bitwise operators.
10. [**Find the nth magic number**](./questions/NthMagicNumber.java) - Given an integer n, find the nth magic number using bitwise operators. A magic number is defined as a number that can be expressed as a sum of distinct powers of 5 (e.g., 1, 5, 25, 125, etc.).
11. [**Find the number of digits in the base b representation of a number**](./questions/NumberOfDigitsInBase.java) - Given an integer and a base, find the number of digits required to represent the integer in that base using bitwise operators.
12. [**Find the sum of nth row of Pascal's triangle**](./questions/SumOfNthRowOfPascalsTriangle.java) - Given an integer n, find the sum of the nth row of Pascal's triangle using bitwise operators. The sum of the nth row of Pascal's triangle is equal to 2^n.
13. [**Check if a number is a power of 2**](./questions/PowerOfTwo.java) - Given an integer, determine if it is a power of 2 using bitwise operators. A number is a power of 2 if it has exactly one bit set to 1 (e.g., 1, 2, 4, 8, etc.).
14. [**Find a raised to the power of b**](./questions/PowerOfNumber.java) - Given two integers a and b, find a raised to the power of b using bitwise operators.
15. [**Find XOR of numbers from 0 to a**](./questions/XORFromZeroToA.java) - Given an integer a, find the XOR of all numbers from 0 to a using bitwise operators.
16. [**Find XOR of numbers in a range**](./questions/XORInRange.java) - Given two integers a and b, find the XOR of all numbers in the range from a to b using bitwise operators.
17. [**[832] Flipping an Image**](./questions/FlippingAnImage.java) - [Given a binary matrix representing an image, flip the image horizontally and then invert it using bitwise operators.](https://leetcode.com/problems/flipping-an-image/description/)