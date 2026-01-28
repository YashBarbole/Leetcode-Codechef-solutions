def get_second_order_elements(arr):
    if len(arr) < 2:
        return [-1, -1]  # Invalid case
    
    # Initialize variables
    largest = second_largest = float('-inf')
    smallest = second_smallest = float('inf')
    
    # Single pass to find both second largest and second smallest
    for num in arr:
        # Update largest and second largest
        if num > largest:
            second_largest = largest
            largest = num
        elif num < largest and num > second_largest:
            second_largest = num
            
        # Update smallest and second smallest
        if num < smallest:
            second_smallest = smallest
            smallest = num
        elif num > smallest and num < second_smallest:
            second_smallest = num
            
    return [second_largest, second_smallest]

def main():
    try:
        n = int(input("Enter the size of the array: "))
        if n < 2:
            print("Array must have at least two elements!")
            return
        
        # Get input array
        print("Enter the elements of the array (space-separated):")
        arr = list(map(int, input().split()))
        
        if len(arr) != n:
            print(f"Please enter exactly {n} numbers!")
            return
        
        result = get_second_order_elements(arr)
        print(f"Second Largest Element: {result[0]}")
        print(f"Second Smallest Element: {result[1]}")
        
    except ValueError:
        print("Please enter valid integer numbers!")

if __name__ == "__main__":
    main() 