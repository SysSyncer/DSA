def find_repeating_missing_numbers(arr: list[int]) -> list[int]:
    n = len(arr)
    xor = 0
    for i in range(n):
        xor = xor ^ arr[i]
        xor = xor ^ (i + 1)
    rightmost_set_bit = xor & ~(xor - 1)
    x = 0
    y = 0
    for num in arr:
        if num & rightmost_set_bit:
            x = x ^ num
        else:
            y = y ^ num

    for i in range(1, n + 1):
        if i & rightmost_set_bit:
            x = x ^ i
        else:
            y = y ^ i

    if x in arr:
        return [x, y]
    else:
        return [y, x]


if __name__ == "__main__":
    arr = [4, 3, 6, 2, 1, 1]
    ans = find_repeating_missing_numbers(arr)
    print("Repeating Number: ", ans[0])
    print("Missing Number: ", ans[1])
