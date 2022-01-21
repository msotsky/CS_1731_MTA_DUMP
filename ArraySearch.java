public class ArraySearch
{
    public static int search(int[] x, int target){
        return Integer.MIN_VALUE;
    }

    public class ArraySearchTest{
        
        @Test
        public void itemNotFirstElementInSingleElementArray(){
            int [] x = {5};
            assertEquals(-1, ArraySearch.search(x ,10));
        }
    }
}