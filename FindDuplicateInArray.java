class FindDuplicateInArray
{
    // Function to find a duplicate element in a limited range array
    public static int findDuplicate(int[] nums)
    {
        int duplicate = -1;

        // do for each array element
        for (int i: nums)
        {
            // get the value of the current element
            int val = (i < 0) ? -i : i;

            // make element at index `val` negative if it is positive
            if (nums[val] >= 0)
            {
                nums[val] = -nums[val];
            }
            else
            {
                // if the element is already negative, it is repeated
                duplicate = val;
                break;
            }
        }

        // restore the original array before returning
        for (int i = 0; i < nums.length; i++)
        {
            // make negative elements positive
            if (nums[i] < 0)
            {
                nums[i] = -nums[i];
            }
        }

        // return duplicate element
        return duplicate;
    }

    public static void main (String[] args)
    {
        // input array contains `n` numbers between 1 and `n-1`
        // with one duplicate, where `n` is the array's length
        int[] nums = { 1, 2, 3, 4, 2 };

        System.out.println("The duplicate element is " + findDuplicate(nums));
    }
}
