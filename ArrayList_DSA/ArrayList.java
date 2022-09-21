import javax.lang.model.element.Element;

public class ArrayList<E> implements BareBonesArrayList <E>
{
    //Data
    private int size; //[ x , x , x ]
    private int capacity; // E.length -1;
    private E[] myArray ; // reff to array
    private static final int INITIAL_CAPACITY = 10; // Default capacity

    ArrayList ()     // DVC 
    {
        this.capacity = this.INITIAL_CAPACITY;
        this.size = 0; // base case
        myArray = (E[]) new Object[this.capacity]; // gen the array - instance
    }

    ArrayList ( int capacity )     // EVC 
    {
        this.capacity = capacity;
        this.size = 0;
        myArray = (E[]) new Object[this.capacity];


    }


    @Override // add function
    public void add(E elements) 
    {
        if ( this.size < this.capacity ){   
            myArray[size] = elements;  
            size ++;
        
        } else{
            System.out.println("One moment... re-allocating space (= ");
            this.re_allocate(); // neither this
            this.add(elements); //ion get this
            
        }

        
    }

    private void re_allocate() 
    {
        this.capacity *= 2; // arr.length * 2 
        E[] temp = (E[]) new Object[this.capacity]; // new instance of object - gen arr
        for (int i=0; i < myArray.length; ++ i )
        {
            temp[i] = myArray[i];
        
        } this.myArray = temp;
    }

    @Override
    public void add(E elements, int index) {
        
    }

    @Override
    public E remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void set(E elements, int index) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int indexOf(E elements) {
        // TODO Auto-generated method stub
        return 0;
    }

    public String toString()
    {
        String s = " " ;
        for ( int i = 0 ; i < this.size; ++ i) // iterate ~ size;
        {
            s = s + " [" +myArray[i]+ "] ";
    
        } return  s;
    }








    
}
