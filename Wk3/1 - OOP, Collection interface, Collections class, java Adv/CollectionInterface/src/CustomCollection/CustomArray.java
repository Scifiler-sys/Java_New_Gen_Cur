package CustomCollection;

import java.util.Iterator;

/*
    Iterable essentially enables your custom DS to be used in for enhanced loop
    It hence they named it "iterable" meaning now you can iterate through this specific class
*/

public class CustomArray implements Iterable<Integer>{
    private int[] someArray;

    public CustomArray(int size) {
        someArray = new int[size];
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return new CustomArrayIterator(this);
    }

    public int[] getSomeArray() {
        return someArray;
    }

    public void setSomeArray(int[] someArray) {
        this.someArray = someArray;
    }


    /*
        * Iterator interface essentially what tells the foreach how to iterate through your Data Structure
        * it has two abstract methods we have to implement to make it work
    */
    class CustomArrayIterator implements Iterator<Integer>
    {
        private CustomArray cArray;
        private int currentIndex;

        public CustomArrayIterator(CustomArray cArray) {
            this.cArray = cArray;
            currentIndex = 0;
        }

        //This one checks if there is any value left
        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            if (currentIndex < cArray.getSomeArray().length) 
                return true;

            return false;
        }

        //This one returns the current value then goes to the next value
        @Override
        public Integer next() {
            int nextVal = cArray.getSomeArray()[currentIndex++];
            return nextVal;
        }

    }
}
